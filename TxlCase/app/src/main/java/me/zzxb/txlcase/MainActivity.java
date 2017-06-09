package me.zzxb.txlcase;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.List;

import me.zzxb.txlcase.pojo.ResUsers;
import me.zzxb.txlcase.pojo.ResponseObj2;
import me.zzxb.txlcase.tools.HttpUtil;

public class MainActivity extends Activity {
    private Button btnMainRegSubmit = null;
    private Button btnMainLoginSubmit = null;
    private EditText etLoginUserName = null;
    private EditText etLoginPassWord = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMainRegSubmit = (Button)findViewById(R.id.btnMainRegSubmit);
        btnMainLoginSubmit = (Button)findViewById(R.id.btnMainLoginSubmit);
        etLoginUserName = (EditText)findViewById(R.id.etMainUserName);
        etLoginPassWord = (EditText)findViewById(R.id.etMainPassWord);

        btnMainLoginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String uName = etLoginUserName.getText().toString();
                final String uPwd = etLoginPassWord.getText().toString();

                if(uName.equals("") || uPwd.equals("")){
                    Toast.makeText(MainActivity.this,"对不起，用户名或密码不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }

                String url = HttpUtil.API_URL + "/cxuser/" + uName;

                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

                StringRequest request = new StringRequest(url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        ResponseObj2 res = JSON.parseObject(response,ResponseObj2.class);

                        if(res.getStatus().equals("200")){
                            List<ResUsers> data = res.getData();
                            ResUsers myUser = data.get(0);
                            if(myUser != null){
                                if(myUser.getUpwd().equals(uPwd)){
                                    //保存用户信息
                                    SharedPreferences sp = getSharedPreferences("user",MODE_PRIVATE);
                                    SharedPreferences.Editor editor = sp.edit();
                                    editor.putString("uname",uName);
                                    editor.commit();
                                    Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(MainActivity.this,IndexActivity.class);
                                    startActivity(intent);
                                }else{
                                    Toast.makeText(MainActivity.this,"对不起，用户名或密码错误！",Toast.LENGTH_SHORT).show();
                                }
                            }
                        }else{
                            Toast.makeText(MainActivity.this,"对不起，服务器异常！",Toast.LENGTH_SHORT).show();
                            return;
                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getStackTrace();
                    }
                });

                queue.add(request);


            }
        });

        btnMainRegSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegActivity.class);
                startActivity(intent);
            }
        });

    }
}

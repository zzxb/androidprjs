package me.zzxb.txlcase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

import java.util.logging.Logger;

import me.zzxb.txlcase.pojo.ResponseObj;
import me.zzxb.txlcase.tools.HttpUtil;

public class RegActivity extends Activity {
    private EditText etRegUserName = null;
    private EditText etRegPassWord = null;
    private EditText etRegRePassWord = null;
    private Button btnRegSubmit = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        etRegUserName = (EditText)findViewById(R.id.etRegUserName);
        etRegPassWord = (EditText)findViewById(R.id.etRegPassWord);
        etRegRePassWord = (EditText)findViewById(R.id.etRegRePassWord);

        btnRegSubmit = (Button)findViewById(R.id.btnRegSubmit);

        btnRegSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = etRegUserName.getText().toString();
                String passWord = etRegPassWord.getText().toString();
                String rePassWord = etRegRePassWord.getText().toString();

                if(userName.equals("") || passWord.equals("") || rePassWord.equals("")){
                    Toast.makeText(RegActivity.this,"对不起，用户名或密码不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!passWord.equals(rePassWord)){
                    Toast.makeText(RegActivity.this,"对不起，密码不相同!",Toast.LENGTH_SHORT).show();
                    return;
                }

                /**
                 * 异步网络API调用,使用Volley
                 */
                //1.生成RequestQueue

                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

                //2.生成StringRequest对象
                /**
                 * 本地服务的地址不能是：localhost/127.0.0.1，本地ip地址:10.0.2.2
                 */

                String url = HttpUtil.API_URL + "/tjuser/" + userName + "/" + passWord;

                StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        ResponseObj obj =  JSON.parseObject(response, ResponseObj.class);
                        if(obj.getStatus().equals("200")){
                            Toast.makeText(RegActivity.this,obj.getMsg(),Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(RegActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });

                queue.add(request);



            }
        });


    }
}

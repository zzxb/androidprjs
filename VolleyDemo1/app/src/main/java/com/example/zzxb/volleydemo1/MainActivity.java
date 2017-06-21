package com.example.zzxb.volleydemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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
import com.example.zzxb.tools.DataUtil;
import com.example.zzxb.tools.JsonObject;
import com.example.zzxb.tools.Users;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn = null;
    private Button regBtn = null;
    private EditText etUserName = null;
    private EditText etPassWord = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button)findViewById(R.id.btnLogin);
        regBtn = (Button)findViewById(R.id.btnReg);
        etUserName = (EditText)findViewById(R.id.etUserName);
        etPassWord = (EditText)findViewById(R.id.etUpwd);


        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegActivity.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = etUserName.getText().toString();
                final String upwd = etPassWord.getText().toString();
                RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
                String url = DataUtil.API_URL + "/cxuser/" + uname;
                StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JsonObject obj = JSON.parseObject(response,JsonObject.class);
                        if(obj.getStatus().equals("200")){
                            List<Users> data = (List<Users>)obj.getData();
                            Users myUser = data.get(0);
                            if(myUser.getUpwd().equals(upwd)){
                                Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity.this,IndexActivity.class);
                                startActivity(intent);
                            }
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getStackTrace();
                    }
                });
                mQueue.add(request);
            }
        });

    }
}

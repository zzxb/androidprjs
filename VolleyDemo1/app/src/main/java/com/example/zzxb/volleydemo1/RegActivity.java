package com.example.zzxb.volleydemo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.zzxb.tools.DataUtil;
import com.example.zzxb.tools.JsonObject;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class RegActivity extends AppCompatActivity {
    private EditText etRegUserName = null;
    private EditText etRegPassWord = null;
    private Button btnRegSubmit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        etRegUserName = (EditText)findViewById(R.id.etRegUserName);
        etRegPassWord = (EditText)findViewById(R.id.etRegPassWord);
        btnRegSubmit = (Button)findViewById(R.id.regSubmitBtn);
        btnRegSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String uname = etRegUserName.getText().toString();
                final String upwd = etRegPassWord.getText().toString();
                RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
                String url = DataUtil.API_URL + "/tjuser/"+uname + "/" + upwd;
                StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JsonObject ff =  JSON.parseObject(response, JsonObject.class);
                        if(ff.getStatus().equals("200")){
                            Toast.makeText(RegActivity.this,"注册成功！",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(RegActivity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("error",error.getMessage());
                    }
                });
                mQueue.add(request);
            }
        });
    }
}

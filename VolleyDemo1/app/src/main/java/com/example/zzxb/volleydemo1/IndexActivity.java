package com.example.zzxb.volleydemo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.zzxb.tools.DataUtil;
import com.example.zzxb.tools.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class IndexActivity extends Activity {
    private ListView myList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        myList = (ListView)findViewById(R.id.myList);
        String url = DataUtil.API_URL + "/cxalllxr/zzxb";
        RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JsonObject obj = JSON.parseObject(response,JsonObject.class);
                if(obj.getStatus().equals("200")){
                    List<String> mydata = new ArrayList<>();
                    for(int i = 0;i < obj.getData2().size();i++){
                        mydata.add(obj.getData2().get(i).getLxrtel());
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(IndexActivity.this,android.R.layout.simple_list_item_1,mydata);
                    myList.setAdapter(arrayAdapter);
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

}

package me.zzxb.txlcase;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

import me.zzxb.txlcase.adapter.MyAdapter;
import me.zzxb.txlcase.pojo.ResLxr;
import me.zzxb.txlcase.pojo.ResponseObj2;
import me.zzxb.txlcase.pojo.ResponseObj3;
import me.zzxb.txlcase.tools.HttpUtil;

import static android.R.layout.simple_list_item_1;

public class IndexActivity extends Activity {
    private ListView myListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        SharedPreferences sp = getSharedPreferences("user",MODE_PRIVATE);

        myListView = (ListView)findViewById(R.id.myListView);

        String url = HttpUtil.API_URL + "/cxalllxr/" + sp.getString("uname","");

        final RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                ResponseObj3 res = JSON.parseObject(response,ResponseObj3.class);

                if(res.getStatus().equals("200")){
                    List<ResLxr> data = res.getData();
                    MyAdapter adapter = new MyAdapter(IndexActivity.this,queue,data);
                    myListView.setAdapter(adapter);
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
}

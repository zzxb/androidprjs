package me.zzxb.pullrefreshdemo2.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

import me.zzxb.pullrefreshdemo2.R;
import me.zzxb.pullrefreshdemo2.adapter.ProductAdapter;
import me.zzxb.pullrefreshdemo2.helper.JSONResObj;
import me.zzxb.pullrefreshdemo2.helper.Product;
import me.zzxb.pullrefreshdemo2.tools.HttpUtil;

public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener{
    private ListView myList = null;
    private List<Product> list = null;
    private SwipeRefreshLayout swipeRefreshLayout = null;
    private int dataStart = 0;
    ProductAdapter adapter = null;
    RequestQueue queue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = (ListView)findViewById(R.id.myProductList);
        swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout);

        list = new ArrayList<>();
        adapter = new ProductAdapter(MainActivity.this,list);
        myList.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(this);

        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
                fetchData();
            }
        });

    }

    @Override
    public void onRefresh() {
        fetchData();
    }

    private void fetchData(){
        swipeRefreshLayout.setRefreshing(true);

        String url = HttpUtil.API_URL + "/cxfy/" + dataStart;
        queue = Volley.newRequestQueue(getApplicationContext());
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONResObj res = JSON.parseObject(response,JSONResObj.class);
                List<Product> tmp = res.getData();
                for (Product p: tmp) {
                    list.add(0,p);
                }
                adapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
                dataStart = + 10;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.getStackTrace();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        queue.add(request);

    }
}

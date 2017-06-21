package me.zzxb.myskshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import me.zzxb.myskshop.adapter.ProductListAdapter;
import me.zzxb.myskshop.pojo.ResObj;
import me.zzxb.myskshop.tools.HttpUtil;

public class ProductListByCategoryActivity extends Activity {
    private ListView myProductCategoryList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list_by_category);

        myProductCategoryList = (ListView)findViewById(R.id.myProductListCategroy);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String cid = bundle.getString("cid");

        final RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        String url = HttpUtil.API_URL + "/cxbycid/" + cid;

        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                ResObj obj = JSON.parseObject(response,ResObj.class);
                if(obj.getStatus().equals("200")){
                    ProductListAdapter adapter = new ProductListAdapter(queue,ProductListByCategoryActivity.this,obj.getData(),true);
                    myProductCategoryList.setAdapter(adapter);
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

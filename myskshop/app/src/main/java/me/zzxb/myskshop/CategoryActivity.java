package me.zzxb.myskshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

import me.zzxb.myskshop.pojo.ResCategory;
import me.zzxb.myskshop.pojo.ResObj2;
import me.zzxb.myskshop.tools.HttpUtil;

public class CategoryActivity extends Activity {

    private ListView myCategoryList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        myCategoryList = (ListView)findViewById(R.id.myCategoryList);

        String url = HttpUtil.API_URL + "/cxtypeall";


        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                ResObj2 obj = JSON.parseObject(response,ResObj2.class);
                if(obj.getStatus().equals("200")){

                    //显示数据
                    List<String> data = new ArrayList<>();
                    final List<ResCategory> resData = obj.getData();
                    for (int i = 0;i < resData.size();i++){
                        data.add(resData.get(i).getCname());
                    }
                    ArrayAdapter adapter = new ArrayAdapter(CategoryActivity.this,android.R.layout.simple_list_item_1,data);
                    myCategoryList.setAdapter(adapter);

                    //监听事件

                    myCategoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            //Toast.makeText(CategoryActivity.this,""+resData.get(position).getCid(),Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(CategoryActivity.this,ProductListByCategoryActivity.class);

                            Bundle bundle = new Bundle();
                            bundle.putString("cid",resData.get(position).getCid());

                            intent.putExtras(bundle);
                            startActivity(intent);

                        }
                    });

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

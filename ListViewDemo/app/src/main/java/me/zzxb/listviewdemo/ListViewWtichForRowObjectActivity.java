package me.zzxb.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewWtichForRowObjectActivity extends Activity {
    private ListView myListView = null;
    private List<Map<String,Object>> data = new ArrayList<Map<String, Object>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_wtich_for_row_object);

        myListView = (ListView)findViewById(R.id.myListView);

        //准备数据
        for(int i = 0;i < 50;i++){
            Map<String,Object> row = new HashMap<String,Object>();
            row.put("productName","笔记本电脑" + i);
            row.put("time","成色：" + (int)(Math.random()*10)+"新 " + (int)(Math.random()*10)+"小时发布");
            row.put("address","山东 济南");
            row.put("price",(int)(Math.random()*10000)+"元");
            data.add(row);

        }

        //生成adapter

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,data,R.layout.item_list
                ,new String[]{"productName","time","address","price"}
                ,new int[]{R.id.line_productName,R.id.line_time,R.id.line_address,R.id.line_price});

        //装配

        myListView.setAdapter(simpleAdapter);

        //点击某一个item监听

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String,Object> row = data.get(position);
                Intent intent = new Intent();
                intent.setClass(ListViewWtichForRowObjectActivity.this,DetailProductActivity.class);
                intent.putExtra("productName", row.get("productName").toString());
                Bundle bundle = new Bundle();
                MapSerializable mapSerializable = new MapSerializable();
                mapSerializable.setMap(row);
                bundle.putSerializable("row",mapSerializable);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

}

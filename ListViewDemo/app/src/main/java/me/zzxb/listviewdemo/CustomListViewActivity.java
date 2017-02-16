package me.zzxb.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CustomListViewActivity extends Activity {
    private ListView myListView = null;

    private List<Map<String,Object>> data = new ArrayList<Map<String, Object>>();

    private int[] imgs = {R.drawable.neicun1,R.drawable.neicun2,R.drawable.neicun3,R.drawable.neicun4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Goals.init(this);
        setContentView(R.layout.activity_custom_list_view);

        myListView = (ListView)findViewById(R.id.cListView);

        Random r = new Random();

        for (int i = 0;i < 30;i++){
            Map<String,Object> row = new HashMap<String,Object>();
            row.put("myPic",imgs[r.nextInt(imgs.length)]);
            row.put("myProductName","三星内存" + i + "G");
            row.put("myTime","成色：" + (int)(Math.random()*10)+"新 " + (int)(Math.random()*10)+"小时发布");
            row.put("myAddress","山东 济南");
            row.put("myPrice",(int)(Math.random()*1000)+"元");
            data.add(row);
        }

        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,data);

        myListView.setAdapter(myCustomAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Map<String, Object> row = data.get(position);
                Toast.makeText(CustomListViewActivity.this, row.get("myProductName").toString(), Toast.LENGTH_SHORT).show();
                //页面跳转
//                Intent intent = new Intent();
//                intent.setClass(CustomListViewActivity.this,SimpleListViewActivity.class);
//                //设置参数
//                intent.putExtra("productName",row.get("myProductName").toString());
//                startActivity(intent);
            }
        });

        myListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomListViewActivity.this, "你确认要删除吗?", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        myListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if(AbsListView.OnScrollListener.SCROLL_STATE_IDLE == scrollState){
                    System.out.println("空闲......");
                }else{
                    if(AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL == scrollState){
                        System.out.println("触摸滚动....");
                    }else{
                        System.out.println("滑动......");
                    }
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                System.out.println("滚动:" + firstVisibleItem + "--->" + visibleItemCount + "-->" + totalItemCount);
            }
        });
    }
}

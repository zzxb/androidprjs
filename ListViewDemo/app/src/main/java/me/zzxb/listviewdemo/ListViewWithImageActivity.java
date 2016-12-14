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

public class ListViewWithImageActivity extends Activity {
    private String[] goods_ids = {"1","2","3","4","5"};
    private String[] goods_names = {"英雄钢笔","英雄钢笔套装","佳能彩色墨盒","爱普生扫描仪","透明胶带"};
    private String[] goods_prices = {"23.2","125.5","200.5","1034.6","5.0"};
    private int[] goods_imgs = {R.drawable.gangbi,
            R.drawable.gangbi2,
            R.drawable.mohe,
            R.drawable.smy,
            R.drawable.tmj};
    private ListView lv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_image);
        List<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
        for (int i = 0;i < goods_names.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("goods_name",goods_names[i]);
            item.put("goods_price",goods_prices[i]);
            item.put("goods_img",goods_imgs[i]);
            data.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(ListViewWithImageActivity.this,data,R.layout.goods_item,
                new String[]{"goods_name","goods_price","goods_img"},
                new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_img});
        lv_data = (ListView)findViewById(R.id.lv_data2);
        lv_data.setAdapter(adapter);

        lv_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.setClass(ListViewWithImageActivity.this,GoodsDetailActivity.class);
                Bundle bundle = new Bundle();
                System.out.println(goods_ids[i]);
                bundle.putString("gid",goods_ids[i]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}

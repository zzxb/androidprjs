package me.zzxb.gridviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewWithImageActivity extends Activity {
    private GridView gv_data = null;
    private String[] goods_ids = {"1","2","3","4","5"};
    private String[] goods_names = {"英雄钢笔","英雄钢笔套装","佳能彩色墨盒","爱普生扫描仪","透明胶带"};
    private String[] goods_prices = {"23.2","125.5","200.5","1034.6","5.0"};
    private int[] goods_imgs = {R.drawable.gangbi,
            R.drawable.gangbi2,
            R.drawable.mohe,
            R.drawable.smy,
            R.drawable.tmj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_with_image);
        List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();
        for(int i = 0;i < goods_names.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("goods_name",goods_names[i]);
            item.put("goods_price",goods_prices[i]);
            item.put("goods_img",goods_imgs[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.goods_cell,
                new String[]{"goods_name","goods_price","goods_img"},
                new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_img});

        gv_data = (GridView)findViewById(R.id.gv_data);
        gv_data.setAdapter(adapter);

    }
}

package me.zzxb.gridviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewWithOutImageActivity extends Activity {
    private GridView myGridView = null;
    private List<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
    private int[] resimgs = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_with_out_image);
        myGridView = (GridView)findViewById(R.id.mygridview);
        for(int i = 0;i < 4;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("pimg",resimgs[i]);
            item.put("pname","产品名称：大白鹅" + i);
            item.put("pprice","产品价格：10.4元/斤");
            data.add(item);
        }
        String[] names = {"pimg","pname","pprice"};
        int[] resids = {R.id.proimg,R.id.pname,R.id.pprice};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,data,R.layout.my_grid_itme,names,resids);
        myGridView.setAdapter(simpleAdapter);
    }
}

package me.zzxb.listviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewWithOutImageActivity extends Activity {

    private ListView lv_data;
    private String[] items = {"铅笔","橡皮","钢笔","扫描仪","尺子"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_out_image);
        lv_data = (ListView)findViewById(R.id.lv_data);
        //生成Adaptor
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        //装配
        lv_data.setAdapter(adapter);

        lv_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewWithOutImageActivity.this,items[i],Toast.LENGTH_SHORT).show();
            }
        });
        //当设置android:footerDividersEnabled="true"，显示分割线
        lv_data.addFooterView(new View(this));
        //当设置android:headerDividersEnabled="true"，显示分割线
        lv_data.addHeaderView(new View(this));
    }
}

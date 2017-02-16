package me.zzxb.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Map;

public class DetailProductActivity extends Activity {
    private TextView productName = null;
    private TextView time = null;
    private TextView address = null;
    private TextView price = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);
        //接收
        Intent intent = getIntent();
        String productNameValue = intent.getStringExtra("productName");
        Bundle bundle = intent.getExtras();
        MapSerializable mapSerializable = (MapSerializable)bundle.get("row");
        Map<String,Object> row = mapSerializable.getMap();
        //实例化
        productName = (TextView)findViewById(R.id.detail_productName);
        time = (TextView)findViewById(R.id.detail_time);
        address = (TextView)findViewById(R.id.detail_address);
        price = (TextView)findViewById(R.id.detail_price);

        //赋值
        productName.setText(row.get("productName").toString());
        time.setText(row.get("time").toString());
        address.setText(row.get("address").toString());
        price.setText(row.get("price").toString());

    }

}

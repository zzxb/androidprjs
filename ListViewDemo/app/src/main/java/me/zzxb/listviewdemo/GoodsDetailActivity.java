package me.zzxb.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GoodsDetailActivity extends Activity {
    private TextView goodsName = null;
    private TextView goodsPrice = null;
    private ImageView goodsImg = null;
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
        setContentView(R.layout.activity_goods_detail);
        goodsName = (TextView)findViewById(R.id.goodsName);
        goodsImg = (ImageView)findViewById(R.id.goodsImg);
        goodsPrice = (TextView)findViewById(R.id.goodsPrice);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        String goodsID = intent.getStringExtra("gid");
        for(int i = 0;i < goods_ids.length;i++){
            if(goodsID.equals(goods_ids[i])){
                goodsName.setText(goods_names[i]);
                goodsImg.setImageResource(goods_imgs[i]);
                goodsPrice.setText(goods_prices[i]);
            }
        }
    }
}

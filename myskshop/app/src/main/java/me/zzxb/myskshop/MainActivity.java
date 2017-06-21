package me.zzxb.myskshop;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends ActivityGroup {

    private TabHost tabHost = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost)findViewById(R.id.tabHost);

        tabHost.setup(getLocalActivityManager());

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1").setIndicator("首页").setContent(new Intent(MainActivity.this,ProductListActivity.class));

        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2").setIndicator("分类").setContent(new Intent(MainActivity.this,CategoryActivity.class));

        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3").setIndicator("个人中心").setContent(new Intent(MainActivity.this,PersonCenterActivity.class));

        tabHost.addTab(tab3);



    }
}

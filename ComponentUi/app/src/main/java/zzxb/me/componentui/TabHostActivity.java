package zzxb.me.componentui;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabHostActivity extends ActivityGroup {

    private TabHost tabHost = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);

        tabHost = (TabHost)findViewById(R.id.tabHost);

        //装配

        tabHost.setup(this.getLocalActivityManager());

        //装配每一个tab

        TabHost.TabSpec ts = tabHost.newTabSpec("tab1").setIndicator("首页").setContent(new Intent(this,MainActivity.class));

        tabHost.addTab(ts);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("tab2").setIndicator("复选框").setContent(new Intent(this,CheckActivity.class));

        tabHost.addTab(ts2);

        TabHost.TabSpec ts3 = tabHost.newTabSpec("tab3").setIndicator("单选框").setContent(new Intent(this,RadioActivity.class));

        tabHost.addTab(ts3);

    }
}

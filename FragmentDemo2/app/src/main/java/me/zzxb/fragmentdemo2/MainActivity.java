package me.zzxb.fragmentdemo2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int vHeight = this.getWindowManager().getDefaultDisplay().getHeight();
        int vWidth = this.getWindowManager().getDefaultDisplay().getWidth();
        if(vWidth > vHeight){//横屏显示
            FragmentManager fm = this.getSupportFragmentManager();
            ListViewFragment lf = (ListViewFragment)fm.findFragmentById(R.id.fragment1);
            DetailViewFragment df = (DetailViewFragment)fm.findFragmentById(R.id.fragment2);
            fm.beginTransaction().show(lf).commit();
            fm.beginTransaction().show(df).commit();
        }else{//竖屏显示
            FragmentManager fm = this.getSupportFragmentManager();
            DetailViewFragment df = (DetailViewFragment)fm.findFragmentById(R.id.fragment2);
            fm.beginTransaction().hide(df).commit();
        }


    }
}

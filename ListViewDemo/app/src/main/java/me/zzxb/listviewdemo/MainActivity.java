package me.zzxb.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btnList = null;
    private Button btnList2 = null;
    private Button btnCList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnList = (Button)findViewById(R.id.btn_list);
        btnList2 = (Button)findViewById(R.id.btn_list2);
        btnCList = (Button)findViewById(R.id.btn_clist);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ListViewWithOutImageActivity.class);
                startActivity(intent);
            }
        });

        btnList2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ListViewWithImageActivity.class);
                startActivity(intent);
            }
        });

        btnCList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,CustomListViewActivity.class);
                startActivity(intent);
            }
        });


    }
}

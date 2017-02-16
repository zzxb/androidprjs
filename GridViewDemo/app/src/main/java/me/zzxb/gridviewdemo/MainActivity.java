package me.zzxb.gridviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btnGrid = null;
    private Button btnGrid2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrid = (Button)findViewById(R.id.btn_grid);
        btnGrid2 = (Button)findViewById(R.id.btn_grid2);

        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,GridViewWithImageActivity.class);
                startActivity(intent);
            }
        });

        btnGrid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,GridViewWithOutImageActivity.class);
                startActivity(intent);
            }
        });

    }
}

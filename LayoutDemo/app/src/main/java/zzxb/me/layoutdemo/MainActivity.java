package zzxb.me.layoutdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button linearLO = null;
    private Button tableLO = null;
    private Button frameLO = null;
    private Button relativeLO = null;
    private Button absLO = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLO = (Button)findViewById(R.id.linearLO);
        tableLO = (Button)findViewById(R.id.tableLO);
        frameLO = (Button)findViewById(R.id.frameLO);
        relativeLO = (Button)findViewById(R.id.relativeLO);
        absLO = (Button)findViewById(R.id.absLO);

        linearLO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });

        tableLO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TableLayoutActivity.class);
                startActivity(intent);
            }
        });

        frameLO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,FrameActivity.class);
                startActivity(intent);
            }
        });

        relativeLO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });

        absLO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,AbsLayoutActivity.class);
                startActivity(intent);
            }
        });

    }
}

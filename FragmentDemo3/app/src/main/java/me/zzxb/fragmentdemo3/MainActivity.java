package me.zzxb.fragmentdemo3;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    private Button myBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn = (Button)findViewById(R.id.myBtn);

        AFragment a = new AFragment();

        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction().add(R.id.activity_main,a).commit();

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.fragAText);
                Toast.makeText(MainActivity.this,tv.getText(),Toast.LENGTH_SHORT).show();
            }
        });



    }
}

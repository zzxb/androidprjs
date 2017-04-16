package me.zzxb.menudemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionsmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch(item.getItemId()){
            case R.id.menu_about:
                Toast.makeText(MainActivity.this, ""+"关于", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_settings:

                Toast.makeText(MainActivity.this, ""+"设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_quit:

                Toast.makeText(MainActivity.this, ""+"退出", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

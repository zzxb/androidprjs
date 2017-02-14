package me.zzxb.servicecase.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;

import me.zzxb.servicecase.R;
import me.zzxb.servicecase.service.MyService;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button startService = null;
    private Button stopService = null;
    private Button bindService = null;
    private Button unBindService = null;
    private MyService.MyBinder myBinder;

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBinder = (MyService.MyBinder)service;
            myBinder.startDownload();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService = (Button)findViewById(R.id.start_service);
        stopService = (Button)findViewById(R.id.stop_service);
        bindService = (Button)findViewById(R.id.bind_service);
        unBindService = (Button)findViewById(R.id.unbind_service);
        startService.setOnClickListener(this);
        stopService.setOnClickListener(this);
        bindService.setOnClickListener(this);
        unBindService.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start_service:
                Intent intent = new Intent(this, MyService.class);
                startService(intent);
                break;
            case R.id.stop_service:
                Intent intent2 = new Intent(this,MyService.class);
                stopService(intent2);
                break;
            case R.id.bind_service:
                Intent intent3 = new Intent(this,MyService.class);
                bindService(intent3,conn,BIND_AUTO_CREATE);
                break;
            case R.id.unbind_service:
                unbindService(conn);
                break;
        }

    }
}

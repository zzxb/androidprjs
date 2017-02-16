package me.zzxb.broadcastcase;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btnSendMsg = null;
    private MyReceiver myReceiver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSendMsg = (Button)findViewById(R.id.btnSendMsg);
        btnSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //静态注册广播，在AndroidManifest.xml中配置
//                Intent intent = new Intent();
//                intent.setAction("me.zzxb.MY_SEND_BROADCAST");
//                intent.putExtra("msg","简单的消息");
//                sendBroadcast(intent);
                //动态注册广播,无需配置，直接代码
                Intent intent = new Intent();
                intent.setAction("me.zzxb.dinst");//必须与过滤器一致
                intent.putExtra("msg","简单的消息-动态注册");
                myReceiver = new MyReceiver();
                IntentFilter intentFilter = new IntentFilter();
                //自定义的字符串
                intentFilter.addAction("me.zzxb.dinst");//必须一致
                registerReceiver(myReceiver,intentFilter);
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //使用动态注册广播，必须解绑
        unregisterReceiver(myReceiver);
    }
}

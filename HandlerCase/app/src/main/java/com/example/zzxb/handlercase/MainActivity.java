package com.example.zzxb.handlercase;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button button = null;
    private TextView text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(this);
        text = (TextView)findViewById(R.id.content);
    }

    @Override
    public void onClick(View v) {
        Looper looper = Looper.myLooper();
        MyHandler myHandler = new MyHandler(looper);
        myHandler.removeMessages(0);
        String strMsg = "主线程不同组件通信:消息来自button";
        Message msg = myHandler.obtainMessage(1,1,1,strMsg);
        myHandler.sendMessage(msg);
    }

    private class MyHandler extends Handler{
        MyHandler(Looper looper){
            super(looper);
        }

        @Override
        public void handleMessage(Message msg) {
            text.setText(msg.obj.toString());
        }
    }
}

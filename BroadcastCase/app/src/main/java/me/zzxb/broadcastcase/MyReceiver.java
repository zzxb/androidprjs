package me.zzxb.broadcastcase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by zzxb on 17/2/16.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context
                ,"我接受到的广播信息是:"+intent.getAction() + ",msg:" + intent.getStringExtra("msg")
                ,Toast.LENGTH_SHORT).show();
    }
}

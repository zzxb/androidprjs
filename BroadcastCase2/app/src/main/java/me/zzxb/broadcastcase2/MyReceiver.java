package me.zzxb.broadcastcase2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

/**
 * Created by zzxb on 17/2/16.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        int current = bundle.getInt("level");
        Toast.makeText(context,"当前电量:" + current,Toast.LENGTH_SHORT).show();
    }
}

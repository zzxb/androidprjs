package me.zzxb.notificationcase;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotificationManager mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent contentIntent = PendingIntent.getActivity(
                this, 0, new Intent(this, NotificationDetailActivity.class), 0);

        /**
         * 在build.gradle文件中引入：
         * compile 'com.android.support:support-v4:25.1.1'
         * 才能够使用NotificationCompat类
         */

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(R.drawable.small_icon);
        mBuilder.setContentTitle("My notification");
        mBuilder.setContentText("通知啦！");
        mBuilder.setContentIntent(contentIntent);

        mNotifyMgr.notify(1,mBuilder.build());

    }
}

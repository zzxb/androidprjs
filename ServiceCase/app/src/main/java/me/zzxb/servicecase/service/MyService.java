package me.zzxb.servicecase.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import me.zzxb.servicecase.R;
import me.zzxb.servicecase.activity.MainActivity;

/**
 * Created by zzxb on 17/2/13.
 */

public class MyService extends Service {

    private static final String TAG = "MyService";
    private MyBinder myBinder = new MyBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    public class MyBinder extends Binder {

        public void startDownload() {
            Log.d("TAG", "startDownload() executed");
            // 执行具体的下载任务
        }

    }

    @Override
    public void onCreate() {
        super.onCreate();
        //前台service
        Notification.Builder builder = new Notification.Builder(this.getApplicationContext()); //获取一个Notification构造器
        Intent nfIntent = new Intent(this, MainActivity.class);
        builder.setContentIntent(PendingIntent.getActivity(this, 0, nfIntent, 0));// 设置PendingIntent
        builder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher)); // 设置下拉列表中的图标(大图标)
        builder.setContentTitle("下拉列表中的Title"); // 设置下拉列表里的标题
        builder.setSmallIcon(R.mipmap.ic_launcher); // 设置状态栏内的小图标
        builder.setContentText("要显示的内容"); // 设置上下文内容
        builder.setWhen(System.currentTimeMillis()); // 设置该通知发生的时间
        Notification notification = builder.build(); // 获取构建好的Notification
        notification.defaults = Notification.DEFAULT_SOUND; //设置为默认的声音
        startForeground(110, notification);
        Log.d(TAG, "onCreate: 创建了！");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: 执行了！");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);// 停止前台服务--参数：表示是否移除之前的通知
        Log.d(TAG, "onDestroy: 销毁了！");
    }
}

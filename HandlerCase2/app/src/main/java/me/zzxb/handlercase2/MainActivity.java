package me.zzxb.handlercase2;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ProgressBar pb; // 进度条
    private int[] randData = new int[100]; // 数组
    private int index = 0; // 索引
    private int mProgressStaus = 0; // 设置进度条的长度
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.pb);
        // 初始化handle，绑定在主线程中的队列消息中
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                // 接收消息
                if (msg.what == 0x111) {
                    mProgressStaus = index;
                    pb.setProgress(mProgressStaus);
                    if(index == 100){
                        Toast.makeText(MainActivity.this,"下载完成!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };
        // 创建子线程，在子线程中处理耗时工作
        new Thread() {
            @Override
            public void run() {
                super.run();
                while (index < 100) {
                    doWork();
                    Message msg = new Message();
                    msg.what = 0x111;
                    mHandler.sendMessage(msg);
                }
            }
        }.start();
    }

    /**
     * 模拟耗时工作（一定要在子线程中做）
     *
     * @return 进度条的多少
     */
    public int doWork() {
        randData[index++] = (int) (Math.random() * 100);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return index;
    }

}

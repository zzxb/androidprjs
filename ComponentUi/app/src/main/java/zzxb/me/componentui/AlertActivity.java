package zzxb.me.componentui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {
    private Button btn_alert = null;
    private Button btn_puTong = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        getView();
        setListener();

    }

    //初始化控件
    private void getView(){
        //初始化控件
        btn_alert = (Button)findViewById(R.id.btn_alert);
        btn_puTong = (Button)findViewById(R.id.btn_puTong);
    }

    //设置监听
    private void setListener(){
        btn_alert.setOnClickListener(btnListener);
        btn_puTong.setOnClickListener(btnListener);
    }

    //创建监听类
    private Button.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v instanceof Button) {
                int btnID = v.getId();
                switch (btnID){
                    case R.id.btn_alert:
                        alertService();
                        break;
                    case R.id.btn_puTong:
                        puTongService();
                        break;
                    default:
                        break;
                }
            }
        }
    };

    //提示框业务处理方法
    private void alertService(){
        Toast.makeText(AlertActivity.this,"这是提示框", Toast.LENGTH_SHORT).show();
    }

    //普通对话框处理方法

    private void puTongService(){
        AlertDialog.Builder ab = new AlertDialog.Builder(AlertActivity.this);
        ab.setTitle("对话框");
        ab.setMessage("这是一个普通对话框!");
        ab.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //处理业务的
                Toast.makeText(AlertActivity.this, "你点击了确定", Toast.LENGTH_SHORT).show();
            }
        });
        ab.setNeutralButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

               /// Toast.makeText(AlertActivity.this,"你点击的which值:"+which,Toast.LENGTH_SHORT).show();
            }
        });

        ab.create().show();
    }
}

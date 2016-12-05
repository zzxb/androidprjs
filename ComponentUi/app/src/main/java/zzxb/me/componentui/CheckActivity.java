package zzxb.me.componentui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class CheckActivity extends Activity {
    private LinearLayout checkBoxLayout = null;
    private String[] cbNames = {"周杰伦","张学友","王菲"};
    private Button checkSubmit = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        checkBoxLayout = (LinearLayout)findViewById(R.id.checkbox_layout);
        checkSubmit = (Button)findViewById(R.id.btn_checkSubmit);
        for (String cbName : cbNames) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(cbName);
            checkBoxLayout.addView(checkBox);
        }

        //提交获取值
        checkSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0;i < checkBoxLayout.getChildCount();i++){
                    CheckBox cb = (CheckBox)checkBoxLayout.getChildAt(i);
                    if(cb.isChecked()){
                        Log.i("ck",cb.getText().toString());
                    }
                }
            }
        });


    }
}

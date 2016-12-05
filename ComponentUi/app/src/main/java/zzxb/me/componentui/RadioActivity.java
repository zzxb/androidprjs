package zzxb.me.componentui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends Activity {

    private RadioGroup radioGroup = null;
    private String[] rbState = {"离职","在职","其他"};
    private Button radioSubmit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        radioGroup = (RadioGroup)findViewById(R.id.rg_state);
        radioSubmit = (Button)findViewById(R.id.btn_radioSubmit);
        for(int i = 0;i < rbState.length;i++){
            RadioButton rb = new RadioButton(this);
            rb.setText(rbState[i]);
            radioGroup.addView(rb);
            if(i == 0){
                radioGroup.check(rb.getId());
            }
        }

        //选中改变值获得响应
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = (RadioButton)findViewById(i);
                Log.i("ff",rb.getText().toString());
            }
        });

        //点击按钮获得单选框值
        radioSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0;i < radioGroup.getChildCount();i++){
                    RadioButton rb = (RadioButton) radioGroup.getChildAt(i);
                    if(rb.isChecked()){
                        Log.i("info",rb.getText().toString());
                    }
                }
            }
        });

    }
}

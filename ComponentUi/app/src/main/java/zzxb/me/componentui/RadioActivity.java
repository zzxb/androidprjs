package zzxb.me.componentui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioActivity extends Activity {

    private RadioGroup radioGroup = null;
    private String[] rbState = {"离职","在职","其他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        radioGroup = (RadioGroup)findViewById(R.id.rg_state);
        for(int i = 0;i < rbState.length;i++){
            RadioButton rb = new RadioButton(this);
            rb.setText(rbState[i]);
            radioGroup.addView(rb);
            if(i == 0){
                radioGroup.check(rb.getId());
            }
        }

    }
}

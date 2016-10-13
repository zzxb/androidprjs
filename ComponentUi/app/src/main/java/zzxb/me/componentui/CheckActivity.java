package zzxb.me.componentui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class CheckActivity extends Activity {
    private LinearLayout checkBoxLayout = null;
    private String[] cbNames = {"周杰伦","张学友","王菲"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        checkBoxLayout = (LinearLayout)findViewById(R.id.checkbox_layout);
        for(int i = 0;i < cbNames.length;i++){
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(cbNames[i]);
            checkBoxLayout.addView(checkBox);
        }
    }
}

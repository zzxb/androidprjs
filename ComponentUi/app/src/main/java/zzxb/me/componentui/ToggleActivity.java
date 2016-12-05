package zzxb.me.componentui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ToggleActivity extends Activity {
    private ToggleButton tbnWifi = null;
    private Switch swSound = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        tbnWifi = (ToggleButton)findViewById(R.id.tbn_wifi);
        swSound = (Switch)findViewById(R.id.sw_sound);

        tbnWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Log.i("wifi",tbnWifi.getTextOn().toString());
;                }else{
                    Log.i("wifi",tbnWifi.getTextOff().toString());
                }
            }
        });

        swSound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Log.i("sound",swSound.getTextOn().toString());
                }else{
                    Log.i("sound",swSound.getTextOff().toString());
                }
            }
        });
    }
}

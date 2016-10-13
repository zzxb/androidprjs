package zzxb.me.componentui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekActivity extends AppCompatActivity {

    private TextView textview1, textview2;
    private SeekBar seekbar1, seekbar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);

        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
        seekbar1 = (SeekBar) findViewById(R.id.seekbar1);
        seekbar2 = (SeekBar) findViewById(R.id.seekbar2);

        seekbar1.setOnSeekBarChangeListener(seekBarChange);
        seekbar2.setOnSeekBarChangeListener(seekBarChange);
    }
    private SeekBar.OnSeekBarChangeListener seekBarChange = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (seekBar.getId() == R.id.seekbar1) {
                textview1.setText("seekbar1停止拖动");
            } else {
                textview1.setText("seekbar2停止拖动");
            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            if (seekBar.getId() == R.id.seekbar1) {
                textview1.setText("seekbar1开始拖动");
            } else {
                textview1.setText("seekbar2开始拖动");
            }
        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
            if (seekBar.getId() == R.id.seekbar1) {
                textview2.setText("seekbar1的当前位置是：" + progress);
            } else {
                textview2.setText("seekbar2的当前位置是：" + progress);
            }

        }
    };
}

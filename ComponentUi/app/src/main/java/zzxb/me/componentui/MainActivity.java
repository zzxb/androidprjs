package zzxb.me.componentui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnImage = null;
    private Button btnRadio = null;
    private Button btnCheck = null;
    private Button btnToggle = null;
    private Button btnImageView = null;
    private Button btnAutoText = null;
    private Button btnSpinner = null;
    private Button btnProgress = null;
    private Button btnSeek = null;
    private Button btnRating = null;
    private Button btnTabHost = null;
    private Button btnAlert = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImage = (Button)findViewById(R.id.btn_btnimage);
        btnRadio = (Button)findViewById(R.id.btn_radio);
        btnCheck = (Button)findViewById(R.id.btn_check);
        btnToggle = (Button)findViewById(R.id.btn_toggle);
        btnImageView = (Button)findViewById(R.id.btn_imageview);
        btnAutoText = (Button)findViewById(R.id.btn_autotext);
        btnSpinner = (Button)findViewById(R.id.btn_spinner);
        btnProgress = (Button)findViewById(R.id.btn_progress);
        btnSeek = (Button)findViewById(R.id.btn_seek);
        btnRating = (Button)findViewById(R.id.btn_rating);
        btnTabHost = (Button)findViewById(R.id.btn_tabhost);
        btnAlert = (Button)findViewById(R.id.btn_alert);

        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ImageButtonActivity.class);
                startActivity(intent);
            }
        });

        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,RadioActivity.class);
                startActivity(intent);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,CheckActivity.class);
                startActivity(intent);
            }
        });

        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ToggleActivity.class);
                startActivity(intent);
            }
        });

        btnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ImageViewActivity.class);
                startActivity(intent);
            }
        });

        btnAutoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,AutoTextActivity.class);
                startActivity(intent);
            }
        });

        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SpinnerActivity.class);
                startActivity(intent);
            }
        });

        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,ProgressActivity.class);
                startActivity(intent);
            }
        });

        btnSeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SeekActivity.class);
                startActivity(intent);
            }
        });

        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,RatingActivity.class);
                startActivity(intent);
            }
        });

        btnTabHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TabHostActivity.class);
                startActivity(intent);
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,AlertActivity.class);
                startActivity(intent);
            }
        });
    }
}

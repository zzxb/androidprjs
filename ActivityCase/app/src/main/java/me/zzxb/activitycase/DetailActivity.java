package me.zzxb.activitycase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends Activity {

    private TextView userNameInfo = null;
    private TextView passWordInfo = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        userNameInfo = (TextView)findViewById(R.id.userNameInfo);
        passWordInfo = (TextView)findViewById(R.id.passWordInfo);
        userNameInfo.setText(bundle.getCharSequence("userName").toString());
        passWordInfo.setText(bundle.getCharSequence("passWord").toString());

        Button buttonBackView = (Button)findViewById(R.id.buttonBackView);

        buttonBackView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(0x717,intent);
                finish();
            }
        });

    }
}

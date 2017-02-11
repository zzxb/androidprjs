package me.zzxb.activitycase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText editTextUserName = null;
    private EditText editTextPassWord = null;
    private final int CODE = 0x717;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUserName = (EditText)findViewById(R.id.editTextUserName);
        editTextPassWord = (EditText)findViewById(R.id.editTextPassWord);
        Button buttonRegister = (Button) findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editTextUserName.getText().toString();
                String passWord = editTextPassWord.getText().toString();
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("userName",userName);
                bundle.putCharSequence("passWord",passWord);
                intent.putExtras(bundle);
                intent.setClass(MainActivity.this,DetailActivity.class);
                startActivityForResult(intent,CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CODE && resultCode == CODE){
            editTextPassWord.setText("");
        }
    }
}

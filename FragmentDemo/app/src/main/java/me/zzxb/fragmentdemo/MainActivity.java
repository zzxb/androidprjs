package me.zzxb.fragmentdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import me.zzxb.fragmentdemo.myfrag.ContentFragment;

public class MainActivity extends FragmentActivity {
    private Button btnSubmit = null;
    private EditText frEt = null;
    private ContentFragment cFr = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnSubmit = (Button)findViewById(R.id.btn_submit);
//        frEt = (EditText)findViewById(R.id.fr_content_et);
//        cFr = (ContentFragment)getFragmentManager().findFragmentById(R.id.fr_content);
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("fret",frEt.getText().toString());
//            }
//        });

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ContentFragment contentFragment = new ContentFragment();
        fragmentTransaction.add(R.id.activity_main,contentFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}

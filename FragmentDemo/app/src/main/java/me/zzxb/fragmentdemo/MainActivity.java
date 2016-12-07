package me.zzxb.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
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

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ContentFragment contentFragment = new ContentFragment();
        fragmentTransaction.add(R.id.activity_main,contentFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}

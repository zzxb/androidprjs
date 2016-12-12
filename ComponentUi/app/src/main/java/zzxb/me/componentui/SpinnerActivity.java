package zzxb.me.componentui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner1 = (Spinner) findViewById(R.id.spinnerBase);
        spinner2 = (Spinner) findViewById(R.id.spinnerBase1);
        // 声明一个ArrayAdapter用于存放简单数据
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                SpinnerActivity.this, android.R.layout.simple_spinner_item,
                getData());
        // 把定义好的Adapter设定到spinner中
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        // 为第一个Spinner设定选中事件
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // 在选中之后触发
                Toast.makeText(SpinnerActivity.this,
                        parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    private List<String> getData() {
        // 数据源
        List<String> dataList = new ArrayList<String>();
        dataList.add("北京");
        dataList.add("上海");
        dataList.add("南京");
        dataList.add("宜昌");
        return dataList;
    }
}

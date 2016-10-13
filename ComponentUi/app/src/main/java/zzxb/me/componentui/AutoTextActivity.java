package zzxb.me.componentui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoTextActivity extends AppCompatActivity {
    private AutoCompleteTextView autotext;
    private MultiAutoCompleteTextView multiautotext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_text);

        //获取布局文件中的两个控件对象
        autotext=(AutoCompleteTextView)findViewById(R.id.autotext);
        multiautotext=(MultiAutoCompleteTextView)findViewById(R.id.multiautotext);

        //设置数据源
        String[] autoStrings=new String[]{"New York","Tokyo","beijing","london","Seoul Special","Los Angeles"};
        //设置ArrayAdapter，并且设定以单行下拉列表风格展示（第二个参数设定）。
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(AutoTextActivity.this,
                android.R.layout.simple_dropdown_item_1line, autoStrings);
        //设置AutoCompleteTextView的Adapter
        autotext.setAdapter(adapter);

        //设置MultiAutoCompleteTextView的Adapter
        multiautotext.setAdapter(adapter);
        //设定选项间隔使用逗号分隔。
        multiautotext.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}

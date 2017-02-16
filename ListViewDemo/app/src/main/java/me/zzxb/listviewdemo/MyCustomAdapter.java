package me.zzxb.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by zzxb on 17/2/16.
 */

public class MyCustomAdapter extends BaseAdapter {
    private Context cxt;
    private List<Map<String,Object>> data;

    public MyCustomAdapter(Context cxt, List<Map<String, Object>> data) {
        this.cxt = cxt;
        this.data = data;
    }

    @Override
    public int getCount() {
        //行数
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        //获得某一行的对象
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(cxt).inflate(R.layout.activity_custom_listview_row,null);
            convertView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,Goals.SCREEN_GAO / 10));
        }

        TextView myPic = (TextView)convertView.findViewById(R.id.line_myPic);

        myPic.getLayoutParams().height = Goals.SCREEN_GAO / 10;

        TextView myProductName = (TextView)convertView.findViewById(R.id.line_myProductName);

        TextView myTime = (TextView)convertView.findViewById(R.id.line_myTime);

        TextView myAddress = (TextView)convertView.findViewById(R.id.line_MyAddress);

        TextView myPrice = (TextView)convertView.findViewById(R.id.line_myPrice);

        Map<String,Object> row = data.get(position);

        myPic.setBackgroundResource((Integer)row.get("myPic"));

        myProductName.setText(row.get("myProductName").toString());

        myTime.setText(row.get("myTime").toString());

        myAddress.setText(row.get("myAddress").toString());

        myPrice.setText(row.get("myPrice").toString());


        return convertView;
    }
}

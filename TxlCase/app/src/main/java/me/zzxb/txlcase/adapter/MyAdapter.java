package me.zzxb.txlcase.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

import me.zzxb.txlcase.R;
import me.zzxb.txlcase.pojo.ResLxr;
import me.zzxb.txlcase.tools.BitmapCache;
import me.zzxb.txlcase.tools.HttpUtil;

/**
 * Created by zzxb on 17/6/8.
 */

public class MyAdapter extends BaseAdapter {
    private List<ResLxr> data;
    private Context context;
    private RequestQueue requestQueue;

    public MyAdapter(Context context,RequestQueue requestQueue, List<ResLxr> data) {
        this.context = context;
        this.data = data;
        this.requestQueue = requestQueue;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.index_list_item,null);
        }

        NetworkImageView timage = (NetworkImageView) convertView.findViewById(R.id.list_timage);

        TextView tname = (TextView)convertView.findViewById(R.id.list_tname);

        timage.setImageUrl(HttpUtil.API_URL + "/" + data.get(position).getTimage(),new ImageLoader(requestQueue,new BitmapCache()));

        tname.setText(data.get(position).getLxrname());


        return convertView;
    }
}

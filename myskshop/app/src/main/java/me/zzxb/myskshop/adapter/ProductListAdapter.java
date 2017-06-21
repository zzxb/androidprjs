package me.zzxb.myskshop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

import me.zzxb.myskshop.R;
import me.zzxb.myskshop.pojo.ResProduct;
import me.zzxb.myskshop.tools.BitmapCache;
import me.zzxb.myskshop.tools.HttpUtil;

/**
 * Created by zzxb on 17/6/12.
 */

public class ProductListAdapter extends BaseAdapter {
    private RequestQueue requestQueue;
    private Context context;
    private List<ResProduct> data;
    private boolean isListView;


    public ProductListAdapter(RequestQueue requestQueue, Context context, List<ResProduct> data,boolean isListView) {
        this.requestQueue = requestQueue;
        this.context = context;
        this.data = data;
        this.isListView = isListView;
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
            if(isListView){
                convertView = LayoutInflater.from(context).inflate(R.layout.prodcts_list_item, null);
            }else {
                convertView = LayoutInflater.from(context).inflate(R.layout.products_grid_item, null);
            }
        }

        if(isListView){
            NetworkImageView pimg = (NetworkImageView)convertView.findViewById(R.id.cpimage);

            TextView pname = (TextView)convertView.findViewById(R.id.cpname);

            TextView pprice = (TextView)convertView.findViewById(R.id.cpprice);

            ResProduct p = data.get(position);

            pimg.setImageUrl(HttpUtil.API_URL + "/" + p.getPsimage(),new ImageLoader(requestQueue,new BitmapCache()));

            pname.setText(p.getPname());

            pprice.setText("价格：" + p.getPprice() + "元");
        }else{
            NetworkImageView pimg = (NetworkImageView)convertView.findViewById(R.id.pimg);

            TextView pname = (TextView)convertView.findViewById(R.id.pname);

            TextView pprice = (TextView)convertView.findViewById(R.id.pprice);

            ResProduct p = data.get(position);

            pimg.setImageUrl(HttpUtil.API_URL + "/" + p.getPsimage(),new ImageLoader(requestQueue,new BitmapCache()));

            pname.setText(p.getPname());

            pprice.setText("价格：" + p.getPprice() + "元");
        }




        return convertView;
    }
}

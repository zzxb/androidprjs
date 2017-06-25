package me.zzxb.pullrefreshdemo2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import java.util.List;

import me.zzxb.pullrefreshdemo2.R;
import me.zzxb.pullrefreshdemo2.helper.Product;
import me.zzxb.pullrefreshdemo2.tools.BitmapCache;
import me.zzxb.pullrefreshdemo2.tools.HttpUtil;

/**
 * Created by zzxb on 17/6/18.
 */

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private List<Product> data;

    public ProductAdapter(Context context, List<Product> data) {
        this.context = context;
        this.data = data;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.prodcts_list_item,null);
        }

        NetworkImageView pimg = (NetworkImageView)convertView.findViewById(R.id.pimage);

        TextView pname = (TextView)convertView.findViewById(R.id.pname);

        TextView pprice = (TextView)convertView.findViewById(R.id.pprice);

        Product p = data.get(position);

        RequestQueue requestQueue = Volley.newRequestQueue(context.getApplicationContext());

        pimg.setImageUrl(HttpUtil.API_URL + "/" + p.getPsimage(),new ImageLoader(requestQueue,new BitmapCache()));

        pname.setText(p.getPname());

        pprice.setText("价格：" + p.getPprice() + "元");


        return convertView;
    }
}

package zzxb.me.gallerycase;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private int[] imagesId = new int[]{
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
    };

    private Gallery myGallery = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGallery = (Gallery)findViewById(R.id.myGallery);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imagesId.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView = null;
                if(convertView == null){
                    imageView = new ImageView(MainActivity.this);
                    imageView.setImageResource(imagesId[position]);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setLayoutParams(new Gallery.LayoutParams(980,935));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
                    imageView.setBackgroundResource(typedArray.getResourceId(R.styleable.Gallery_android_galleryItemBackground,0));
                    imageView.setPadding(5,0,5,0);
                }else{
                    imageView = (ImageView)convertView;
                }
                return imageView;
            }
        };
        myGallery.setAdapter(adapter);
        myGallery.setSelection(imagesId.length / 2);
        myGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"你选择了第" + String.valueOf(position) + "张照片",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

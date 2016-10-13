package zzxb.me.componentui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class ImageViewActivity extends Activity implements
        SeekBar.OnSeekBarChangeListener {
    private int minWidth = 80;
    private ImageView imageView;
    private TextView textview1, textview2;
    Matrix matrix = new Matrix();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = (ImageView) findViewById(R.id.imageview3);
        SeekBar seekbar1 = (SeekBar) findViewById(R.id.sbSize);
        SeekBar seekbar2 = (SeekBar) findViewById(R.id.sbRotate);
        textview1 = (TextView) findViewById(R.id.tv1);
        textview2 = (TextView) findViewById(R.id.tv2);

        //获取当前屏幕的尺寸，并设置图片放大的最大尺寸，不能超过屏幕尺寸
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        seekbar1.setMax(dm.widthPixels - minWidth);

        seekbar1.setOnSeekBarChangeListener(this);
        seekbar2.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        if (seekBar.getId() == R.id.sbSize) {
            //设置图片的大小
            int newWidth = progress + minWidth;
            int newHeight = (int) (newWidth * 3 / 4);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(newWidth, newHeight));
            textview1.setText("图像宽度：" + newWidth + "图像高度：" + newHeight);
        } else if (seekBar.getId() == R.id.sbRotate) {
            //获取当前待旋转的图片
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.dushi);
            //设置旋转角度
            matrix.setRotate(progress, 30, 60);
            //通过待旋转的图片和角度生成新的图片
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            //绑定图片到控件上
            imageView.setImageBitmap(bitmap);
            textview2.setText(progress + "°");
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }
}

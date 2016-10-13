package zzxb.me.componentui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {


    private RatingBar rbRating,rbRating1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        rbRating=(RatingBar)findViewById(R.id.rbRating);
        rbRating1=(RatingBar)findViewById(R.id.rbRating1);
        //手动设置第一个RatingBar的属性值
        rbRating.setMax(100);
        rbRating.setProgress(20);
        rbRating.setOnRatingBarChangeListener(this);
        rbRating1.setOnRatingBarChangeListener(this);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating,
                                boolean fromUser) {
        //分别显示Progress属性和rating属性的不同
        int progress=ratingBar.getProgress();
        Toast.makeText(RatingActivity.this, "progress:"+progress+" rating :"+rating,Toast.LENGTH_SHORT).show();
    }

}

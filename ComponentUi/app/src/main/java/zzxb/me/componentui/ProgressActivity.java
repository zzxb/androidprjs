package zzxb.me.componentui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {

    private Button btnAdd, btnReduce, btnVisible;
    private ProgressBar pbHor, pbLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnReduce = (Button) findViewById(R.id.btnReduce);
        btnVisible = (Button) findViewById(R.id.btnVisible);
        pbHor = (ProgressBar) findViewById(R.id.pbHor);
        pbLarge = (ProgressBar) findViewById(R.id.pbLarge);

        btnAdd.setOnClickListener(mathClick);
        btnReduce.setOnClickListener(mathClick);
        btnVisible.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 判断Large进度条是否显示，显示则隐藏，隐藏则显示
                if (pbLarge.getVisibility() == View.VISIBLE) {
                    pbLarge.setVisibility(View.GONE);
                } else {
                    pbLarge.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    private View.OnClickListener mathClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnAdd:
                    // 如果是增加按钮，因为进度条的最大值限制在100，第一刻度限制在90.
                    // 在此限度内，以1.2倍递增
                    // 使用setProgress()
                    if (pbHor.getProgress() < 90) {
                        pbHor.setProgress((int) (pbHor.getProgress() * 1.2));
                    }
                    if (pbHor.getSecondaryProgress() < 100) {
                        pbHor.setSecondaryProgress((int) (pbHor
                                .getSecondaryProgress() * 1.2));
                    }
                    break;
                case R.id.btnReduce:
                    // 如果是增加按钮，因为进度条的最大值限制在100，第一刻度限制在10.第二刻度限制在20
                    // 在此限度内，以10点为基数进行递减。
                    // 使用incrementXxxProgressBy(int)
                    if (pbHor.getProgress() > 10) {
                        pbHor.incrementProgressBy(-10);
                    }
                    if (pbHor.getSecondaryProgress() > 20) {
                        pbHor.incrementSecondaryProgressBy(-10);
                    }
                    break;
            }
        }
    };
}

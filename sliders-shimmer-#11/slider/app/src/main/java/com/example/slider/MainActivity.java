package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<slideritem> list = new ArrayList<>();
    int pages = 4;
    TextView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] currentPage = {0};
        Timer timer;
        final long DELAY_MS = 2000;
        final long PERIOD_MS = 4000;
        ShimmerFrameLayout s1,s2,s3;
        final Handler sh;
        ViewPager vp = findViewById(R.id.vp);

        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);

        s1.startShimmer(); s2.startShimmer(); s3.startShimmer();

        sh = new Handler();

        sh.postDelayed(() -> {
            s1.stopShimmer();
            s1.setVisibility(View.GONE);

            s2.stopShimmer();
            s2.setVisibility(View.GONE);

            s3.stopShimmer();
            s3.setVisibility(View.GONE);

            vp.setVisibility(View.VISIBLE);
            addDots(0);

        },3500);


        Objects.requireNonNull(getSupportActionBar()).hide();

        list.add(new slideritem("Management","do management effectively with our help ...",R.drawable.img1));
        list.add(new slideritem("Presentation","Make stunning and impressive presentations ...",R.drawable.img2));
        list.add(new slideritem("Effective","Work effectively from anywhere any time  ...",R.drawable.img4));
        list.add(new slideritem("Success","Make, your company grow and let catch the success ...",R.drawable.img3));

        slider_adapter adapter = new slider_adapter(this, list);
        vp.setAdapter(adapter);
        vp.setOffscreenPageLimit(4);
        vp.addOnPageChangeListener(viewListener);

        final Handler handler = new Handler();
        final Runnable Update = () -> {
            if (currentPage[0] == 4) {
                currentPage[0] = 0;
            }
            vp.setCurrentItem(currentPage[0]++, true);
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);
    }

    private void addDots(int p){
        dots = new TextView[pages];
        LinearLayout DotsLayout = findViewById(R.id.dotslayout);
        DotsLayout.setVisibility(View.VISIBLE);
        DotsLayout.removeAllViews();

        for(int i=0; i < pages; i++){
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(34);
            dots[i].setTextColor(getResources().getColor(R.color.blue));

            DotsLayout.addView(dots[i]);
        }
        
        if(dots.length > 0){
            dots[p].setTextColor(getResources().getColor(R.color.dblue));
        }
    }
    
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            
        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
package com.example.e_commerce_issue_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        DummyData data = new DummyData();
        data.setAdvertisemntsList();
        data.setCategoryList();
        data.setDealList();

        final ArrayList<String> advertisemntsList = data.getAdvertisemntsList();
        SliderAdapter advertisementSlider = new SliderAdapter(advertisemntsList,this);

        final ArrayList<Category> CategoryList = data.getCategoryList();
        CategoryAdapter categories = new CategoryAdapter(this,CategoryList);

        final ArrayList<Deals> DealsList = data.getDealList();
        DelasAdapter dealsAdapter = new DelasAdapter(this,DealsList);

        final int[] currentPage = {0};
        final long DELAY_MS = 3000;
        final long PERIOD_MS = 5000;

        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv.setAdapter(advertisementSlider);


        RecyclerView rvc = findViewById(R.id.rvc);
        rvc.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvc.setAdapter(categories);

        RecyclerView dealView = findViewById(R.id.deals);
        dealView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        dealView.setAdapter(dealsAdapter);

        final Handler handler = new Handler();
        final Runnable Update = () -> {
            if (currentPage[0] == 6) {
                currentPage[0] = 0;
            }

            rv.smoothScrollToPosition(currentPage[0]++);
        };

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);

    }
}
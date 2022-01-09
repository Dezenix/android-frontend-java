package com.example.musicly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainHome extends AppCompatActivity {

    BottomNavigationView bNV;
    Fragment f1, f2, f3 = null;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        Objects.requireNonNull(getSupportActionBar()).hide();

        if(Build.VERSION.SDK_INT > 21){
            getWindow().setStatusBarColor(getResources().getColor(R.color.bg));
        }

        f1 = new Home();
        f2 = new search();
        f3 = new Library();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, f1).commit();
        bNV = findViewById(R.id.bnv);
        bNV.setSelectedItemId(R.id.home);

        bNV.setOnItemSelectedListener(i -> {
            int id = i.getItemId();

            switch (id) {
                case R.id.home : {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, f1).commit();
                    return true;
                }

                case R.id.search2 : {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, f2).commit();
                    return true;
                }

                case R.id.library : {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, f3).commit();
                    return true;
                }
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container, f1).commit();

            return true;
        });
    }
}
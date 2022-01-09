package com.example.musicly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class music_play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_play);

        CardView puase;
        ImageView back_to_home,poster,play;
        TextView title;

        AtomicBoolean isPaused = new AtomicBoolean(true);
        Objects.requireNonNull(getSupportActionBar()).hide();

        if(Build.VERSION.SDK_INT > 21){
            getWindow().setStatusBarColor(getResources().getColor(R.color.bg));
        }


        String imgsrc = getIntent().getStringExtra("Img");
        String title_ = getIntent().getStringExtra("Name");

        title = findViewById(R.id.song_name);
        poster = findViewById(R.id.song_poster);
        back_to_home = findViewById(R.id.back_home);
        puase = findViewById(R.id.playcon);
        play = findViewById(R.id.play);

        title.setText(title_);
        Glide.with(this).load(Uri.parse(imgsrc)).into(poster);
        back_to_home.setOnClickListener(v -> {
            onBackPressed();
        });

        puase.setOnClickListener(v -> {
            if(isPaused.get()){
                play.setImageResource(R.drawable.pause);
                isPaused.set(false);
            }else{
                play.setImageResource(R.drawable.forward);
                isPaused.set(true);
            }
        });
    }
}
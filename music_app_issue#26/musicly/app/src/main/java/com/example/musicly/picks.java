package com.example.musicly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class picks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picks);

        Objects.requireNonNull(getSupportActionBar()).hide();

        DummyData data = new DummyData();
        data.setLangs();

        CardView next = findViewById(R.id.next);
        next.setCardBackgroundColor(getResources().getColor(R.color.pink));

        languageAdapter adpter = new languageAdapter(this,data.getLangs());

        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this,3));
        rv.setAdapter(adpter);

        next.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainHome.class);
            startActivity(intent);
        });
    }
}
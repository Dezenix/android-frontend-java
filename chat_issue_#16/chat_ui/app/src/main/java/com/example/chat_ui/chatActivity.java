package com.example.chat_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class chatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        dummy_data data = new dummy_data();
        data.setchatsData();

        List<messages> chatsData = data.getChatsData();



        Objects.requireNonNull(getSupportActionBar()).hide();

        CardView back = findViewById(R.id.back);
        TextView nameTitle = findViewById(R.id.name_chat);
        CircleImageView pic = findViewById(R.id.chat_profilePic);
        ImageView send = findViewById(R.id.send);
        EditText message = findViewById(R.id.messageType);

        back.setOnClickListener(v -> {
            onBackPressed();
        });

        String name = getIntent().getStringExtra("Name");
        String picUrl = getIntent().getStringExtra("Pic");


        nameTitle.setText(name);
        Picasso.with(this).load(Uri.parse(picUrl)).into(pic);

        RecyclerView mes = findViewById(R.id.messages);

        mes.setLayoutManager(new LinearLayoutManager(this));
        messagesAdapter adapter = new messagesAdapter(this,chatsData);

        mes.setAdapter(adapter);

        message.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() != 0){
                    send.setImageResource(R.drawable.send);
                }else{
                    send.setImageResource(R.drawable.mke);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
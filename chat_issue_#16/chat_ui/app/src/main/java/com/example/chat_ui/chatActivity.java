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

        List<messages> chatsData = new ArrayList<>();

        chatsData.add(new messages(
                "12/12/2021",
                "4:09 pm",
                true,
                true,
                false,
                true,
                false,
                "Hello, How are you ?",
                null,
                null
        ));

        chatsData.add(new messages(
                "12/12/2021",
                "4:10 pm",
                false,
                true,
                false,
                false,
                false,
                "Hey, Bruce! its been a while ?",
                null,
                null
        ));

        chatsData.add(new messages(
                "12/12/2021",
                "4:10 pm",
                false,
                true,
                false,
                false,
                false,
                "What's up ?",
                null,
                null
        ));

        chatsData.add(new messages(
                "12/12/2021",
                "4:11 pm",
                false,
                true,
                false,
                true,
                false,
                "I wonder if you would like to watch movie tonight ?",
                null,
                null
        ));

        chatsData.add(new messages(
                "12/12/2021",
                "4:13 pm",
                false,
                true,
                false,
                false,
                false,
                "Sound's like a good idea!",
                null,
                null
        ));

        chatsData.add(new messages(
                "Today",
                "11:10 AM",
                true,
                false,
                false,
                true,
                true,
                null,
                null,
                "https://media.istockphoto.com/photos/mountain-landscape-picture-id517188688?k=20&m=517188688&w=0&h=pCjvUkNlz9_esVvQw2Wgc8VJZBMgJrB0FQmktCA0KYY="
        ));

        chatsData.add(new messages(
                "Today",
                "11:20 AM",
                false,
                false,
                true,
                false,
                false,
                null,
                "https://i.pinimg.com/originals/9c/b0/70/9cb070d62dc738a0c3a1a408d68e4af5.jpg",
                null
        ));



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
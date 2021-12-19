package com.example.chat_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        dummy_data data = new dummy_data();
        data.setChatsListData();

        List<Chats> myChatList = data.getChatsListData();

        RecyclerView rv = (RecyclerView) findViewById(R.id.chatList);

        chatListAdapter cla = new chatListAdapter(this,myChatList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(cla);
    }
}
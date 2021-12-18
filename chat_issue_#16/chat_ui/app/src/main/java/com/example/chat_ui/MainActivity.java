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

        List<chats> myChatList = new ArrayList<>();
        myChatList.add(new chats("https://data.whicdn.com/images/322027365/original.jpg?t=1541703413","Hinata Soyo","How are you doing ?","11:12 PM",true));
        myChatList.add(new chats("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlPImnDB6IZL3d0IunomCQPp857MLDo2E3BDUlANfWUVeaSilrDuiCm_O3R5IGl24DjYk&usqp=CAU","Kagayama","will you come for tommorrow training ?","10:10 PM",false));
        myChatList.add(new chats("https://images.unsplash.com/photo-1594751543129-6701ad444259?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZGFyayUyMHByb2ZpbGV8ZW58MHx8MHx8&w=1000&q=80","Levi","hey, have you done your homework ?","11:30 PM",true));
        myChatList.add(new chats("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAyJtsX5lnJz8x7inT4CJsUbqAHlua5qhMKQ&usqp=CAU","Mikasa","hi  ?","09:10 PM",false));
        myChatList.add(new chats("https://miro.medium.com/max/1400/0*0fClPmIScV5pTLoE.jpg","Honji","How are you doing ?","08:08 PM",true));
        myChatList.add(new chats("https://cdn.myanimelist.net/images/characters/6/245977.jpg","Orikava","Hey, you ?","YesterDay",false));
        myChatList.add(new chats("https://hi-static.z-dn.net/files/da1/83aa433aa19961b8affa80b088a2f83a.jpg","Ken Kaneki","greate to meet you ?","09/12/2020",true));
        myChatList.add(new chats("https://i.pinimg.com/originals/a9/fc/27/a9fc27ab21fb5c1931eab62f7dfb38ce.jpg","Touka Kirishima","hello , ?","10/12/2012",false));
        myChatList.add(new chats("https://static0.cbrimages.com/wordpress/wp-content/uploads/2019/10/Featured-Image-9.jpg","Light Yagami","i am kira ?","12:12 PM",true));
        myChatList.add(new chats("https://static1.cbrimages.com/wordpress/wp-content/uploads/2019/09/Death-Note-Origins-Of-Ls-Nickname.jpg?q=50&fit=crop&w=963&h=481&dpr=1.5","L","come to my office ?","11:34 PM",true));

        RecyclerView rv = (RecyclerView) findViewById(R.id.chatList);

        chatListAdapter cla = new chatListAdapter(this,myChatList);
        Log.e("COunt : ", cla.getItemCount() + " " );
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(cla);



        Objects.requireNonNull(getSupportActionBar()).hide();


    }
}
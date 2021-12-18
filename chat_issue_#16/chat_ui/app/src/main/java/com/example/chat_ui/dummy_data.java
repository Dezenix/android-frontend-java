package com.example.chat_ui;

import java.util.ArrayList;
import java.util.List;

public class dummy_data {
    private final List<messages> chatsData = new ArrayList<>();
    private final List<chats> myChatList = new ArrayList<>();

    public void setChatsListData(){
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
    }

    public List<chats> getChatsListData(){
        return myChatList;
    }

    public void setchatsData(){

        messages m1 = new messages();
        m1.setDate("12/12/2021");
        m1.setTime("4:09 pm");
        m1.setNewDate(true);
        m1.setTextMessage(true);
        m1.setSender(true);
        m1.setText("Hello, How are you ?");

        messages m2 = new messages();
        m2.setDate("12/12/2021");
        m2.setTime("4:10 pm");
        m2.setTextMessage(true);
        m2.setText("Hey, Bruce! its been a while ?");

        messages m3 = new messages();
        m3.setDate("12/12/2021");
        m3.setTime("4:10 pm");
        m3.setTextMessage(true);
        m3.setText("What's up ?");

        messages m4 = new messages();
        m4.setDate("12/12/2021");
        m4.setTime("4:11 pm");
        m4.setTextMessage(true);
        m4.setSender(true);
        m4.setText("I wonder if you would like to watch movie tonight ?");

        messages m5 = new messages();
        m5.setDate("12/12/2021");
        m5.setTime("4:13 pm");
        m5.setTextMessage(true);
        m5.setText("Sound's like a good idea!");

        messages m6 = new messages();
        m6.setDate("Today");
        m6.setTime("11:10 AM");
        m6.setNewDate(true);
        m6.setSender(true);
        m6.setImageMessage(true);
        m6.setImgUrl("https://media.istockphoto.com/photos/mountain-landscape-picture-id517188688?k=20&m=517188688&w=0&h=pCjvUkNlz9_esVvQw2Wgc8VJZBMgJrB0FQmktCA0KYY=");

        messages m7 = new messages();
        m7.setDate("Today");
        m7.setTime("11:20 AM");
        m7.setVideoMessage(true);
        m7.setVideoUrl("https://i.pinimg.com/originals/9c/b0/70/9cb070d62dc738a0c3a1a408d68e4af5.jpg");


        chatsData.add(m1);
        chatsData.add(m2);
        chatsData.add(m3);
        chatsData.add(m4);
        chatsData.add(m5);
        chatsData.add(m6);
        chatsData.add(m7);

    }

    public List<messages> getChatsData() {
        return chatsData;
    }
}

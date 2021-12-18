package com.example.chat_ui;

import java.util.ArrayList;
import java.util.List;

public class dummy_data {
    private final List<Messages> chatsData = new ArrayList<>();
    private final List<Chats> myChatList = new ArrayList<>();

    public void setChatsListData() {
        Chats c1 = new Chats.ChatBuilder()
                .setProfilePic("https://data.whicdn.com/images/322027365/original.jpg?t=1541703413")
                .setName("Hinata Soyo")
                .setMessage("How are you doing ?")
                .setTime("11:12 PM")
                .setNew(true).build();

        Chats c2 = new Chats.ChatBuilder()
                .setProfilePic("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlPImnDB6IZL3d0IunomCQPp857MLDo2E3BDUlANfWUVeaSilrDuiCm_O3R5IGl24DjYk&usqp=CAU")
                .setName("Kagayama")
                .setMessage("will you come for tommorrow training ?")
                .setTime("10:10 PM")
                .setNew(false).build();

        Chats c3 = new Chats.ChatBuilder()
                .setProfilePic("https://images.unsplash.com/photo-1594751543129-6701ad444259?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZGFyayUyMHByb2ZpbGV8ZW58MHx8MHx8&w=1000&q=80")
                .setName("Levi")
                .setMessage("hey, have you done your homework ?")
                .setTime("11:30 PM")
                .setNew(true).build();

        Chats c4 = new Chats.ChatBuilder()
                .setProfilePic("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAyJtsX5lnJz8x7inT4CJsUbqAHlua5qhMKQ&usqp=CAU")
                .setName("Mikasa")
                .setMessage("hi  ?")
                .setTime("09:10 PM")
                .setNew( false).build();

        Chats c5 = new Chats.ChatBuilder()
                .setProfilePic("https://miro.medium.com/max/1400/0*0fClPmIScV5pTLoE.jpg")
                .setName("Honji")
                .setMessage("How are you doing ?")
                .setTime("08:08 PM")
                .setNew(true).build();

        Chats c6 = new Chats.ChatBuilder()
                .setProfilePic("https://cdn.myanimelist.net/images/characters/6/245977.jpg")
                .setName("Orikava")
                .setMessage("Hey, you ?")
                .setTime("YesterDay")
                .setNew(false).build();

        Chats c7 = new Chats.ChatBuilder()
                .setProfilePic("https://hi-static.z-dn.net/files/da1/83aa433aa19961b8affa80b088a2f83a.jpg")
                .setName("Ken Kaneki")
                .setMessage("greate to meet you ?")
                .setTime("09/12/2020")
                .setNew(true).build();

        Chats c8 = new Chats.ChatBuilder()
                .setProfilePic("https://i.pinimg.com/originals/a9/fc/27/a9fc27ab21fb5c1931eab62f7dfb38ce.jpg")
                .setName("Touka Kirishima")
                .setMessage("hello , ?")
                .setTime("10/12/2012")
                .setNew(false).build();

        Chats c9 = new Chats.ChatBuilder()
                .setProfilePic("https://static0.cbrimages.com/wordpress/wp-content/uploads/2019/10/Featured-Image-9.jpg")
                .setName("Light Yagami")
                .setMessage("i am kira ?")
                .setTime("12:12 PM")
                .setNew(true).build();

        Chats c10 = new Chats.ChatBuilder()
                .setProfilePic("https://static1.cbrimages.com/wordpress/wp-content/uploads/2019/09/Death-Note-Origins-Of-Ls-Nickname.jpg?q=50&fit=crop&w=963&h=481&dpr=1.5")
                .setName("L")
                .setMessage("come to my office ?")
                .setTime("11:34 PM")
                .setNew(true).build();

        myChatList.add(c1);
        myChatList.add(c2);
        myChatList.add(c3);
        myChatList.add(c4);
        myChatList.add(c5);
        myChatList.add(c6);
        myChatList.add(c7);
        myChatList.add(c8);
        myChatList.add(c9);
        myChatList.add(c10);


    }

    public List<Chats> getChatsListData() {
        return myChatList;
    }

    public void setchatsData() {

        Messages m1 = new Messages.MessageBuilder()
                .setDate("12/12/2021")
                .setTime("4:09 pm")
                .setNewDate(true)
                .setTextMessage(true)
                .setSender(true)
                .setText("Hello, How are you ?").build();

        Messages m2 = new Messages.MessageBuilder()
                .setDate("12/12/2021")
                .setTime("4:10 pm")
                .setTextMessage(true)
                .setText("Hey, Bruce! its been a while ?").build();

        Messages m3 = new Messages.MessageBuilder()
                .setDate("12/12/2021")
                .setTime("4:10 pm")
                .setTextMessage(true)
                .setText("What's up ?").build();

        Messages m4 = new Messages.MessageBuilder()
                .setDate("12/12/2021")
                .setTime("4:11 pm")
                .setTextMessage(true)
                .setSender(true)
                .setText("I wonder if you would like to watch movie tonight ?").build();

        Messages m5 = new Messages.MessageBuilder()
                .setDate("12/12/2021")
                .setTime("4:13 pm")
                .setTextMessage(true)
                .setText("Sound's like a good idea!").build();

        Messages m6 = new Messages.MessageBuilder()
                .setDate("Today")
                .setTime("11:10 AM")
                .setNewDate(true)
                .setSender(true)
                .setImageMessage(true)
                .setImgUrl("https://media.istockphoto.com/photos/mountain-landscape-picture-id517188688?k=20&m=517188688&w=0&h=pCjvUkNlz9_esVvQw2Wgc8VJZBMgJrB0FQmktCA0KYY=").build();

        Messages m7 = new Messages.MessageBuilder()
                .setDate("Today")
                .setTime("11:20 AM")
                .setVideoMessage(true)
                .setVideoUrl("https://i.pinimg.com/originals/9c/b0/70/9cb070d62dc738a0c3a1a408d68e4af5.jpg").build();


        chatsData.add(m1);
        chatsData.add(m2);
        chatsData.add(m3);
        chatsData.add(m4);
        chatsData.add(m5);
        chatsData.add(m6);
        chatsData.add(m7);

    }

    public List<Messages> getChatsData() {
        return chatsData;
    }
}

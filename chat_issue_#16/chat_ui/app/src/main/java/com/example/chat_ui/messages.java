package com.example.chat_ui;

public class messages {

    private String date;
    private String time;
    private boolean isNewDate;
    private boolean isTextMessage;
    private boolean isVideoMessage;
    private boolean isImageMessage;
    private boolean isSender;
    private String text;
    private  String videoUrl;
    private String imgUrl;

    public messages(String date,String time, boolean isNewDate, boolean isTextMessage, boolean isVideoMessage, boolean isSender, boolean isImageMessage, String text,String videoUrl,String imgUrl){
        this.date = date;
        this.time = time;
        this.isNewDate = isNewDate;
        this.isTextMessage = isTextMessage;
        this.isVideoMessage = isVideoMessage;
        this.isImageMessage = isImageMessage;
        this.text = text;
        this.videoUrl = videoUrl;
        this.imgUrl = imgUrl;
        this.isSender = isSender;
    }


    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getText() {
        return text;
    }

    public boolean isImageMessage() {
        return isImageMessage;
    }

    public boolean isNewDate() {
        return isNewDate;
    }

    public boolean isTextMessage() {
        return isTextMessage;
    }

    public boolean isVideoMessage() {
        return isVideoMessage;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImageMessage(boolean imageMessage) {
        isImageMessage = imageMessage;
    }

    public void setNewDate(boolean newDate) {
        isNewDate = newDate;
    }

    public void setTextMessage(boolean textMessage) {
        isTextMessage = textMessage;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setVideoMessage(boolean videoMessage) {
        isVideoMessage = videoMessage;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isSender() {
        return isSender;
    }

    public void setSender(boolean sender) {
        isSender = sender;
    }
}

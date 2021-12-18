package com.example.chat_ui;

public class Messages {

    private String date = null;
    private String time = null;
    private boolean isNewDate = false;
    private boolean isTextMessage = false;
    private boolean isVideoMessage = false;
    private boolean isImageMessage = false;
    private boolean isSender = false;
    private String text = null;
    private  String videoUrl = null;
    private String imgUrl = null;

    public Messages(MessageBuilder mb){
        this.date = mb.date;
        this.time = mb.time;
        this.isNewDate = mb.isNewDate;
        this.isTextMessage = mb.isTextMessage;
        this.isVideoMessage = mb.isVideoMessage;
        this.isImageMessage = mb.isImageMessage;
        this.isSender = mb.isSender;
        this.text = mb.text;
        this.videoUrl = mb.videoUrl;
        this.imgUrl = mb.imgUrl;
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

    public boolean isSender() {
        return isSender;
    }

    public static class MessageBuilder {
        private String date;
        private String time;
        private boolean isNewDate = false;
        private boolean isTextMessage = false;
        private boolean isVideoMessage = false;
        private boolean isImageMessage = false;
        private boolean isSender = false;
        private String text = null;
        private  String videoUrl = null;
        private String imgUrl = null;

        public MessageBuilder setTime(String time) {
            this.time = time;
            return this;
        }

        public MessageBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public MessageBuilder setImageMessage(boolean imageMessage) {
            isImageMessage = imageMessage;
            return this;
        }

        public MessageBuilder setNewDate(boolean newDate) {
            isNewDate = newDate;
            return this;
        }

        public MessageBuilder setTextMessage(boolean textMessage) {
            isTextMessage = textMessage;
            return this;
        }

        public MessageBuilder setText(String text) {
            this.text = text;
            return this;
        }

        public MessageBuilder setVideoMessage(boolean videoMessage) {
            isVideoMessage = videoMessage;
            return this;
        }

        public MessageBuilder setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
            return this;
        }

        public MessageBuilder setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }

        public MessageBuilder setSender(boolean sender) {
            isSender = sender;
            return this;
        }

        public Messages build(){
            return new Messages(this);
        }
    }
}



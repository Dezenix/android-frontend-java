package com.example.chat_ui;

public class Chats {
    private String profilePic;
    private String name;
    private String message;
    private String time;
    private boolean isNew;

    public Chats(ChatBuilder ch){
        profilePic = ch.profilePic;
        name = ch.name;
        message = ch.message;
        time = ch.time;
        isNew = ch.isNew;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public static class ChatBuilder {
        private String profilePic;
        private String name;
        private String message;
        private String time;
        private boolean isNew;

        public ChatBuilder setProfilePic(String profilePic) {
            this.profilePic = profilePic;
            return this;
        }

        public ChatBuilder setName(String name) {
            this.name = name;
            return this;
        }


        public ChatBuilder setMessage(String message) {
            this.message = message;
            return this;
        }

        public ChatBuilder setTime(String time) {
            this.time = time;
            return this;
        }

        public ChatBuilder setNew(boolean aNew) {
            isNew = aNew;
            return this;
        }

        public Chats build(){
            return new Chats(this);
        }
    }
}

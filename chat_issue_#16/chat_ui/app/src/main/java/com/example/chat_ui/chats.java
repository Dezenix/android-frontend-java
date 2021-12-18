package com.example.chat_ui;

public class chats {
    private String profilePic;
    private String name;
    private String message;
    private String time;
    private boolean isNew;

    public chats(String p,String n,String m,String t,boolean i){
        profilePic = p;
        name = n;
        message = m;
        time = t;
        isNew = i;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

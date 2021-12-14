package com.example.slider;

public class slideritem {
    private String title,desc;
    private int img;

    public slideritem(String t,String d,int i){
        title = t;
        desc = d;
        img = i;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}

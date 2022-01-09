package com.example.musicly;

public class PopularModal {
    String img,name;

    public PopularModal(PopularBuilder pb){
        this.img = pb.img;
        this.name = pb.name;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public static class PopularBuilder {
        String img,name;

        public PopularBuilder setImg(String img) {
            this.img = img;
            return this;
        }

        public PopularBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PopularModal build(){
            return new PopularModal(this);
        }
    }
}

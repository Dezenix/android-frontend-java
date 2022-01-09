package com.example.musicly;

public class LibraryModal {
    String img,name,type;

    public LibraryModal(LibraryModal.LibraryBuilder pb){
        this.img = pb.img;
        this.name = pb.name;
        this.type = pb.type;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public String getType() {
        return type;
    }

    public static class LibraryBuilder {
        String img,name,type;

        public LibraryBuilder setImg(String img) {
            this.img = img;
            return this;
        }

        public LibraryBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public LibraryBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public LibraryModal build(){
            return new LibraryModal(this);
        }
    }
}

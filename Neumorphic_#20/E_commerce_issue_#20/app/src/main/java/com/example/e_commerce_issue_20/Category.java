package com.example.e_commerce_issue_20;

public class Category {
    private String url;
    private String name;
    private String color;

    public Category(CategoryBuilder cb){
        url = cb.url;
        name = cb.name;
        color = cb.color;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getColor() {
        return color;
    }

    public static class CategoryBuilder {

        private String url;
        private String name;
        private String color;

        public CategoryBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CategoryBuilder setUrl(String url) {
            this.url = url;
            return this;
        }

        public CategoryBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Category build(){
            return new Category(this);
        }
    }


}

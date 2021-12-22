package com.example.e_commerce_issue_20;

public class Deals {
    private String imgUrl,companyName,productName,price;

    public Deals(DealsBuilder db){
        imgUrl = db.imgUrl;
        companyName = db.companyName;
        productName = db.productName;
        price = db.price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public static class DealsBuilder {
        private String imgUrl,companyName,productName,price;

        public DealsBuilder setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
            return this;
        }

        public DealsBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public DealsBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public DealsBuilder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Deals build(){
            return  new Deals(this);
        }
    }
}

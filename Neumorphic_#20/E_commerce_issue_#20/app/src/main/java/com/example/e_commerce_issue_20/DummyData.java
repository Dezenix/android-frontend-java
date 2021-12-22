package com.example.e_commerce_issue_20;

import java.util.ArrayList;

public class DummyData {

    private final ArrayList<String> advertisemntsList = new ArrayList<>();
    private final ArrayList<Category> CategoryList = new ArrayList<>();
    private final ArrayList<Deals> dealList = new ArrayList<>();

    public void setAdvertisemntsList(){
        advertisemntsList.add("https://i1.wp.com/www.nylon.com.sg/wp-content/uploads/2018/11/XMASCAM002_mediabuy.jpg?resize=525%2C275&ssl=1");
        advertisemntsList.add("https://cdna.artstation.com/p/assets/images/images/036/002/188/large/m-n-vinit-img-20210322-204116-186.jpg?1616482578&dl=1");
        advertisemntsList.add("https://i.pinimg.com/736x/7b/bc/b7/7bbcb78eecf5517dc617c31aea122c7c.jpg");
        advertisemntsList.add("https://image.freepik.com/free-vector/elegant-fashion-poster-template_1361-1220.jpg");
        advertisemntsList.add("https://ak.picdn.net/shutterstock/videos/1036421099/thumb/4.jpg");
        advertisemntsList.add("https://image.shutterstock.com/image-vector/kids-fashion-retro-boutique-sign-260nw-2034999935.jpg");
    }

    public ArrayList<String> getAdvertisemntsList() {
        return advertisemntsList;
    }

    public void setCategoryList(){

        Category c1 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/933/933756.png")
                .setName("shoes").setColor("#EA6161").build();

        Category c2 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/892/892458.png")
                .setName("Shirts").setColor("#3CC2FF").build();

        Category c3 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/413/413403.png")
                .setName("Shorts").setColor("#F64811").build();

        Category c4 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/2920/2920329.png")
                .setName("Phones").setColor("#83385714").build();

        Category c5 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/6379/6379975.png")
                .setName("Watch").setColor("#FF000000").build();

        Category c6 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/2310/2310554.png")
                .setName("Pants").setColor("#905BEF").build();

        Category c7 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/6350/6350616.png")
                .setName("Dresses").setColor("#0E8367").build();

        Category c8 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/417/417435.png")
                .setName("KitchenWare").setColor("#EA9409").build();

        Category c9 = new Category.CategoryBuilder()
                .setUrl("https://cdn-icons-png.flaticon.com/512/3768/3768870.png")
                .setName("Winter").setColor("#0827BF").build();

        CategoryList.add(c1);
        CategoryList.add(c2);
        CategoryList.add(c3);
        CategoryList.add(c4);
        CategoryList.add(c5);
        CategoryList.add(c6);
        CategoryList.add(c7);
        CategoryList.add(c8);
        CategoryList.add(c9);
    }

    public ArrayList<Category> getCategoryList() {
        return CategoryList;
    }

    public void setDealList(){
        Deals d1 = new Deals.DealsBuilder()
                .setImgUrl("https://5.imimg.com/data5/SELLER/Default/2020/9/WW/OZ/AD/113537169/nike-red-running-shoes-sdl521361971-1-72922-500x500.jpeg")
                .setCompanyName("Nike").setProductName("Men's Running shoe").setPrice("$99").build();

        Deals d2 = new Deals.DealsBuilder()
                .setImgUrl("https://allensolly.imgix.net/img/app/product/4/493430-3694211.jpg")
                .setCompanyName("Allen Sony").setProductName("Men's white shirt").setPrice("$49").build();

        Deals d3 = new Deals.DealsBuilder()
                .setImgUrl("https://m.media-amazon.com/images/I/31eXFiPjOEL.jpg")
                .setCompanyName("Buffalo").setProductName("Solid Mid Jeans").setPrice("$69").build();

        Deals d4 = new Deals.DealsBuilder()
                .setImgUrl("https://i.gadgets360cdn.com/products/large/xiaomi-mi-9t-db-369x800-1560921039.jpg")
                .setCompanyName("MI").setProductName("MI 9T").setPrice("$199").build();

        Deals d5 = new Deals.DealsBuilder()
                .setImgUrl("https://m.media-amazon.com/images/I/81Z39GDgaoL._AC_UL320_.jpg")
                .setCompanyName("Levi's").setProductName("Women's jeans").setPrice("$64").build();

        dealList.add(d1);
        dealList.add(d2);
        dealList.add(d3);
        dealList.add(d4);
        dealList.add(d5);

    }

    public ArrayList<Deals> getDealList() {
        return dealList;
    }
}

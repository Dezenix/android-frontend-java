package com.example.musicly;

import java.util.ArrayList;

public class DummyData {

    private final ArrayList<String> langs;
    private final ArrayList<PopularModal> popular;
    private final ArrayList<PopularModal> artist;
    private final ArrayList<PopularModal> recent;
    private final ArrayList<LibraryModal> playlist;
    private final ArrayList<PopularModal> searchcat;

    public DummyData(){
        langs = new ArrayList<>();
        popular = new ArrayList<>();
        artist = new ArrayList<>();
        recent = new ArrayList<>();
        playlist = new ArrayList<>();
        searchcat = new ArrayList<>();
    }

    public ArrayList<String> getLangs() {
        return langs;
    }

    public ArrayList<PopularModal> getArtist() {
        return artist;
    }

    public ArrayList<PopularModal> getPopular() {
        return popular;
    }

    public ArrayList<LibraryModal> getPlaylist() {
        return playlist;
    }

    public ArrayList<PopularModal> getRecent() {
        return recent;
    }

    public ArrayList<PopularModal> getSearchcat() {
        return searchcat;
    }

    public void setLangs() {
        langs.add("Hindi");
        langs.add("English");
        langs.add("Punjabi");

        langs.add("Gujarati");
        langs.add("Marathi");
        langs.add("Bengali");

        langs.add("Tamail");
        langs.add("Telegu");
        langs.add("Kannad");

        langs.add("French");
        langs.add("japaneze");
        langs.add("spanish");
    }

    public void setPopular() {
        PopularModal pm1 = new PopularModal.PopularBuilder().setImg("https://i.scdn.co/image/ab67616d0000b2739e2f95ae77cf436017ada9cb").setName("Counting Stars").build();
        PopularModal pm2 = new PopularModal.PopularBuilder().setImg("https://img.youtube.com/vi/dhYOPzcsbGM/hqdefault.jpg").setName("On My Way").build();
        PopularModal pm3 = new PopularModal.PopularBuilder().setImg("https://a10.gaanacdn.com/images/albums/15/1611915/crop_480x480_1611915.jpg").setName("Unstoppable").build();
        PopularModal pm4 = new PopularModal.PopularBuilder().setImg("https://images.genius.com/46104ca4fce5313335461063987e4f2c.1000x1000x1.png").setName("Enemy").build();
        PopularModal pm5 = new PopularModal.PopularBuilder().setImg("https://images.genius.com/c93ba6fa10f7b55db8266a01e96893f7.1000x1000x1.jpg").setName("Lose You To Love Me").build();

        popular.add(pm1);
        popular.add(pm2);
        popular.add(pm3);
        popular.add(pm4);
        popular.add(pm5);

    }

    public void setRecent() {
        PopularModal pm1 = new PopularModal.PopularBuilder().setImg("https://consequence.net/wp-content/uploads/2018/04/billie-eilish-khalid-lovely-song-stream.png").setName("Lovely").build();
        PopularModal pm2 = new PopularModal.PopularBuilder().setImg("https://img.discogs.com/NcScCQyqNSlREmSeftTVJuOHh1g=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-13398466-1553446560-6866.jpeg.jpg").setName("On My Way").build();
        PopularModal pm3 = new PopularModal.PopularBuilder().setImg("https://farm6.staticflickr.com/5834/23015814503_f55dde15d8_o.png").setName("Hymm For Weekend").build();
        PopularModal pm4 = new PopularModal.PopularBuilder().setImg("https://i.scdn.co/image/ab67616d0000b273a108e07c661f9fc54de9c43a").setName("Lily").build();
        PopularModal pm5 = new PopularModal.PopularBuilder().setImg("https://images.genius.com/c93ba6fa10f7b55db8266a01e96893f7.1000x1000x1.jpg").setName("Lose You To Love Me").build();

        recent.add(pm1);
        recent.add(pm2);
        recent.add(pm3);
        recent.add(pm4);
        recent.add(pm5);

    }

    public void setArtist() {
        PopularModal pm1 = new PopularModal.PopularBuilder().setImg("https://www.rollingstone.com/wp-content/uploads/2018/11/IMAGINE-DRAGONS-2019-by-Eric-Ray-Davidson.jpg").setName("Imagine Dragons").build();
        PopularModal pm2 = new PopularModal.PopularBuilder().setImg("https://pbs.twimg.com/profile_images/1464164070047862784/FCqkIsM3_400x400.jpg").setName("Alan Walker").build();
        PopularModal pm3 = new PopularModal.PopularBuilder().setImg("https://i.scdn.co/image/ab6761610000e5ebe8637c96a7aa2917eae3c54d").setName("Sia").build();
        PopularModal pm4 = new PopularModal.PopularBuilder().setImg("https://upload.wikimedia.org/wikipedia/commons/8/85/Selena_Gomez_-_Walmart_Soundcheck_Concert.jpg").setName("Salena Gomez").build();
        PopularModal pm5 = new PopularModal.PopularBuilder().setImg("https://upload.wikimedia.org/wikipedia/commons/6/66/AR_Rahman_2021.png").setName("A R Rehman").build();

        artist.add(pm1);
        artist.add(pm2);
        artist.add(pm3);
        artist.add(pm4);
        artist.add(pm5);
    }

    public void setPlaylist(){
        LibraryModal lm1 = new LibraryModal.LibraryBuilder()
                .setImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMU4oQ32ZEy3lJIHKPBM1cVhp3S8-aMeaSIWmtkBjLlTATUJXG5vpEp6PZ6nQv7lTsxjw&usqp=CAU")
                .setName("OneRepublic")
                .setType("Artist").build();

        LibraryModal lm2 = new LibraryModal.LibraryBuilder()
                .setImg("https://pbs.twimg.com/profile_images/1433640996600909836/SUHA-1Fu_400x400.jpg")
                .setName("Imagine Dragons")
                .setType("Artist").build();

        LibraryModal lm3 = new LibraryModal.LibraryBuilder()
                .setImg("https://images.squarespace-cdn.com/content/v1/5c24e1369f87703118826a65/1547588926783-WA2TA25Y3AYNZ2EZKR7T/image-asset.jpeg?format=1000w")
                .setName("Morning")
                .setType("Playlist").build();

        LibraryModal lm4 = new LibraryModal.LibraryBuilder()
                .setImg("https://cdns-images.dzcdn.net/images/cover/6fbae27eb038740bfc95713553ca2a27/500x500.jpg")
                .setName("sleep")
                .setType("Playlist").build();

        playlist.add(lm1);
        playlist.add(lm2);
        playlist.add(lm3);
        playlist.add(lm4);
    }

    public void setSearchcat(){

        PopularModal pm1 = new PopularModal.PopularBuilder()
                .setImg("https://cdn-icons-png.flaticon.com/512/3208/3208679.png")
                .setName("New Release").build();

        PopularModal pm2 = new PopularModal.PopularBuilder()
                .setImg("https://cdn-icons-png.flaticon.com/512/1830/1830825.png")
                .setName("Made For You").build();

        PopularModal pm3 = new PopularModal.PopularBuilder()
                .setImg("https://cdn-icons-png.flaticon.com/512/1753/1753311.png")
                .setName("Concerts").build();

        PopularModal pm4 = new PopularModal.PopularBuilder()
                .setImg("https://cdn-icons-png.flaticon.com/512/2699/2699194.png")
                .setName("Bollywood").build();

        PopularModal pm5 = new PopularModal.PopularBuilder()
                .setImg("https://cdn-icons-png.flaticon.com/512/4381/4381521.png")
                .setName("k-POP").build();

        PopularModal pm6 = new PopularModal.PopularBuilder()
                .setImg("https://cdn-icons-png.flaticon.com/512/1161/1161619.png")
                .setName("Party").build();

        searchcat.add(pm1);
        searchcat.add(pm2);
        searchcat.add(pm3);
        searchcat.add(pm4);
        searchcat.add(pm5);
        searchcat.add(pm6);
    }
}

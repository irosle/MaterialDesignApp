package com.example.javier.MaterialDesignApp.RecyclerViewClasses;


public class News {

    String title;
    String excerpt;
    String image;

    public News(String title, String excerpt, String image) {
        this.title = title;
        this.excerpt = excerpt;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public String getImage() {
        return image;
    }
}

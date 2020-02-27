package com.example.recyclerviewdesign;

import android.graphics.drawable.Drawable;

public class users {

    private String name;
    private  int id;
    private Drawable img;
    private  String urls;

    public users(String name, int id, Drawable img,String urls) {
        this.name = name;
        this.id = id;
        this.img = img;
        this.urls=urls;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Drawable getImg() {
        return img;
    }
    public String getUrls() {
        return urls;
    }
}

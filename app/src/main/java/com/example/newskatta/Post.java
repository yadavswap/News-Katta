package com.example.newskatta;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int cid;
    private String title;
//    private String slug;

    @SerializedName("posts")
    private  String text;

    public int getCid() {
        return cid;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}

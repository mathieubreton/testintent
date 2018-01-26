package com.example.mbreton.testrecyclerview;

/**
 * Created by mbreton on 25/01/2018.
 */

public class MyObject {
    private String text;
    private String imageUrl;

    public MyObject(String text, String imageUrl) {
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    //getters & setters
}

package com.nnhieu.sample;

import retrofit2.http.Field;

/**
 * Created by Admin on 12/26/2016.
 */

public class Question {
    private String title;
    private String link;

    public Question() {
    }

    public Question(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

package com.nnhieu.sample;

/**
 * Created by Admin on 12/27/2016.
 */

public class Choice {
    private int vote;
    private String choice;
    private String url;

    public Choice() {
    }

    public Choice(int vote, String choice, String url) {
        this.vote = vote;
        this.choice = choice;
        this.url = url;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

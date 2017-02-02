package com.nnhieu.sample;

import java.util.List;

/**
 * Created by Admin on 12/27/2016.
 */

public class Question2 {
    private String question;
    private List<String> choices;

    public Question2() {
    }

    public Question2(String question, List<String> choices) {
        this.question = question;
        this.choices = choices;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}

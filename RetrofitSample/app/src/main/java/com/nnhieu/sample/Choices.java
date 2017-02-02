package com.nnhieu.sample;

import java.util.List;

/**
 * Created by Admin on 12/27/2016.
 */

public class Choices {
    private List<Choice> choices;

    public Choices() {
    }

    public Choices(List<Choice> choices) {
        this.choices = choices;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}

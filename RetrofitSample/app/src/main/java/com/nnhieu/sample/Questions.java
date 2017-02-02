package com.nnhieu.sample;

import java.util.List;

/**
 * Created by Admin on 12/26/2016.
 */

public class Questions {
    private List<Question> items;

    public Questions() {
    }

    public Questions(List<Question> items) {
        this.items = items;
    }

    public List<Question> getItems() {
        return items;
    }

    public void setItems(List<Question> items) {
        this.items = items;
    }
}

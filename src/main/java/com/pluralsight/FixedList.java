package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<T>();
    }

    public void add(T item) {
        if (items.size() == maxSize) {
            throw new IllegalArgumentException("Cannot add item: FixedList is already full.");
        } else {
            items.add(item);
        }
    }

    public List<T> getItems() {
        return items;
    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    List<Integer> values;

    public Queue() {
        this.values = new ArrayList<>();
    }

    public void enqueue(int value) {
        values.add(value);
    }

    public Integer dequeue() {
        if (values.isEmpty()) {
            return null;
        }
        int value = values.get(0);
        values.remove(0);
        return value;
    }
}

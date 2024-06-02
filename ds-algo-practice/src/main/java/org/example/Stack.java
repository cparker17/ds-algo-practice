package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public void push(int i) {
        values.add(i);
    }

    public int pop() {
        int value = values.get(values.size()-1);
        values.remove(values.size()-1);
        return value;
    }
}

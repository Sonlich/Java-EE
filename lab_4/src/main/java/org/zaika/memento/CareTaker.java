package org.zaika.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    static int id = 0;
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento.copy());
        id++;
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
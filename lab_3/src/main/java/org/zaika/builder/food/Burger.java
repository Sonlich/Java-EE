package org.zaika.builder.food;

import org.zaika.builder.Item;
import org.zaika.builder.packing.Packing;
import org.zaika.builder.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

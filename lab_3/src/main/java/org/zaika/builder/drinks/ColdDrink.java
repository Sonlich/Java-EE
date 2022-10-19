package org.zaika.builder.drinks;

import org.zaika.builder.Item;
import org.zaika.builder.packing.Bottle;
import org.zaika.builder.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}

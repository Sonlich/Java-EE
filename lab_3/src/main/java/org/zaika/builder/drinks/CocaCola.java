package org.zaika.builder.drinks;

public class CocaCola extends ColdDrink{
    @Override
    public String name() {
        return "CocaCola";
    }

    @Override
    public float price() {
        return 20F;
    }
}
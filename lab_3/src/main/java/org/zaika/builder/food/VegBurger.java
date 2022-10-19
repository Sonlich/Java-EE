package org.zaika.builder.food;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Vegan Burger";
    }

    @Override
    public float price() {
        return 35F;
    }
}

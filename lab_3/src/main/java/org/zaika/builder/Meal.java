package org.zaika.builder;

import java.util.ArrayList;

public class Meal {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float totalCost = 0F;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems(){
        for(Item item: items){
            System.out.println(
                    "Item name: " + item.name() + '\n' +
                            "Packing: " + item.packing().pack() + '\n' +
                            "price: " + item.price() + '\n' +
                            "------------------------------" + '\n'
            );
        }
    }
}
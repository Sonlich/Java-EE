package org.zaika.builder;

import org.zaika.builder.food.ChickenBurger;
import org.zaika.builder.food.VegBurger;
import org.zaika.builder.drinks.Pepsi;
import org.zaika.builder.drinks.Coke;

public class MealBuilder {
    public static Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

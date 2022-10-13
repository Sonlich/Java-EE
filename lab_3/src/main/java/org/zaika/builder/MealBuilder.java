package org.zaika.builder;

import org.zaika.builder.drinks.CocaCola;
import org.zaika.builder.meals.ChickenBurger;
import org.zaika.builder.meals.VegBurger;
import org.zaika.builder.drinks.Pepsi;

public class MealBuilder {

    public static Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public static Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

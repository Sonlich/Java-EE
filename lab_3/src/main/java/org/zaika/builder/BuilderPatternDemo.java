package org.zaika.builder;

public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal nonVeganMeal = mealBuilder.prepareNonVegMeal();
        Meal veganMeal = mealBuilder.prepareVegMeal();

        System.out.println("Non vegan order: \n");
        nonVeganMeal.showItems();
        System.out.println("Total price of non vegan menu: " + nonVeganMeal.getCost()+ '\n' +
                "------------------------------" + '\n');


        System.out.println("Vegan order: \n");
        veganMeal.showItems();
        System.out.println("Total price of vegan menu: " + veganMeal.getCost() + '\n' +
                "------------------------------" + '\n');

    }
}

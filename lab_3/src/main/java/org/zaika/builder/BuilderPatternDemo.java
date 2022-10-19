package org.zaika.builder;

public class BuilderPatternDemo {
    public static void main(String[] args){
        Meal nonVeganMeal = MealBuilder.prepareNonVegMeal();
        Meal veganMeal = MealBuilder.prepareVegMeal();

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

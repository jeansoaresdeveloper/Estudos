package org.example;


import org.example.classes.MainDishBuilder;
import org.example.classes.MealBox;

public class Main {
    public static void main(String[] args) {

        MainDishBuilder mainDishBuilder = new MainDishBuilder();
        MealBox meal = mainDishBuilder.makeMeal().makeBeverage().getMeal();
        System.out.println(meal.getPrice());
    }
}
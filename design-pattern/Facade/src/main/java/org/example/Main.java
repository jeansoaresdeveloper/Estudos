package org.example;


import org.example.classes.MainDishBuilder;
import org.example.facade.BuilderFacade;

public class Main {
    public static void main(String[] args) {

        BuilderFacade builderFacade = new BuilderFacade();
        MainDishBuilder mainDishBuilder = builderFacade.makeMealOne();

        System.out.println(mainDishBuilder.makeMeal());

    }
}
package org.example.facade;

import org.example.classes.MainDishBuilder;

public class BuilderFacade {

    private final MainDishBuilder mainDishBuilder = new MainDishBuilder();

    public MainDishBuilder makeMealOne() {
        return this.mainDishBuilder.makeMeal();
    }

}

package org.example.classes;

import org.example.interfaces.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MealBox implements Composite {

    private final List<Composite> childrens = new ArrayList<Composite>();

    public void addMeal(List<Composite> meals) {
        childrens.addAll(meals);
    }

    public BigDecimal getPrice() {
        return childrens.stream()
                .map(Composite::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

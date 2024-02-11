package org.example.classes;

import org.example.interfaces.Builder;

import java.math.BigDecimal;
import java.util.List;

public class MainDishBuilder implements Builder {

    private MealBox mealBox = new MealBox();

    @Override
    public MainDishBuilder makeMeal() {
        Beans bean = new Beans("Bean", BigDecimal.valueOf(12));
        Rice rice = new Rice("Rice", BigDecimal.valueOf(12));
        mealBox.addMeal(List.of(bean, rice));
        return this;
    }

    @Override
    public MainDishBuilder makeBeverage() {
        Beverage beverage = new Beverage("Beverage", BigDecimal.valueOf(12.50));
        mealBox.addMeal(List.of(beverage));
        return this;
    }

    @Override
    public MainDishBuilder makeDessert() {
        Dessert dessert = new Dessert("Dessert", BigDecimal.valueOf(13));
        mealBox.addMeal(List.of(dessert));
        return this;
    }

    public Builder reset() {
        mealBox = new MealBox();
        return this;
    }

    public MealBox getMeal() {
        return mealBox;
    }
}

package org.example.classes;

import org.example.interfaces.Composite;

import java.math.BigDecimal;

public abstract class AbstractMeal implements Composite  {

    private String name;

    private final BigDecimal price;

    public AbstractMeal(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}

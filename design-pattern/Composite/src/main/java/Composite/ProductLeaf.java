package Composite;

import Components.ProductComponentLeaf;

import java.math.BigDecimal;

public class ProductLeaf implements ProductComponentLeaf {

    private final String name;
    private final BigDecimal price;

    public ProductLeaf(String name, BigDecimal price) {
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

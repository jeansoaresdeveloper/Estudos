package org.example;

import java.math.BigDecimal;

public class CustomerBudget {

    private Boolean approved = false;
    private BigDecimal price;

    public CustomerBudget(BigDecimal price) {
        this.price = price;
    }

    public void toApprove() {
        approved = true;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CustomerBudget{" +
                "approved=" + approved +
                ", price=" + price +
                '}';
    }
}

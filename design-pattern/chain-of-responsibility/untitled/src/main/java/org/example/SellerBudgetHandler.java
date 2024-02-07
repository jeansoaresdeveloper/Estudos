package org.example;

import java.math.BigDecimal;

public class SellerBudgetHandler extends BaseBudgetHandler{

    @Override
    protected CustomerBudget handle(CustomerBudget budget) {

        if (budget.getPrice().doubleValue() <= 1000.00) {
            System.out.println("O vendedor tratou o orçamento!");
            budget.toApprove();
            return budget;
        }


        return super.handle(budget);
    }
}

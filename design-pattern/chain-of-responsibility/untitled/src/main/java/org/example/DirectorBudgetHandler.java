package org.example;

public class DirectorBudgetHandler extends BaseBudgetHandler{

    @Override
    protected CustomerBudget handle(CustomerBudget budget) {

        if (budget.getPrice().doubleValue() <= 50000.00) {
            System.out.println("O diretor tratou o orçamento!");
            budget.toApprove();
            return budget;
        }


        return super.handle(budget);
    }
}

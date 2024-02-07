package org.example;

public class ManagerBudgetHandler extends BaseBudgetHandler{

    @Override
    protected CustomerBudget handle(CustomerBudget budget) {

        if (budget.getPrice().doubleValue() <= 5000.00) {
            System.out.println("O gerente tratou o orçamento!");
            budget.toApprove();
            return budget;
        }


        return super.handle(budget);
    }
}

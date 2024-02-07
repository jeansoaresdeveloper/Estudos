package org.example;

public class CEOBudgetHandler extends BaseBudgetHandler{

    @Override
    protected CustomerBudget handle(CustomerBudget budget) {

        System.out.println("O CEO trata qualquer orçamento!");
        budget.toApprove();
        return budget;

    }
}

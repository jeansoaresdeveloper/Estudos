package org.example;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CustomerBudget customerBudget = new CustomerBudget(BigDecimal.valueOf(3000.00));

        SellerBudgetHandler sellerBudgetHandler = new SellerBudgetHandler();
        sellerBudgetHandler
                .setNextHandler(new ManagerBudgetHandler())
                .setNextHandler(new DirectorBudgetHandler())
                .setNextHandler(new CEOBudgetHandler());

        sellerBudgetHandler.handle(customerBudget);
        System.out.println(customerBudget);
    }
}
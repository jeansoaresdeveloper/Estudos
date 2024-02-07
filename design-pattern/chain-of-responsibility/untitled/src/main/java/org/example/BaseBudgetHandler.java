package org.example;

import java.util.Objects;

public abstract class BaseBudgetHandler {

    private BaseBudgetHandler nextHandler;

    protected BaseBudgetHandler setNextHandler(BaseBudgetHandler handler) {
        nextHandler = handler;
        return handler;
    }

    protected CustomerBudget handle(CustomerBudget budget) {
        if (Objects.nonNull(nextHandler)) {
            return nextHandler.handle(budget);
        }

        return budget;

    }


}

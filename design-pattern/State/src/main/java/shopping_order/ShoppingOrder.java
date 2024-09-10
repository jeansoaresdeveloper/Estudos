package shopping_order;

import interfaces.ShoppingOrderState;

public class ShoppingOrder {

    private ShoppingOrderState state = new OrderPending(this);

    public ShoppingOrderState getState() {
        return state;
    }

    public String getStateName() {
        return state.getName();
    }

    public void setState(ShoppingOrderState state) {
        System.out.println("Estado do pedido: " + state.getName());
        this.state = state;
    }

    public void approvePayment() {
        this.state.approvePayment();
    }

    public void rejectPayment() {
        this.state.rejectPayment();
    }

    public void waitPayment() {
        this.state.waitPayment();
    }

    public void shipOrder() {
        this.state.shipOrder();
    }

}

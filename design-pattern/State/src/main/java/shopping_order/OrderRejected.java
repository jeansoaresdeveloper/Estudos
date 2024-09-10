package shopping_order;

import interfaces.ShoppingOrderState;

public class OrderRejected implements ShoppingOrderState {

    private final ShoppingOrder order;

    public OrderRejected(ShoppingOrder order) {
        this.order = order;
    }

    public String getName() {
        return "OrderRejected";
    }

    public void approvePayment() {
        order.setState(new OrderApproved(order));
    }

    public void rejectPayment() {
        System.out.println("O pagamento já está rejeitado.");
    }

    public void waitPayment() {
        order.setState(new OrderPending(order));
    }

    public void shipOrder() {
        System.out.println("O pedido não pode ser enviado com ordem rejeitada.");
    }
}

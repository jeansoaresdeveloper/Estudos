package shopping_order;

import interfaces.ShoppingOrderState;

public class OrderApproved implements ShoppingOrderState {

    private final ShoppingOrder order;

    public OrderApproved(ShoppingOrder order) {
        this.order = order;
    }

    public String getName() {
        return "OrderApproved";
    }

    public void approvePayment() {
        System.out.println("O pagamento já está aprovado.");
    }

    public void rejectPayment() {
        order.setState(new OrderRejected(order));
    }

    public void waitPayment() {
        order.setState(new OrderPending(order));
    }

    public void shipOrder() {
        System.out.println("Enviando pedido para o cliente.");
    }
}

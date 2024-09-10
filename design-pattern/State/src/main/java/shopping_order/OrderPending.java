package shopping_order;

import interfaces.ShoppingOrderState;

public class OrderPending implements ShoppingOrderState {

    private final ShoppingOrder order;

    public OrderPending(ShoppingOrder order) {
        this.order = order;
    }

    public String getName() {
        return "OrderPending";
    }

    public void approvePayment() {
        order.setState(new OrderApproved(order));
    }

    public void rejectPayment() {
        order.setState(new OrderRejected(order));
    }

    public void waitPayment() {
        System.out.println("O pedido já está no estado de pagamento pendente.");
    }

    public void shipOrder() {
        System.out.println("Não é possível enviar o pedido com pagamento pendente.");
    }
}

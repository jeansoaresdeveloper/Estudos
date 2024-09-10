import shopping_order.ShoppingOrder;

public class Main {

    public static void main(String[] args) {

        ShoppingOrder shoppingOrder = new ShoppingOrder();
        shoppingOrder.waitPayment();
        shoppingOrder.shipOrder();

        shoppingOrder.rejectPayment();
        shoppingOrder.rejectPayment();

        shoppingOrder.approvePayment();
        shoppingOrder.approvePayment();
        shoppingOrder.shipOrder();

    }

}

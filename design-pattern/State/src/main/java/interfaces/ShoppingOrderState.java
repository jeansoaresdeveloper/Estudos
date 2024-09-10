package interfaces;

public interface ShoppingOrderState {

    String getName();

    void approvePayment();

    void rejectPayment();

    void waitPayment();

    void shipOrder();

}

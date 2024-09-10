public class Buyer {

    private final Mediator mediator;

    public Buyer(Mediator mediator) {
        this.mediator = mediator;
    }

    public void viewProducts() {

        mediator.showProducts();
    }

    public void buy(Long id) {
        mediator.buy(id);
    }

}

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private final List<Seller> sellers = new ArrayList<>();

    public void addSellers(List<Seller> sellers) {
        sellers.forEach(seller -> seller.setMediator(this));
        this.sellers.addAll(sellers);
    }

    public SellerProduct buy(Long id) {

        return sellers.stream()
                .map(seller -> seller.sell(id))
                .findFirst()
                .orElse(null);
    }

    public void showProducts() {

        sellers.forEach(Seller::showProducts);
    }

}

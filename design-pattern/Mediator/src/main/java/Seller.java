import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Seller {

    private final List<SellerProduct> products = new ArrayList<SellerProduct>();

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void showProducts() {
        products.forEach(System.out::println);
    }

    public void addProducts(List<SellerProduct> products) {
        this.products.addAll(products);
    }

    public SellerProduct sell(Long id) {

        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .map(this::removeProduct)
                .orElse(null);
    }

    private SellerProduct removeProduct(SellerProduct product) {
        products.remove(product);
        return product;
    }

}

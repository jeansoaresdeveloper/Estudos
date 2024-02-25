import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EccomerceShoppingCart {

    private final List<EcommerceProduct> products = new ArrayList<EcommerceProduct>();
    private DiscountStrategy discountStrategy = new DiscountStrategy();

    public void addProduct(List<EcommerceProduct> ecommerceProduct) {
        products.addAll(ecommerceProduct);
    }

    public List<EcommerceProduct> getProducts() {
        return products;
    }

    public BigDecimal getSubTotal() {
        return products.stream()
                .map(EcommerceProduct::getPrice)
                .reduce(BigDecimal.valueOf(0), BigDecimal::add);
    }

    public BigDecimal getTotal() {
        return discountStrategy.getTotal(this);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}

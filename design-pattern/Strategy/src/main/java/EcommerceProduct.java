import java.math.BigDecimal;

public class EcommerceProduct {

    private final String name;
    private final BigDecimal price;

    public EcommerceProduct(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

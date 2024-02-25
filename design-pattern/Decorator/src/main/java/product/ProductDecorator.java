package product;

import java.math.BigDecimal;

public class ProductDecorator implements ProductContract {

    protected final ProductContract product;

    public ProductDecorator(ProductContract product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return product.getPrice();
    }

    public String getName() {
        return product.getName();
    }

}

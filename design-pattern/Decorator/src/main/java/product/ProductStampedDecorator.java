package product;

import java.math.BigDecimal;

public class ProductStampedDecorator extends ProductDecorator {

    public ProductStampedDecorator(ProductContract product) {
        super(product);
    }

    public BigDecimal getPrice() {
        return this.product.getPrice().add(BigDecimal.valueOf(10));
    }
}

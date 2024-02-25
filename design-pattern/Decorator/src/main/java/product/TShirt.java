package product;

import java.math.BigDecimal;

public class TShirt implements ProductContract {

    private final String name = "T-Shirt";

    private final BigDecimal price = BigDecimal.valueOf(12.60);

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}

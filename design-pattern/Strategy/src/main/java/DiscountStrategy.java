import java.math.BigDecimal;

public class DiscountStrategy {

    protected Double discount;

    public BigDecimal getTotal(EccomerceShoppingCart cart) {
        return cart.getSubTotal();
    }

}

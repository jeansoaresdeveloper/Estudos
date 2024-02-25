import java.math.BigDecimal;

public class DiscountDefault extends DiscountStrategy {

    @Override
    public BigDecimal getTotal(EccomerceShoppingCart cart) {
        BigDecimal subTotal = cart.getSubTotal();
        int subTotalInt = subTotal.intValue();

        if (subTotalInt >= 100 && subTotalInt < 200) {
            discount = 0.1;
        } else if (subTotalInt >= 200 && subTotalInt < 300) {
            discount = 0.2;
        } else if (subTotalInt >= 300) {
            discount = 0.3;
        }

        return subTotal.multiply(BigDecimal.valueOf(1.0 - discount));
    }

}

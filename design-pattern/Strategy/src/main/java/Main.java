import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EcommerceProduct teste = new EcommerceProduct("teste", BigDecimal.valueOf(200));
        EcommerceProduct testeDois = new EcommerceProduct("teste2", BigDecimal.valueOf(100));

        EccomerceShoppingCart eccomerceShoppingCart = new EccomerceShoppingCart();
        eccomerceShoppingCart.setDiscountStrategy(new DiscountDefault());
        eccomerceShoppingCart.addProduct(List.of(teste, testeDois));

        System.out.println(eccomerceShoppingCart.getSubTotal());
        System.out.println(eccomerceShoppingCart.getTotal());


    }

}

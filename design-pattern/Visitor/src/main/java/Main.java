import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Food food = new Food("Food", BigDecimal.TEN);
        Cigarette cigarette = new Cigarette("Cigarette", BigDecimal.TEN);
        AlcoholicDrink alcoholicDrink = new AlcoholicDrink("AlcoholicDrink", BigDecimal.TEN);

        final List<VisitableProduct> products = new ArrayList<>();

        BrazilTaxVisitor brazilTaxVisitor = new BrazilTaxVisitor();
        UsTaxVisitor usTaxVisitor = new UsTaxVisitor();

        products.add(food);
        products.add(cigarette);
        products.add(alcoholicDrink);
        BigDecimal total = products.stream().map(VisitableProduct::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalWithTaxes = products.stream()
                .map(product -> product.getPriceWithTaxes(brazilTaxVisitor))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalWithTaxesUs = products.stream()
                .map(product -> product.getPriceWithTaxes(usTaxVisitor))
                .reduce(BigDecimal.ZERO, BigDecimal::add);


        System.out.println(total);
        System.out.println(totalWithTaxes);
        System.out.println(totalWithTaxesUs);

    }

}

import java.math.BigDecimal;

public class Food implements VisitableProduct {

    private final String name;

    private final BigDecimal price;

    public Food(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getPriceWithTaxes(TaxVisitor taxVisitor) {
        return taxVisitor.calculateTaxesForFood(this);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

import java.math.BigDecimal;

public class AlcoholicDrink implements VisitableProduct {

    private final String name;

    private final BigDecimal price;

    public AlcoholicDrink(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getPriceWithTaxes(TaxVisitor taxVisitor) {
        return taxVisitor.calculateTaxesAlcoholicDrink(this);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

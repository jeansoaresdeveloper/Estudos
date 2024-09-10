import java.math.BigDecimal;

public class Cigarette implements VisitableProduct {

    private final String name;

    private final BigDecimal price;

    public Cigarette(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getPriceWithTaxes(TaxVisitor taxVisitor) {
        return taxVisitor.calculateTaxesForCigarette(this);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

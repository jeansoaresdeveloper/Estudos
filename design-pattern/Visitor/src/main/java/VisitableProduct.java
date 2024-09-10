import java.math.BigDecimal;

public interface VisitableProduct {

    String getName();

    BigDecimal getPrice();

    BigDecimal getPriceWithTaxes(TaxVisitor taxVisitor);


}

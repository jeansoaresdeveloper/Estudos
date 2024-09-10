import java.math.BigDecimal;

public class BrazilTaxVisitor implements TaxVisitor {

    @Override
    public BigDecimal calculateTaxesForFood(Food food) {
        return food.getPrice().multiply(BigDecimal.valueOf(1.5));
    }

    @Override
    public BigDecimal calculateTaxesForCigarette(Cigarette cigarette) {
        return cigarette.getPrice().multiply(BigDecimal.valueOf(1.7));
    }

    @Override
    public BigDecimal calculateTaxesAlcoholicDrink(AlcoholicDrink alcoholicDrink) {
        return alcoholicDrink.getPrice().multiply(BigDecimal.valueOf(1.2));
    }

}

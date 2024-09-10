import java.math.BigDecimal;

public class UsTaxVisitor implements TaxVisitor {

    @Override
    public BigDecimal calculateTaxesForFood(Food food) {
        return food.getPrice().multiply(BigDecimal.valueOf(1.2));
    }

    @Override
    public BigDecimal calculateTaxesForCigarette(Cigarette cigarette) {
        return cigarette.getPrice().multiply(BigDecimal.valueOf(1.2));
    }

    @Override
    public BigDecimal calculateTaxesAlcoholicDrink(AlcoholicDrink alcoholicDrink) {
        return alcoholicDrink.getPrice().multiply(BigDecimal.valueOf(1.2));
    }

}

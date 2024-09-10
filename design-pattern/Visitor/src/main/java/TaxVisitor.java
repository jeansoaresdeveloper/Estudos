import java.math.BigDecimal;

public interface TaxVisitor {

    BigDecimal calculateTaxesForFood(Food food);

    BigDecimal calculateTaxesForCigarette(Cigarette cigarette);

    BigDecimal calculateTaxesAlcoholicDrink(AlcoholicDrink alcoholicDrink);

}

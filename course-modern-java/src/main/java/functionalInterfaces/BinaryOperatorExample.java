package functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * `UnaryOperator` e `BinaryOperator` são interfaces funcionais especializadas do pacote
 * `java.util.function`. Elas são especializações das interfaces `Function` e `BiFunction`, respectivamente, e são
 * usadas para operações sobre um ou dois operandos do mesmo tipo. Irá retornar o mesmo tipo do Operando.
 * Na BiFunction os dois operandos devem ser do mesmo tipo e retornará o mesmo tipo do operando.
 */
public class BinaryOperatorExample {

    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

        System.out.println(binaryOperator.apply(3, 4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

        System.out.println("Result of MaxBy is: " + maxBy.apply(4, 5));
        System.out.println("Result of MinBy is: " + minBy.apply(4, 5));

    }

}

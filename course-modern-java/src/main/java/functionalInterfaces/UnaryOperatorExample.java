package functionalInterfaces;

import java.util.function.UnaryOperator;

/**
 * `UnaryOperator` e `BinaryOperator` são interfaces funcionais especializadas do pacote
 * `java.util.function`. Elas são especializações das interfaces `Function` e `BiFunction`, respectivamente, e são
 * usadas para operações sobre um ou dois operandos do mesmo tipo. Irá retornar o mesmo tipo do Operando.
 * Na BiFunction os dois operandos devem ser do mesmo tipo e retornará o mesmo tipo do operando.
 */
public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat(" Default");

    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("Java8"));

    }

}

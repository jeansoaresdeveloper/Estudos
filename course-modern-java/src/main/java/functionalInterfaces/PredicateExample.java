package functionalInterfaces;

import java.util.function.Predicate;

/**
 * `Predicate` e `BiPredicate` são interfaces funcionais que fazem parte do
 * pacote `java.util.function`. Elas são usadas principalmente para expressar
 * condições ou critérios em forma de funções lambda ou referências de método.
 * A Interface `Predicate<T>` representa uma função que recebe um argumento do tipo `T`
 * e retorna um valor booleano.
 */
public class PredicateExample {

    static Predicate<Integer> predicate = (i) -> i % 2 == 0;

    static Predicate<Integer> predicate1 = (i) -> i % 5 == 0;

    public static void predicateAnd() {

        System.out.println("Predicate AND result is: " + predicate.and(predicate1).test(20)); // Predicate Chaining
        System.out.println("Predicate AND result is: " + predicate.and(predicate1).test(18)); // Predicate Chaining
    }

    public static void predicateOr() {

        System.out.println("Predicate OR result is: " + predicate.or(predicate1).test(20)); // Predicate Chaining
        System.out.println("Predicate OR result is: " + predicate.or(predicate1).test(17)); // Predicate Chaining
    }

    public static void predicateNegate() {

        System.out.println("Predicate Negate result is: " + predicate.or(predicate1).negate().test(20)); // Predicate Chaining
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

}

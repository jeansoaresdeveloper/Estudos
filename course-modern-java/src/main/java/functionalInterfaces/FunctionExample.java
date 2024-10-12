package functionalInterfaces;

import java.util.function.Function;

/**
 * `Function` e `BiFunction` são interfaces funcionais que fazem parte do
 * pacote `java.util.function`. Elas são usadas para representar funções que aceitam
 * um ou dois argumentos e produzem um resultado. A interface `Function<T, R>` representa
 * uma função que aceita um argumento do tipo `T` e retorna um resultado do tipo `R`.
 */
public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" default");

    public static void main(String[] args) {

        System.out.println("Result is: " + function.apply("Java"));
        System.out.println("Result of andThen is: " + function.andThen(addSomeString).apply("Java"));
        System.out.println("Result of compose is: " + function.compose(addSomeString).apply("Java"));

    }

}

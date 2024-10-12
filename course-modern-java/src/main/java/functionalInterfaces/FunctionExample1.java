package functionalInterfaces;

import java.util.function.Function;

/**
 * `Function` e `BiFunction` são interfaces funcionais que fazem parte do
 * pacote `java.util.function`. Elas são usadas para representar funções que aceitam
 * um ou dois argumentos e produzem um resultado. A interface `Function<T, R>` representa
 * uma função que aceita um argumento do tipo `T` e retorna um resultado do tipo `R`.
 */
public class FunctionExample1 {

    public static String  performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {

        String result = performConcat("Hello");
        System.out.println("Result: " + result);
    }

}

package lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    /**
     * Váriaveis de instâncias podem normalmente.
     */
    static int value2 = 4;

    /**
     * Não se pode alterar valor de uma variável local dentro da lambda.     */
    public static void main(String[] args) {

        int value = 4;

        Consumer<Integer> c1 = (i) -> {
//            value++;
            System.out.println(value);
        };

        c1.accept(4);

    }

}

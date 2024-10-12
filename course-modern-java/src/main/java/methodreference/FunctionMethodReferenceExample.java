package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCase = (s) -> s.toUpperCase();

    static Function<String, String> toUpperCaseReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCase.apply("Java8"));
        System.out.println(toUpperCaseReference.apply("Java novo8"));


    }

}

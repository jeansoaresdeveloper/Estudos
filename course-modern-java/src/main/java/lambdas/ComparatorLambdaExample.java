package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {


        /**
         * Prior Java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Value 1: " + comparator.compare(1, 2));
        System.out.println("Value 2: " + comparator.compare(2, 1));

        /**
         * Lambda
         */

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Value Lambda 1: " + comparatorLambda.compare(1, 2));
    }

}

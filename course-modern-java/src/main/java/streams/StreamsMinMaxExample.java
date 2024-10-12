package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> numbers) {

        return numbers.stream()
                .reduce(0, (x, y) -> {
                    if (x > y) {
                        return x;
                    }

                    return y;
                });
    }

    public static int findMinValue(List<Integer> numbers) {

        return numbers.stream()
                .reduce(0, (x, y) -> {
                    if (x < y) {
                        return x;
                    }

                    return y;
                });
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> numbers) {

        return numbers.stream()
                .reduce((x, y) -> {
                    if (x < y) {
                        return x;
                    }

                    return y;
                });
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> numbers) {

        return numbers.stream()
                .reduce((x, y) -> {
                    if (x > y) {
                        return x;
                    }

                    return y;
                });
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(findMaxValue(numbers));

        System.out.println(findMaxValueOptional(List.of()));
        System.out.println(findMaxValueOptional(numbers));

        System.out.println(findMinValue(numbers));
        System.out.println(findMinValueOptional(numbers).orElse(0));

    }

}

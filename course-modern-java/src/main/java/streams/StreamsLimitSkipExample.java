package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> numbers) {

        return numbers.stream()
                .limit(2)
                .reduce(Integer::sum);

    }

    public static Optional<Integer> skip(List<Integer> numbers) {

        return numbers.stream()
                .skip(3)
                .reduce(Integer::sum);

    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(6, 7, 8, 9, 10);

        Optional<Integer> limited = limit(numbers);
        System.out.println(limited);

        Optional<Integer> skip = skip(numbers);
        System.out.println(skip);

    }

}

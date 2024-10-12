package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    /**
     * Primeiro parâmetro valor inicial, segundo parâmetro bi-function
     * @param numbers
     * @return
     */
    public static int performMultiplication(List<Integer> numbers) {

        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIndentity(List<Integer> numbers) {

        return numbers.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {

        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((student, nextStudent) -> {
                    if (student.getGpa() < nextStudent.getGpa()) {
                        return nextStudent;
                    }

                    return student;
                });


    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(numbers));
        System.out.println(performMultiplicationWithoutIndentity(numbers));

        System.out.println(getHighestGPAStudent());

    }

}

package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * `Consumer` e `BiConsumer` são interfaces funcionais que fazer parte do pacote `java.util.function`
 * São usadas para representar operações que aceitar um ou dois argumentos, respectivamente, e não
 * retornam nenhum resultado.
 */
public class BiConsumerExample {

    public static void nameAndActivities() {

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ": " + activities);

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b: " + b);
        };

        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication is: " + (a*b));

        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is: " + (a/b));

        multiply.andThen(division).accept(10, 5);

        nameAndActivities();

    }

}

package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

/**
 * `Consumer` e `BiConsumer` são interfaces funcionais que fazer parte do pacote `java.util.function`
 * São usadas para representar operações que aceitar um ou dois argumentos, respectivamente, e não
 * retornam nenhum resultado.
 */
public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printStudents() {

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(c2);
    }

    public static void printNameAndActivities() {

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(c3.andThen(c4)); // Consumer Chaining -> Encadeamento de consumidores
    }

    public static void printNameAndActivitiesUsingCondition() {

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((student) -> {
            if (student.getGradeLevel() >= 3) {
                c3.andThen(c4).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("Java8");
//        printStudents();
//        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

}

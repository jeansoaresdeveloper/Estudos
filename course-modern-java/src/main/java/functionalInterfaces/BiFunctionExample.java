package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * `Function` e `BiFunction` são interfaces funcionais que fazem parte do
 * pacote `java.util.function`. Elas são usadas para representar funções que aceitam
 * um ou dois argumentos e produzem um resultado. A interface `Function<T, R>` representa
 * uma função que aceita um argumento do tipo `T` e retorna um resultado do tipo `R`.
 */
public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {

        Map<String, Double> studentByGrade = new HashMap<>();

        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                studentByGrade.put(student.getName(), student.getGpa());
            }
        });

        return studentByGrade;
    });

    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(biFunction.apply(students, PredicateStudentExample.p1));

    }

}

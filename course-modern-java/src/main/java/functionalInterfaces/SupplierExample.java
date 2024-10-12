package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

/**
 * `Supplier` é uma interface funcional do pacote `java.util.function` que
 * representa um fornecedor de resultados. Ela é usada principalmente para gerar ou fornecer valores
 * quando solicitado, sem aceitar nenhum argumento.
 */
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> new Student("Jean", 3, 3.0, "male", List.of("basketball"));
        Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student: " + studentSupplier.get());
        System.out.println("Students are: " + studentsSupplier.get());

    }

}

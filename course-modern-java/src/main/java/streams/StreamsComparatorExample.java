package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();

    }

    public static List<Student> sortStudentsByGpa() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .toList();

    }

    public static List<Student> sortStudentsByGpaDesc() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .toList();

    }

    public static void main(String[] args) {

        System.out.println("Students sorted by Name");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA");
        sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by GPA Desc");
        sortStudentsByGpaDesc().forEach(System.out::println);

    }

}

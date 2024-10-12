package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel() {

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });

    }
    public static void filterStudentsByGpa() {

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });

    }

    public static void filterStudents() {

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        });

    }

    public static void main(String[] args) {

//        filterStudentsByGradeLevel();
//        filterStudentsByGpa();
        filterStudents();
    }

}

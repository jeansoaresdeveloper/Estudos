package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {

        Map<String, Double> studentByGrade = new HashMap<>();

        students.forEach(student -> {
            if (PredicateStudentExample.p2.test(student)) {
                studentByGrade.put(student.getName(), student.getGpa());
            }
        });

        return studentByGrade;

    };

    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();

        System.out.println(studentFunction.apply(students));
    }

}

package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsFIlterExample {

    public static List<Student> filterStudents() {

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("male"))
                .toList();

    }

    public static void main(String[] args) {

        System.out.println(filterStudents());

    }

}

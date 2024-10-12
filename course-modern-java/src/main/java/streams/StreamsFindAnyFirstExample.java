package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {

        return StudentDataBase.getAllStudents()
                .stream()
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {

        return StudentDataBase.getAllStudents()
                .stream()
                .findFirst();
    }

    public static void main(String[] args) {

        System.out.println(findAnyStudent());
        System.out.println(findFirstStudent());

    }

}

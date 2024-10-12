package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> names() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
    }

    public static void main(String[] args) {

        System.out.println(names());

    }

}

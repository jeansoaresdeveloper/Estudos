package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Map<String, List<String>> activitiesByName = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(activitiesByName);


    }

}

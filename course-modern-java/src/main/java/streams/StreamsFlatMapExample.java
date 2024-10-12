package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
    }

    public static long getStudentActivitiesCount() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }



    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());

    }
}

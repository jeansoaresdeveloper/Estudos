package streams;

import data.Student;
import data.StudentDataBase;

public class StreamsMapReduceExample {

    private static int numberOfNotebooks() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNotebooks)
                .reduce(0, Integer::sum);

    }

    public static void main(String[] args) {

        System.out.println(numberOfNotebooks());

    }

}

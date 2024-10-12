package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    /**
     * Classname::methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * Classname::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);

    }

}

import java.util.*;
import java.util.stream.*;

public class StudentManagement {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Surya", 85));
        students.add(new Student(2, "Ravi", 60));
        students.add(new Student(3, "Kiran", 92));
        students.add(new Student(4, "Anil", 45));
        students.add(new Student(5, "Rahul", 75));

        System.out.println("All Students");
        students.forEach(System.out::println);

        System.out.println("\nStudents with Marks > 70");

        students.stream()
                .filter(s -> s.getMarks() > 70)
                .forEach(System.out::println);

        // Sort students by marks
        System.out.println("\nStudents Sorted by Marks");

        students.stream()
                .sorted(Comparator.comparing(Student::getMarks))
                .forEach(System.out::println);

        // Average Marks
        double avg =
                students.stream()
                        .mapToDouble(Student::getMarks)
                        .average()
                        .orElse(0);

        System.out.println("\nAverage Marks: " + avg);

        // Count Passed Students (>50)
        long passCount =
                students.stream()
                        .filter(s -> s.getMarks() >= 50)
                        .count();

        System.out.println("\nPassed Students: " + passCount);
    }
}
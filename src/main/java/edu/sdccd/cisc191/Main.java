package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // Create students
        students.add(new Student("Alice", 3.8, 101));
        students.add(new Student("Bob", 2.9, 102));
        students.add(new Student("Charlie", 3.5, 103));
        students.add(new Student("Diana", 3.9, 104));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Filtering using lambda
        List<Student> highGpaStudents =
                StudentAnalyzer.filter(students, s -> s.getGpa() >= 3.5);

        System.out.println("\nFiltered (GPA >= 3.5):");
        for (Student s : highGpaStudents) {
            System.out.println(s);
        }

        // Sorting using lambda comparator
        StudentAnalyzer.sort(students,
                (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));

        System.out.println("\nSorted by GPA (Descending):");
        for (Student s : students) {
            System.out.println(s);
        }

        // Average GPA
        double avg = StudentAnalyzer.averageGpa(students);
        System.out.println("\nAverage GPA: " + avg);
    }
}
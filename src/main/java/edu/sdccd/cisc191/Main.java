package edu.sdccd.cisc191;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // TODO create students
        Student[] students = new Student[4];
        students[0] = new Student("t man", 3.9, 1);
        students[1] = new Student("t man1", 3.8, 2);
        students[2] = new Student("t man2", 3.7, 3);
        students[3] = new Student("t man3", 3.6, 4);
        // TODO demonstrate filtering
        System.out.println("Students above 3.7 GPA");

        for (Student s : students) {
            if (((StudentFilter) student -> student.getGpa() > 3.7).test(s)) {
                System.out.println(s);
            }
        }
        // TODO demonstrate sorting
                Arrays.sort(students,
                        (a, b) -> Double.compare(b.getGpa(), a.getGpa()));

                System.out.println("Sorted by GPA");

                for (Student s : students) {
                    System.out.println(s);
                }
        // TODO print average GPA
        double total = 0;

        for (Student s : students) {
            total += s.getGpa();
        }

        double average = total / students.length;

        System.out.println("Average GPA: " + average);
    }
}
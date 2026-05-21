package edu.sdccd.cisc191;
<<<<<<< HEAD
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class StudentAnalyzer {

    public static List<Student> filter(List<Student> students,
                                       StudentFilter filter) {
        List<Student> result = new ArrayList<>();
=======

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAnalyzer {

    public static List<Student> filter(List<Student> students, StudentFilter filter) {
        List<Student> result = new ArrayList<>();

>>>>>>> 59ed6af6589cd63b4f5344e6e6212f742223952c
        for (Student s : students) {
            if (filter.test(s)) {
                result.add(s);
            }
        }
<<<<<<< HEAD
        return result;
    }
    public static void sort(List<Student> students,
                            Comparator<Student> comparator) {
        students.sort(comparator);
    }
    public static double averageGpa(List<Student> students) {
        double total = 0;
        for (Student s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }
}
=======

        return result;
    }

    public static void sort(List<Student> students, Comparator<Student> comparator) {
        students.sort(comparator);
    }

    public static double averageGpa(List<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;

        for (Student s : students) {
            total += s.getGpa();
        }

        return total / students.size();
    }
}
>>>>>>> 59ed6af6589cd63b4f5344e6e6212f742223952c

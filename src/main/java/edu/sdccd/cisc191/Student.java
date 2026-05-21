package edu.sdccd.cisc191;

<<<<<<< HEAD
public class Student  {
    private final String name;
    private final double gpa;
    private final int id;

    public Student(String name, double gpa, int id) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty");
        }

        if (gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("Gpa exceeds range");
        }

        if (id <= 0) {
            throw new IllegalArgumentException("Id does not work");

public class Student {

    private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0 and 4.");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
>>>>>>> 59ed6af6589cd63b4f5344e6e6212f742223952c
        }

        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "name: " + name +
                " ID: " + id +
                " GPA: " + gpa;
    }
}



=======
        return "Student{name='" + name + "', gpa=" + gpa + ", id=" + id + "}";
    }
}
>>>>>>> 59ed6af6589cd63b4f5344e6e6212f742223952c

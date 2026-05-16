package edu.sdccd.cisc191;

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
        return "name: " + name +
                " ID: " + id +
                " GPA: " + gpa;
    }
}




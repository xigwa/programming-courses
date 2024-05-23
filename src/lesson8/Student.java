package lesson8;

import java.util.ArrayList;

public class Student {
    String name;
    int id;
    int age;
    ArrayList<Grade> grades;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grades = new ArrayList<>(); // Initialize ArrayList for grades
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}

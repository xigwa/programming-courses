package lesson8;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addAGrade(int studentId, String subject, double gradeValue) {
        for (Student student : students) {
            if (student.id == studentId) {
                Grade grade = new Grade(subject, student, gradeValue);
                student.addGrade(grade);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getAverageGrade(int studentId) {
        for (Student student : students) {
            if (student.id == studentId) {
                double totalGrade = 0;
                int count = 0;
                for (Grade grade : student.grades) {
                    totalGrade += grade.grade;
                    count++;
                }
                if (count > 0) {
                    return totalGrade / count;
                } else {
                    System.out.println("No grades found for student with ID " + studentId);
                    return 0;
                }
            }
        }
        return 0;
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age + ", ID: " + student.id);
        }
    }
}


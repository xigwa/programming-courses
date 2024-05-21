package lesson8;

public class Student {
    String name;
    int id;
    int age;
    int numberOfGrades;
    Grade[] grades;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grades = new Grade[10]; // Ініціалізуємо масив для оцінок з розміром 10
    }

    public void addGrade(Grade grade) {
        if (numberOfGrades < grades.length) {
            grades[numberOfGrades] = grade;
            numberOfGrades++;
        } else {
            System.out.println("The grade list is full for student: " + name);
        }
    }
}

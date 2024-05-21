package lesson8;

public class Lesson8Task2 {
    public static void main(String[] args) {
    Student Adam = new Student("Adam", 1,23);
    Student Agata = new Student("Agata", 2,25);
    StudentManager studentManager = new StudentManager();
    studentManager.addStudent(Adam);
    studentManager.addStudent(Agata);
    studentManager.printStudents();
    studentManager.addAGrade(2,"Math",98.2);
    studentManager.addAGrade(2,"History", 85.7);

        System.out.println(studentManager.getAverageGrade(2));
    }
}

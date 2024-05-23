package lesson8;

public class Grade {
    public Student student;
    public String subject;
    public double grade;

    public Grade(String subject, Student student, double grade) {
        this.subject = subject;
        this.student = student;
        this.grade = grade;
    }
}

package lesson8;

public class StudentManager {
    public Student[] students;
    private int studentNumberInArr;


    public StudentManager() {
        this.students = new  Student[10];
        this.studentNumberInArr = 0;
    }

    public void addAGrade(int studentId, String subject, double gradeValue) {
        for (int i = 0; i < studentNumberInArr; i++) {
            if (students[i].id == studentId) {
                Grade grade = new Grade(subject, students[i], gradeValue);
                students[i].addGrade(grade);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void addStudent(Student student) {
        if (studentNumberInArr <students.length) {
            students[studentNumberInArr] = student;
            studentNumberInArr++;
        } else
            System.out.println("The student list is full. Cannot add more students.");
    }
    public double getAverageGrade(int studentId) {
        for (int i = 0; i < studentNumberInArr; i++)
            if (students[i].id == studentId) {
                double totalGrade = 0;
                int count = 0;
                for (Grade grade : students[i].grades)
                    if (grade != null) {
                        totalGrade += grade.grade;
                        count++;
                    }
                if (count > 0)
                    return totalGrade / count;
                else {
                    System.out.println("No grades found for student with ID " + studentId);
                    return 0;
                }
            }
        System.out.println("Student with ID " + studentId + " not found.");
        return 0;
    }
    public void printStudents() {
        for (int i = 0; i < studentNumberInArr; i++) {
            System.out.println("Name: " + students[i].name + ", Age: " + students[i].age + ", ID: " + students[i].id);
        }
    }



}

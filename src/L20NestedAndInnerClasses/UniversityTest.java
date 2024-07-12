package L20NestedAndInnerClasses;

public class UniversityTest {
    public static void main(String[] args) {
        University university = new University("National University");

        University.Faculty csFaculty = university.new Faculty("Computer Science");

        University.Faculty.Department csDepartment1 = csFaculty.new Department("Software Engineering");
        University.Faculty.Department csDepartment2 = csFaculty.new Department("Artificial Intelligence");

        csDepartment1.addCourse("Object-Oriented Programming");
        csDepartment1.addCourse("Software Testing");

        csDepartment2.addCourse("Machine Learning");
        csDepartment2.addCourse("Neural Networks");

        csFaculty.addDepartment(csDepartment1);
        csFaculty.addDepartment(csDepartment2);

        university.addFaculty(csFaculty);

        university.displayAllInfo();
    }
}

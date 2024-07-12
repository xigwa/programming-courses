package L20NestedAndInnerClasses;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayAllInfo() {
        System.out.println("University: " + name);
        for (Faculty faculty : faculties) {
            System.out.println("  Faculty: " + faculty.getName());
            for (Faculty.Department department : faculty.getDepartments()) {
                System.out.println("    Department: " + department.getName());
                for (String course : department.getCourses())
                    System.out.println("      Course: " + course);
            }
        }
    }

    public class Faculty {
        private String name;
        private List<Department> departments;

        public Faculty(String name) {
            this.name = name;
            this.departments = new ArrayList<>();
        }

        public void addDepartment(Department department) {
            departments.add(department);
        }

        public List<Department> getDepartments() {
            return departments;
        }
        public String getName() {
            return name;
        }

        public class Department {
            private String name;
            private List<String> courses;

            public Department(String name) {
                this.name = name;
                this.courses = new ArrayList<>();
            }

            public void addCourse(String course) {
                courses.add(course);
            }

            public List<String> getCourses() {
                return courses;
            }

            public String getName() {
                return name;
            }
        }
    }
}

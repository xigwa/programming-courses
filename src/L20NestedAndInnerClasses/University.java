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

    public void universityInfo() {
        System.out.println("University: " + name);
        for (Faculty faculty : faculties)
            faculty.facultyInfo();
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
    public List<Faculty> getFaculties() {
        return faculties;
    }

    public Faculty getFacultyByName(String name) {
        for (Faculty faculty : faculties) {
            if (faculty.getName().equals(name))
                return faculty;
        }
        return null;
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

        public void facultyInfo() {
            System.out.println("  Faculty: " + name);
            for (Department department : departments)
                department.departmentInfo();
        }
        public List<Department> getDepartments() {
            return departments;
        }

        public Department getDepartmentByName(String name) {
            for (Department department : departments) {
                if (department.getName().equals(name))
                    return department;
            }
            return null;
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

            public void departmentInfo() {
                System.out.println("    Department: " + name);
                for (String course : courses)
                    System.out.println("      Course: " + course);
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

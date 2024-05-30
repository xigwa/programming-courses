package Lesson11;

public class Engineer {
    private String name;
    private double salary;
    private String department;

    public Engineer(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEngineerInfo() {
        return "Engineer - Name: " + name + ", Salary: " + salary + ", Department: " + department;
    }
}


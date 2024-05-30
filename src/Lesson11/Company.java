package Lesson11;


import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private List<Manager> managers;
    private List<Engineer> engineers;

    public Company() {
        employees = new ArrayList<>();
        managers = new ArrayList<>();
        engineers = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " has been added.");
    }


    public void addManager(Manager manager) {
        managers.add(manager);
        System.out.println(manager.getName() + " has been added.");
    }

    public void addEngineer(Engineer engineer) {
        engineers.add(engineer);
        System.out.println(engineer.getName() + " has been added.");
    }

    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
        managers.removeIf(manager -> manager.getName().equals(name));
        engineers.removeIf(engineer -> engineer.getName().equals(name));
        System.out.println(name + " has been removed.");
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        for (Manager manager : managers) {
            totalSalary += manager.getSalary();
        }
        for (Engineer engineer : engineers) {
            totalSalary += engineer.getSalary();
        }
        return totalSalary;
    }

    public static double calculateAverageSalary(Company company) {
        double totalSalary = company.getTotalSalary();
        int numberOfEmployees = company.employees.size() + company.managers.size() + company.engineers.size();

        if (numberOfEmployees == 0) {
            return 0;
        } else {
            return totalSalary / numberOfEmployees;
        }
    }


    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeInfo());
        }
        for (Manager manager : managers) {
            System.out.println(manager.getManagerInfo());
        }
        for (Engineer engineer : engineers) {
            System.out.println(engineer.getEngineerInfo());
        }
    }
}

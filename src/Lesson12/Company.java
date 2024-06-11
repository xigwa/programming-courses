package Lesson12;

import java.util.ArrayList;

class Company {
    private ArrayList<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        boolean removed = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee with ID " + id + " has been removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Employee with ID " + id + " is not registered.");
        }
    }

    public void listEmployees() {
        System.out.println("------------");
        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
        }
        System.out.println("------------");
    }
}


package Lesson12;

class Engineer extends Employee {
    private String specialty;

    public Engineer(String name, int id, double salary, String specialty) {
        super(name, id, salary);
        this.specialty = specialty;
    }
    @Override
    public String getDetails() {
        return "Engineer [Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Specialty: " + specialty + "]";
    }
}

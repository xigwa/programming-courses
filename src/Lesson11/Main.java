package Lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Book TheLordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkien",1954, 3);
//        Book HarryPotter = new Book("Harry Potter", "J.K. Rowling",1997, 5);
//        Library libraryOfBooks = new Library();
//        libraryOfBooks.addBook(TheLordOfTheRings);
//        libraryOfBooks.addBook(HarryPotter);
//        libraryOfBooks.removeBook("HarryPotter");
//        libraryOfBooks.libPrint();
//        Library.countBooks(libraryOfBooks);

//        Bank bank = new Bank();
//        BankAccount tom = new BankAccount("Tom");
//        BankAccount cris = new BankAccount("Cris");
//
//        bank.addAccount(tom);
//        bank.addAccount(cris);
//
//        tom.TopUpCard(50);
//        cris.TopUpCard(67);
//
//        tom.transferMoney(cris, 25);
//        cris.WithdrawalOfFunds(25);
//        tom.printBankAccount();
//        cris.printBankAccount();
//
//        bank.blockAccount(tom);
//        tom.WithdrawalOfFunds(25);
//        tom.printBankAccount();
//        bank.unblockAccount(tom);


        Company company = new Company();

        Employee employee1 = new Employee("Xigwa", 5000, "HR");
        Manager manager1 = new Manager("Tom", 8000, "Management");
        Engineer engineer1 = new Engineer("Mike", 6000, "Engineering");

        company.addEmployee(employee1);
        company.addManager(manager1);
        company.addEngineer(engineer1);

        System.out.println("All employees:");
        company.printAllEmployees();

        System.out.println("Total salary: " + company.getTotalSalary());
        System.out.println("Average salary: " + Company.calculateAverageSalary(company));

        company.removeEmployee("Xigwa");

        System.out.println("All employees after removal:");
        company.printAllEmployees();
        System.out.println("Total salary after removal: " + company.getTotalSalary());
        System.out.println("Average salary after removal: " + Company.calculateAverageSalary(company));


    }
}

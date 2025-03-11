/*Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayDetails(). Derive two classes Manager and Developer 
from Employee and implement the methods to calculate the salary (e.g., based on fixed salary or hourly wage) and display employee details (e.g., name, role, salary). 
In the main() method, create objects of Manager and Developer and test their functionality. */

// Abstract class Employee
abstract class Employee {

    protected String name;
    protected String role;

    // Constructor
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Abstract methods
    abstract double calculateSalary();

    abstract void displayDetails();
}
// Derived class Manager

class Manager extends Employee {

    private double fixedSalary;

    // Constructor
    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    // Implement calculateSalary method
    @Override
    double calculateSalary() {
        return fixedSalary;
    }

    // Implement displayDetails method
    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + calculateSalary());
    }
}
// Derived class Developer

class Developer extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement calculateSalary method
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implement displayDetails method
    @Override
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + calculateSalary());
    }
}
// Main class

public class Ex7_sec {

    public static void main(String[] args) {
        // Creating objects of Manager and Developer
        Employee manager = new Manager("Alice", 80000);
        Employee developer = new Developer("Bob", 50, 160);
        // Displaying details
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();
        System.out.println("Developer Details:");
        developer.displayDetails();
    }
}

//ques 5_lab4

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double salary;

    static int totalEmployees = 0;

    public Employee() {
        this.employeeId = 0;
        this.name = "Unknown";
        this.department = "Unknown";
        this.salary = 0.0;
        totalEmployees++;
    }

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
    }

    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }

    public double getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee(101, "John Doe", "Engineering", 75000);  // Using parameterized constructor
        Employee employee3 = new Employee(102, "Jane Smith", "Marketing", 65000);

        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
        employee3.displayEmployeeInfo();

        Employee.displayTotalEmployees();
    }
}

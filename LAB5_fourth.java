/*
 * 4) Define a Worker class with DailyWorker and SalariedWorker 
 * as its subclasses. Each worker has a name and salary rate. 
 * Implement a method computePay(int hours) to compute weekly pay.
 *  DailyWorker is paid based on the number of days worked (assuming 8 
 * hours per day), whereas SalariedWorker receives a fixed wage for 40 
 * hours per week, regardless of actual hours worked. Use polymorphism 
 * to implement this program and test worker salary calculations.
 */
class Worker {

    private String name;
    private double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public String getName() {
        return name;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public double computePay(int hours) {
        return 0;//default(to be overridden)
    }

    public void displayWorkerDetails() {
        System.out.println("Worker Name: " + name);
        System.out.println("Salary Rate: $" + salaryRate + " per hour");
    }
}

class DailyWorker extends Worker {

    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return hours * getSalaryRate();
    }
}

class SalariedWorker extends Worker {

    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * getSalaryRate();
    }
}

public class LAB5_fourth {

    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John Doe", 20);
        Worker salariedWorker = new SalariedWorker("Jane Smith", 25);

        System.out.println("\nDaily Worker Details:");
        dailyWorker.displayWorkerDetails();
        System.out.println("Weekly Pay (for 48 hours): $" + dailyWorker.computePay(48));

        System.out.println("\nSalaried Worker Details:");
        salariedWorker.displayWorkerDetails();
        System.out.println("Weekly Pay (for any hours): $" + salariedWorker.computePay(50)); // Fixed pay
    }
}

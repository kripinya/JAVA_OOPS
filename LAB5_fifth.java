/*
 * 5) You need to design a school management system to illustrate runtime 
 * polymorphism in Java. Create a superclass called Person with an 
 * abstract method named performDuty(). Next, define two subclasses: 
 * Student and Teacher. Each subclass overrides performDuty() in a 
 * distinct way, such as printing messages related to studying or teaching.
In your main class, create an array or list of Person references, then fill 
it with instances of both Student and Teacher. Finally, iterate through the 
array and call the performDuty() method on each element to show that the correct 
subclass implementation is invoked at runtime, even though all references are of 
the type Person.
 */
import java.util.ArrayList;
import java.util.List;

// Superclass Person
abstract class Person {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to be overridden in subclasses
    public abstract void performDuty();

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student extending Person
class Student extends Person {

    private int rollNo;

    // Constructor
    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    // Overriding performDuty method
    @Override
    public void performDuty() {
        System.out.println(getName() + " is studying for exams.");
    }

    // Method to display details
    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
    }
}

// Subclass Teacher extending Person
class Teacher extends Person {

    private double salary;

    // Constructor
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Overriding performDuty method
    @Override
    public void performDuty() {
        System.out.println(getName() + " is teaching a class.");
    }

    // Method to display details
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

// Main class to test runtime polymorphism
public class LAB5_fifth {

    public static void main(String[] args) {
        // Creating a list of Person references
        List<Person> people = new ArrayList<>();

        // Adding Student and Teacher objects
        people.add(new Student("Alice", 20, 101));
        people.add(new Teacher("Mr. Johnson", 45, 50000));
        people.add(new Student("Bob", 22, 102));
        people.add(new Teacher("Ms. Smith", 39, 55000));

        // Iterating through the list and calling performDuty and display methods
        for (Person person : people) {
            person.performDuty(); // Runtime polymorphism in action
            person.display();
            System.out.println();
        }
    }
}

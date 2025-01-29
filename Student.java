//lab4_first

public class Student {

    /*Create a Student class with attributes for name and age. Implement a default constructor to assign default values and a parameterized constructor to initialize 
the attributes with user defined values. Create objects using both constructors and display their details. */
    String name;
    int age;

    public Student() {
        name = "Ananya";
        age = 20;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Nishtha", 21);
        System.out.println("Default constructor-");
        System.out.println("Name: " + s1.name + " Age: " + s1.age);
        System.out.println("parameterized constructor-");
        System.out.println("Name: " + s2.name + " Age: " + s2.age);

    }

}

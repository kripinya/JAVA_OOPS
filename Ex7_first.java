//Write a Java program to create an abstract class Shape with an abstract method calculateArea(). 
//Derive two classes Rectangle and Circle from Shape and override the calculateArea() 
//method to calculate and print the area of a rectangle and a circle, respectively. 
//Use the main() method to create objects of Rectangle and Circle and test their 
//calculateArea() methods.

// Abstract class Shape
abstract class Shape {

    // Abstract method to calculate area
    abstract void calculateArea();
}

// Derived class Rectangle
class Rectangle extends Shape {

    private double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea method
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Derived class Circle
class Circle extends Shape {

    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class Ex7_first {

    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        // Calling calculateArea() for both objects
        rectangle.calculateArea();
        circle.calculateArea();
    }
}

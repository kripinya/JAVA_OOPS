/*Write a Java program to demonstrate the use of the final keyword with a variable and a method. Create a class MathConstants with a final variable PI (value = 3.14159) 
and a final method displayPI() that prints the value of PI. 
Create another class Circle that extends MathConstants and includes a method calculateArea(double radius) to calculate and print 
the area of a circle using the formula: area = PI * radius * radius. In the main() method (in a separate class or Circle), test the calculateArea() method and observe the behavior when attempting to modify the PI variable or override the displayPI() method.
 */

public class MathsConstants {

    final double PI = 3.14159;

    final void displayPI() {
        System.out.println("Value of PI is: " + PI);
    }
}

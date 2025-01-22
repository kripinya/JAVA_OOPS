
import java.util.Scanner;

class Shape {

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double side) {
        return side * side;
    }

    public double area(double radius, boolean isCircle) {
        if (isCircle) {
            return 3.14 * radius * radius;
        } else {
            return 0;
        }
    }

    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0;
    }
}

public class lab1_fourth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Triangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Area of the rectangle: " + shape.area(length, width));
                break;

            case 2: // Square
                System.out.print("Enter the side of the square: ");
                double side = sc.nextDouble();
                System.out.println("Area of the square: " + shape.area(side));
                break;

            case 3: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of the circle: " + shape.area(radius, true));
                break;

            case 4: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of the triangle: " + shape.area(base, height, true));
                break;

            default:
                System.out.println("Invalid choice! Please choose a valid shape.");
        }

        sc.close();
    }
}


public class Circle extends MathsConstants {

    public void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
    //trying to override the final method displayPI() will result in a compile-time error
    // @Override
    // void displayPI() {}
}

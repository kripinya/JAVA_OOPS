//lab5_first
/*
 * 1) Write a Java program to demonstrate that a private member of a 
 * superclass cannot be accessed directly from a derived class.
 */

class Parent {

    private int a = 10;

    public int getVar() {
        return a;
    }
}

class Child extends Parent {

    public void display() {
        System.out.println("Value of a = " + getVar());
    }
}

public class LAB5_first {

    public static void main(String[] args) {
        Child object = new Child();
        object.display();
    }
}

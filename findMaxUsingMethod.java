
import java.util.Scanner;

public class findMaxUsingMethod {
// Source code is decompiled from a .class file using FernFlower decompiler.

    static int max(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number:");
        int b = s.nextInt();
        int c = max(a, b);
        System.out.println("Maximum number is: " + c);
        s.close();
    }
}

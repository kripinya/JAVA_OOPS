/*1) Write a Java program that reads a file name from the user and attempts to open and read the file. Define a method readFile() that throws a 
FileNotFoundException using the throws keyword. In the main method, call this method and handle the exception using a try-catch block. Display an 
appropriate message if the file is not found. Use a finally block to ensure a message like "File operation attempted" is printed. */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exp9_first {

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        System.out.println("File contents:");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = input.nextLine();

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            System.out.println("File operation attempted");
        }
        input.close();
    }
}

/*Write a Java program that takes user input for a student's name, roll number, and grade, and writes this information to a file named student.txt 
using FileWriter. Ensure the program appends the data to the file if it already exists. Handle any exceptions using try-catch and display an appropriate 
message if an error occurs.
Sample File Content: 
Name: Aman, Roll Number: 120112, Grade: A
Name: Parul, Roll Number: 120131, Grade: B
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exp9_sec {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //input from user:
        System.out.println("Enter the student's name:");
        String name = sc.nextLine();

        System.out.println("Enter Rollno.: ");
        int RollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the grade: ");
        String grade = sc.nextLine();

        //formatting student's data
        String data = "Name: " + name + ", Roll Number: " + RollNo + ", Grade: " + grade + "\n";

        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write(data);
            System.out.println("Data written to the file successfully");
        } catch (IOException e) {
            System.out.println("An error occurred" + e.getMessage());
        } finally {
            System.out.println("File operation completed.");
        }
        sc.close();
    }
}

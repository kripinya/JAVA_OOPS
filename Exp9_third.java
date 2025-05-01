/*3)  Write a Java program that reads the contents of a file named student.txt using FileReader and displays the data on the console. 
Handle FileNotFoundException if the file does not exist and display an appropriate error message. Use a try-catch block for exception handling. */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exp9_third {

    public static void main(String[] args) {
        File file = new File("student.txt");

        // Reading the file using FileReader
        try (FileReader reader = new FileReader(file)) {
            int character;
            System.out.println("Contents of student.txt:");

            // Reading and displaying the file character by character
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt not found. Please check the file and try again.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file. " + e.getMessage());
        } finally {
            System.out.println("\nFile operation completed.");
        }
    }
}

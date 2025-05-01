/*4) Write a program that prompts the user for a text file name, opens the 
file using a FileInputStream (or FileReader), and counts the total number
 of words and characters (excluding whitespace). Print these counts to the
  console. Test your program on files with varied content and edge cases 
  (e.g., empty file, file with only whitespace, etc.).
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exp9_fourth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = input.nextLine();
        File file = new File(fileName);
        int charCount = 0;
        int wordCount = 0;
        try (FileReader reader = new FileReader(file); Scanner fileScanner = new Scanner(file)) {
            // Read character by character for char count
            int character;
            while ((character = reader.read()) != -1) {
                if (!Character.isWhitespace(character)) { // Count only non-whitespace characters
                    charCount++;
                }
            }

            // Read words using Scanner
            while (fileScanner.hasNext()) {
                fileScanner.next(); // Move to the next word
                wordCount++;
            }

            // Display results
            System.out.println("\nFile Analysis:");
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding whitespace): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name and try again.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file. " + e.getMessage());
        } finally {
            System.out.println("File operation completed.");
        }

        input.close();
    }
}

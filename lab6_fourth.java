/* lab6_fourth
 * Write a Java program to demonstrate the use of the final keyword with a class. 
 * Create a final class Logger with a method logMessage(String message) that prints the message to the console. 
 * Attempt to create another class ExtendedLogger that extends the Logger class, 
and observe and explain the result. In the main() method (in a separate class), 
create an object of the Logger class and call the logMessage() method to print a sample message.

 */
public class lab6_fourth {

    public static void main(String[] args) {
        Logger l = new Logger();
        l.logMessage();
    }
}

final class Logger {

    public void logMessage() {
        System.out.println("Message");
    }
}

/*class ExtendedLogger extends Logger {
    //trying to extend a final class will result in a compile-time error
}
*/

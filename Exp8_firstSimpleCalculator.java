//1) Create a simple calculator program with a method divide(int a, int b) that performs division. If the denominator is zero, 
//the method should throw an ArithmeticException (or a custom DivisionByZeroException). In your main method, call divide() 
//with various inputs (including a denominator of zero) and catch the exception to print a meaningful error message.

// Custom exception for division by zero
class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Exp8_firstSimpleCalculator {

    // Method to perform division
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Error: Division by zero is not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Test cases
        int[] numerators = {10, 20, 30};
        int[] denominators = {2, 0, 5};

        for (int i = 0; i < numerators.length; i++) {
            try {
                int result = divide(numerators[i], denominators[i]);
                System.out.println(numerators[i] + " / " + denominators[i] + " = " + result);
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

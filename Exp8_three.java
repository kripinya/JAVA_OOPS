/*3) Consider an order processing system where each order must have a positive amount. Write a method processOrder(double amount) that throws an 
InvalidOrderAmountException (a custom exception) when the order amount is zero or negative. In the main method, simulate order processing with both valid 
and invalid amounts and use try-catch blocks to handle the exception gracefully.
 */
// Custom exception for invalid order amounts
class InvalidOrderAmountException extends Exception {

    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

// OrderProcessor class to handle orders
class OrderProcessor {

    // Method to process an order
    public void processOrder(double amount) throws InvalidOrderAmountException {
        if (amount <= 0) {
            throw new InvalidOrderAmountException("Error: Order amount must be greater than zero!");
        }
        System.out.println("Order processed successfully! Amount: $" + amount);
    }
}

public class Exp8_three {

    public static void main(String[] args) {
        // Create an instance of OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();

        // Test cases with valid and invalid order amounts
        double[] orderAmounts = {150.50, 0, -25.75, 200};

        for (double amount : orderAmounts) {
            try {
                orderProcessor.processOrder(amount);
            } catch (InvalidOrderAmountException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

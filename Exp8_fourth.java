/*4) Design a password validation system in which the method validatePassword(String password) checks whether the provided 
password meets certain criteria (for example, a minimum length and the inclusion of both letters and numbers). If the password 
does not meet the criteria, throw a custom exception called WeakPasswordException. In your main method, test this validation 
method with different passwords and handle the exception to inform the user that the password is weak. */
// Custom exception for weak passwords
class WeakPasswordException extends Exception {

    public WeakPasswordException(String message) {
        super(message);
    }
}

// PasswordValidator class
class PasswordValidator {

    // Method to validate password based on criteria
    public void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Error: Password must be at least 8 characters long!");
        }
        if (!password.matches(".*[A-Za-z].*")) {
            throw new WeakPasswordException("Error: Password must contain at least one letter!");
        }
        if (!password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Error: Password must contain at least one number!");
        }
        System.out.println("Password is strong!");
    }
}

public class Exp8_fourth {

    public static void main(String[] args) {
        // Create an instance of PasswordValidator
        PasswordValidator validator = new PasswordValidator();

        // Test cases with different passwords
        String[] passwords = {"abc", "password", "pass123", "StrongPass1", "12345678"};

        for (String password : passwords) {
            try {
                System.out.println("Testing password: " + password);
                validator.validatePassword(password);
            } catch (WeakPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

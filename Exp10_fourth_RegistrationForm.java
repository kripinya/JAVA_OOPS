/*4) Write a Java Swing program to create a Registration Form that collects user details such as Name, Email, Password, and Confirm Password. Use a combination of JTextField for the name and email inputs, JPasswordField for the password inputs, and a JButton labeled "Register". When the Register button is clicked, validate that none of the fields are empty, that the Password and Confirm Password fields match, and that the email appears valid (for example, containing an “@” symbol). Display a success message on the form if all validations pass; otherwise, show appropriate error messages next to the respective fields. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp10_fourth_RegistrationForm extends JFrame {

    JTextField nameField, emailField;
    JPasswordField passwordField, confirmPasswordField;
    JLabel nameError, emailError, passwordError;

    public Exp10_fourth_RegistrationForm() {
        setTitle("Registration Form");
        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        JButton registerButton = new JButton("Register");

        nameError = new JLabel();
        nameError.setForeground(Color.RED);
        emailError = new JLabel();
        emailError.setForeground(Color.RED);
        passwordError = new JLabel();
        passwordError.setForeground(Color.RED);

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(new JLabel("Confirm Password:"));
        add(confirmPasswordField);
        add(registerButton);
        add(new JLabel());

        add(nameError);
        add(emailError);
        add(passwordError);
        add(new JLabel());

        registerButton.addActionListener(e -> {
            nameError.setText("");
            emailError.setText("");
            passwordError.setText("");

            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            boolean valid = true;

            if (name.isEmpty()) {
                nameError.setText("Name required");
                valid = false;
            }
            if (!email.contains("@")) {
                emailError.setText("Invalid email");
                valid = false;
            }
            if (password.isEmpty() || !password.equals(confirmPassword)) {
                passwordError.setText("Passwords do not match or are empty");
                valid = false;
            }

            if (valid) {
                JOptionPane.showMessageDialog(this, "Registration successful!");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exp10_fourth_RegistrationForm();
    }
}

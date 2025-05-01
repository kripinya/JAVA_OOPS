
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp10_sec_Calculator extends JFrame implements ActionListener {

    JTextField display;
    String operand1 = "", operand2 = "", operator = "";

    public Exp10_sec_Calculator() {
        display = new JTextField();
        display.setEditable(false);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {"7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"};

        for (String b : buttons) {
            JButton button = new JButton(b);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        if (input.matches("[0-9]")) {
            if (operator.isEmpty()) {
                operand1 += input; 
            }else {
                operand2 += input;
            }
            display.setText(operand1 + operator + operand2);
        } else if (input.matches("[+\\-*/]")) {
            if (!operand1.isEmpty()) {
                operator = input;
            }
            display.setText(operand1 + operator);
        } else if (input.equals("=")) {
            try {
                int num1 = Integer.parseInt(operand1);
                int num2 = Integer.parseInt(operand2);
                int result = switch (operator) {
                    case "+" ->
                        num1 + num2;
                    case "-" ->
                        num1 - num2;
                    case "*" ->
                        num1 * num2;
                    case "/" ->
                        num1 / num2;
                    default ->
                        0;
                };
                display.setText(String.valueOf(result));
                operand1 = String.valueOf(result);
                operand2 = "";
                operator = "";
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else if (input.equals("C")) {
            operand1 = operand2 = operator = "";
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new Exp10_sec_Calculator();
    }
}

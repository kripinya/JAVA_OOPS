/*3) Write a Java Swing program to implement a To-Do List using JList. Provide:
a.A JTextField to enter tasks
b.An Add button to add tasks to the list
c.A Remove button to delete selected tasks
 */
import java.awt.*;
import javax.swing.*;

public class Exp10_third_ToDoList extends JFrame {

    DefaultListModel<String> listModel;
    JList<String> taskList;
    JTextField taskField;

    public Exp10_third_ToDoList() {
        setTitle("To-Do List");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if (index != -1) {
                listModel.remove(index);
            }
        });

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(removeButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exp10_third_ToDoList();
    }
}

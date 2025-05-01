/*5)  Write a Java Swing program to implement a simple Stopwatch. The GUI should include a JLabel to display the elapsed time (in seconds) and three JButtons labeled "Start", "Stop", and "Reset". Use a Swing Timer to update the JLabel every second while the stopwatch is running. The "Start" button should begin timing, the "Stop" button should pause the timer, and the "Reset" button should set the elapsed time back to zero. Ensure that the GUI updates correctly based on the user’s interactions. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp10_fifth_Stopwatch extends JFrame {

    private int time = 0;
    private Timer timer;
    private JLabel timeLabel;

    public Exp10_fifth_Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("0", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");

        buttonPanel.add(startBtn);
        buttonPanel.add(stopBtn);
        buttonPanel.add(resetBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        timer = new Timer(1000, e -> {
            time++;
            timeLabel.setText(String.valueOf(time));
        });

        startBtn.addActionListener(e -> timer.start());
        stopBtn.addActionListener(e -> timer.stop());
        resetBtn.addActionListener(e -> {
            timer.stop();
            time = 0;
            timeLabel.setText("0");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exp10_fifth_Stopwatch();
    }
}

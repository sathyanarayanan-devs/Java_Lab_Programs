import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program8 extends JFrame {

    JLabel nameLabel;
    JTextField nameField;
    JButton submitButton;
    JTextArea outputArea;
    JPanel panel;

    Program8() {

        // Create panel
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create label
        nameLabel = new JLabel("Enter Your Name:");

        // Create text field
        nameField = new JTextField(15);

        // Create button
        submitButton = new JButton("Submit");

        // Create text area
        outputArea = new JTextArea(5, 25);
        outputArea.setEditable(false);

        // Add action to button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();

                outputArea.setText("Hello, " + name + "!\n"
                        + "Welcome to Java Swing.");
            }
        });

        // Add components to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(submitButton);
        panel.add(outputArea);

        // Add panel to frame
        add(panel);

        // Frame settings
        setTitle("Java Swing Demo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Program8();
    }
}
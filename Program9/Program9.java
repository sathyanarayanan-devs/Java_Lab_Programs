import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program9 extends JFrame {

    JCheckBox javaCheckBox;
    JRadioButton maleRadio;
    JRadioButton femaleRadio;
    JComboBox<String> courseComboBox;
    JList<String> skillsList;
    JTable studentTable;
    JButton submitButton;

    Program9() {

        setTitle("Swing Controls Demo");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // JCheckBox
        javaCheckBox = new JCheckBox("Java");

        // JRadioButton
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // JComboBox
        String[] courses = {
            "B.Sc Cybersecurity",
            "BCA",
            "B.Sc Computer Science",
            "B.Tech IT"
        };

        courseComboBox = new JComboBox<>(courses);

        // JList
        String[] skills = {
            "Java",
            "Python",
            "HTML",
            "CSS",
            "JavaScript"
        };

        skillsList = new JList<>(skills);
        skillsList.setVisibleRowCount(3);

        JScrollPane listScrollPane = new JScrollPane(skillsList);

        // JTable
        String[] columns = {"ID", "Name", "Course"};

        String[][] data = {
            {"101", "Arun", "Cybersecurity"},
            {"102", "Bala", "BCA"},
            {"103", "Kiran", "Computer Science"}
        };

        studentTable = new JTable(data, columns);

        JScrollPane tableScrollPane = new JScrollPane(studentTable);

        // Submit button
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String gender = "";

                if (maleRadio.isSelected()) {
                    gender = "Male";
                } else if (femaleRadio.isSelected()) {
                    gender = "Female";
                } else {
                    gender = "Not Selected";
                }

                String course =
                        courseComboBox.getSelectedItem().toString();

                String language;

                if (javaCheckBox.isSelected()) {
                    language = "Java";
                } else {
                    language = "Not Selected";
                }

                String skillsSelected =
                        skillsList.getSelectedValue();

                if (skillsSelected == null) {
                    skillsSelected = "Not Selected";
                }

                String message =
                        "Gender: " + gender +
                        "\nCourse: " + course +
                        "\nLanguage: " + language +
                        "\nSkill: " + skillsSelected;

                JOptionPane.showMessageDialog(
                        Program9.this,
                        message,
                        "Selected Information",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        // Add components
        panel.add(new JLabel("Select Language:"));
        panel.add(javaCheckBox);

        panel.add(new JLabel("Gender:"));
        panel.add(maleRadio);
        panel.add(femaleRadio);

        panel.add(new JLabel("Course:"));
        panel.add(courseComboBox);

        panel.add(new JLabel("Select Skill:"));
        panel.add(listScrollPane);

        panel.add(tableScrollPane);

        panel.add(submitButton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Program9();
    }
}
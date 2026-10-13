import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program10 extends JFrame
        implements ActionListener, ItemListener,
        MouseListener, MouseMotionListener,
        KeyListener, WindowListener {

    JButton button;
    JCheckBox checkBox;
    JTextField textField;
    JTextArea textArea;

    Program10() {

        setTitle("Java Event Handling");
        setSize(600, 500);
        setLayout(new FlowLayout());

        // Create components
        button = new JButton("Click Me");
        checkBox = new JCheckBox("Select Me");
        textField = new JTextField(20);
        textArea = new JTextArea(15, 45);

        textArea.setEditable(false);

        // Register listeners
        button.addActionListener(this);
        checkBox.addItemListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        textField.addKeyListener(this);
        addWindowListener(this);

        // Add components
        add(button);
        add(checkBox);

        add(new JLabel("Type something:"));
        add(textField);

        add(new JScrollPane(textArea));

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }

    // ActionListener
    public void actionPerformed(ActionEvent e) {
        textArea.append("ActionListener: Button clicked\n");
    }

    // ItemListener
    public void itemStateChanged(ItemEvent e) {

        if (checkBox.isSelected()) {
            textArea.append("ItemListener: Checkbox selected\n");
        } else {
            textArea.append("ItemListener: Checkbox deselected\n");
        }
    }

    // MouseListener
    public void mouseClicked(MouseEvent e) {
        textArea.append("MouseListener: Mouse clicked\n");
    }

    public void mousePressed(MouseEvent e) {
        textArea.append("MouseListener: Mouse pressed\n");
    }

    public void mouseReleased(MouseEvent e) {
        textArea.append("MouseListener: Mouse released\n");
    }

    public void mouseEntered(MouseEvent e) {
        textArea.append("MouseListener: Mouse entered window\n");
    }

    public void mouseExited(MouseEvent e) {
        textArea.append("MouseListener: Mouse exited window\n");
    }

    // MouseMotionListener
    public void mouseMoved(MouseEvent e) {
        textArea.append("MouseMotionListener: Mouse moved\n");
    }

    public void mouseDragged(MouseEvent e) {
        textArea.append("MouseMotionListener: Mouse dragged\n");
    }

    // KeyListener
    public void keyTyped(KeyEvent e) {
        textArea.append("KeyListener: Key typed = " + e.getKeyChar() + "\n");
    }

    public void keyPressed(KeyEvent e) {
        textArea.append("KeyListener: Key pressed\n");
    }

    public void keyReleased(KeyEvent e) {
        textArea.append("KeyListener: Key released\n");
    }

    // WindowListener
    public void windowOpened(WindowEvent e) {
        textArea.append("WindowListener: Window opened\n");
    }

    public void windowClosing(WindowEvent e) {
        textArea.append("WindowListener: Window closing\n");
        JOptionPane.showMessageDialog(
                this,
                "Window is closing."
        );
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("WindowListener: Window closed");
    }

    public void windowIconified(WindowEvent e) {
        textArea.append("WindowListener: Window minimized\n");
    }

    public void windowDeiconified(WindowEvent e) {
        textArea.append("WindowListener: Window restored\n");
    }

    public void windowActivated(WindowEvent e) {
        textArea.append("WindowListener: Window activated\n");
    }

    public void windowDeactivated(WindowEvent e) {
        textArea.append("WindowListener: Window deactivated\n");
    }

    public static void main(String[] args) {
        new Program10();
    }
}
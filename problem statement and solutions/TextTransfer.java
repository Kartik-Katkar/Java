import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTransfer {
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;

    public TextTransfer() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Text Transfer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the components
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        JButton button = new JButton("Transfer");
        label = new JLabel();

        // Set the layout
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button);
        frame.add(label);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                textField2.setText(text);
                label.setText(text);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextTransfer();
            }
        });
    }
}

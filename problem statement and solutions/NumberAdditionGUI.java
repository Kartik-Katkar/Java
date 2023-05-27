import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class NumberAdditionGUI extends JFrame {
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JTextField resultTextField;

    public NumberAdditionGUI() {
        setTitle("Number Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Set the background color to a skin color
        getContentPane().setBackground(new Color(255, 224, 189)); // Skin color

        // Create a compound border for the main panel
        Border paddingBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1); // Black border
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, paddingBorder);

        // Create a panel for the input fields and buttons
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(compoundBorder);

        JPanel contentPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Add padding inside the border

        JLabel subtitleLabel = new JLabel("Number Addition");
        subtitleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        subtitleLabel.setForeground(Color.BLUE); // Set the subtitle text color to blue
        subtitleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberTextField = new JTextField(10);

        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberTextField = new JTextField(10);

        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double firstNumber = Double.parseDouble(firstNumberTextField.getText());
                    double secondNumber = Double.parseDouble(secondNumberTextField.getText());
                    double result = firstNumber + secondNumber;
                    resultTextField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(NumberAdditionGUI.this,
                            "Invalid input! Please enter valid floating-point numbers.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumberTextField.setText("");
                secondNumberTextField.setText("");
                resultTextField.setText("");
            }
        });

        contentPanel.add(subtitleLabel);
        contentPanel.add(new JLabel()); // Empty label for spacing
        contentPanel.add(firstNumberLabel);
        contentPanel.add(firstNumberTextField);
        contentPanel.add(secondNumberLabel);
        contentPanel.add(secondNumberTextField);
        contentPanel.add(resultLabel);
        contentPanel.add(resultTextField);
        contentPanel.add(addButton);
        contentPanel.add(clearButton);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(exitButton);

        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberAdditionGUI().setVisible(true);
            }
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField textField;
    private String operator;
    private double operand1;
    private boolean operatorClicked;

    public CalculatorGUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        operator = "";
        operand1 = 0;
        operatorClicked = false;

        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "x",
                "1", "2", "3", "-",
                "0", "AC", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.addActionListener(new ButtonClickListener());
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                if (operatorClicked) {
                    textField.setText("");
                    operatorClicked = false;
                }
                textField.setText(textField.getText() + command);
            } else if (command.equals("AC")) {
                textField.setText("");
            } else if (command.matches("[+\\-x/]")) {
                operator = command;
                operand1 = Double.parseDouble(textField.getText());
                operatorClicked = true;
            } else if (command.equals("=")) {
                double operand2 = Double.parseDouble(textField.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "x":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                }

                textField.setText(String.valueOf(result));
                operatorClicked = true;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalculatorGUI calculator = new CalculatorGUI();
                calculator.setVisible(true);
            }
        });
    }
}

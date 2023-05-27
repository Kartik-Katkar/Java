import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class orderdetails {
    private JFrame frame;
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox teaCheckBox;
    private JButton orderButton;

    public orderdetails() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Food Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create the components
        JLabel label = new JLabel("Select items:");
        pizzaCheckBox = new JCheckBox("Pizza @ 100");
        burgerCheckBox = new JCheckBox("Burger @ 30");
        teaCheckBox = new JCheckBox("Tea @ 10");
        orderButton = new JButton("Order");

        // Set the layout using GridLayout
        frame.setLayout(new GridLayout(5, 1));

        // Add components to the frame
        frame.add(label);
        frame.add(pizzaCheckBox);
        frame.add(burgerCheckBox);
        frame.add(teaCheckBox);
        frame.add(orderButton);

        // Add action listener to the order button
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;
                StringBuilder orderDetails = new StringBuilder("Order Details:\n");

                // Check if each checkbox is selected and update the total and order details accordingly
                if (pizzaCheckBox.isSelected()) {
                    total += 100;
                    orderDetails.append("Pizza @ 100\n");
                }
                if (burgerCheckBox.isSelected()) {
                    total += 30;
                    orderDetails.append("Burger @ 30\n");
                }
                if (teaCheckBox.isSelected()) {
                    total += 10;
                    orderDetails.append("Tea @ 10\n");
                }

                // Create the message to display in the message box
                String message = orderDetails.toString() + "\nTotal bill: $" + total;

                // Display the message box with the order confirmation
                JOptionPane.showMessageDialog(frame, message, "Order Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new orderdetails();
            }
        });
    }
}

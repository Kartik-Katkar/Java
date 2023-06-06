import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class form1 extends JFrame {
    private JLabel nameLabel, dobLabel, prnLabel;
    private JTextField nameTextField, prnTextField;
    private JDateChooser dobChooser;
    private JButton submitButton;

    public form1() {
        // Set the title of the form
        setTitle("Application Form");

        // Initialize the form components
        nameLabel = new JLabel("Name:");
        dobLabel = new JLabel("Date of Birth:");
        prnLabel = new JLabel("PRN:");
        nameTextField = new JTextField();
        prnTextField = new JTextField();
        dobChooser = new JDateChooser();
        submitButton = new JButton("Submit");

        // Add the form components to the form
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(dobLabel);
        formPanel.add(dobChooser);
        formPanel.add(prnLabel);
        formPanel.add(prnTextField);
        formPanel.add(submitButton);

        // Add an ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the information entered by the user
                String name = nameTextField.getText();
                String dob = dobChooser.getDate().toString();
                int prn = Integer.parseInt(prnTextField.getText());

                // Display the information in a dialog box
                JOptionPane.showMessageDialog(null, "Name: " + name + "\nDate of Birth: " + dob + "\nPRN: " + prn);
            }
        });

        // Add the form panel to the form
        getContentPane().add(formPanel);

        // Set the size and visibility of the form
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the form
        form1 form = new form1();
    }
}

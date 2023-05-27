import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginGUI() {
        // Set up the JFrame
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the username label and input field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        // Create the password label and input field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        // Create the login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String credentials = "Username: " + username + " Password: " + password;
                JOptionPane.showMessageDialog(null, credentials);
            }
        });

        // Set up the layout
        setLayout(new GridLayout(3, 2));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Empty label for spacing
        add(loginButton);

        // Pack and display the JFrame
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGUI();
            }
        });
    }
}

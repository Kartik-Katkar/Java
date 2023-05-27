import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookGUI extends JFrame {
    private Map<String, String> phoneBook;

    private JTextField nameField;
    private JTextField phoneNumberField;
    private JTextArea resultArea;

    public PhoneBookGUI() {
        phoneBook = new HashMap<>();

        setTitle("Phone Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = createInputPanel();
        add(inputPanel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    private JPanel createInputPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        nameField = new JTextField(15);
        phoneNumberField = new JTextField(15);

        JButton addButton = new JButton("Add Contact");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();
                if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                    phoneBook.put(name, phoneNumber);
                    displayMessage("Contact added successfully!");
                    nameField.setText("");
                    phoneNumberField.setText("");
                } else {
                    displayMessage("Please enter a name and phone number.");
                }
            }
        });

        JButton searchButton = new JButton("Search Contact");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (!name.isEmpty()) {
                    if (phoneBook.containsKey(name)) {
                        String phoneNumber = phoneBook.get(name);
                        displayMessage(name + ": " + phoneNumber);
                    } else {
                        displayMessage("Contact not found!");
                    }
                    nameField.setText("");
                    phoneNumberField.setText("");
                } else {
                    displayMessage("Please enter a name to search.");
                }
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Phone Number:"));
        panel.add(phoneNumberField);
        panel.add(addButton);
        panel.add(searchButton);
        panel.add(exitButton);

        return panel;
    }


    private void displayMessage(String message) {
        resultArea.append(message + "\n");
        resultArea.setCaretPosition(resultArea.getDocument().getLength());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PhoneBookGUI phoneBookGUI = new PhoneBookGUI();
                phoneBookGUI.setVisible(true);
            }
        });
    }
}


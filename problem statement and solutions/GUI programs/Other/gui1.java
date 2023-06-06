import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Rename class to Participant with capital 'P'
class Participant {
    private static int count = 1000;
    private String name;
    private long contactNumber;
    private String branch;
    private int registrationId;

    // Add constructor with name, contactNumber, and branch arguments
    public Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        count++;
        registrationId = count;
    }

    // Add copy constructor that takes a Participant object as argument
    public Participant(Participant p) {
        this(p.name, p.contactNumber, p.branch);
    }

    public String getName() {
        return name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getBranch() {
        return branch;
    }

    public int getregistrationId() {
        return registrationId;
    }
}

// Rename class to ParticipantGUI with capital 'P'
class ParticipantGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel panel;
    private JLabel nameLabel, contactLabel, branchLabel;
    private JTextField nameField, contactField, branchField;
    private JButton addButton;
    private JTextArea outputArea;
    private JScrollPane scrollPane;
    private Participant p1, p2, p3, p4;

    public ParticipantGUI() {
        super("Participant Registration");

        // create participant objects using the new constructor
        p1 = new Participant("Rohit", 123456789, "Computer");
        p2 = new Participant("Sayali", 1988612300, "Mechanical");
        p3 = new Participant(p2);
        p4 = new Participant("Neel", 91376, "ICE");

        // create GUI components
        panel = new JPanel(new GridLayout(4, 2));
        nameLabel = new JLabel("Name:");
        contactLabel = new JLabel("Contact Number:");
        branchLabel = new JLabel("Branch:");
        nameField = new JTextField(20);
        contactField = new JTextField(10);
        branchField = new JTextField(20);
        addButton = new JButton("Register");
        addButton.addActionListener(this);
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        scrollPane = new JScrollPane(outputArea);

        // add components to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(contactLabel);
        panel.add(contactField);
        panel.add(branchLabel);
        panel.add(branchField);
        panel.add(addButton);

        // add components to frame
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        long contact = Long.parseLong(contactField.getText());
        String branch = branchField.getText();
        Participant p = new Participant(name, contact, branch);
        outputArea.append("Hi " + p.getName() + "! Your registration Id is D" + p.getregistrationId() + "\n");
    }
}


public class gui1 {
    public static void main(String[] args) {
        new ParticipantGUI();
    }
}

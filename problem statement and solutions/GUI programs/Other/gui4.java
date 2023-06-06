import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui4 extends JFrame implements ActionListener {

    private JComboBox<String> comboBox;
    private JButton button;
    private JTextArea textArea;

    public gui4() {
        setTitle("Exception Handling");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a combo box to select an option
        String[] options = {"Select an option", "Arithmetic Exception", "Array Exception",
                            "Null Pointer Exception", "Arithmetic Exception using throw keyword", "IOException"};
        comboBox = new JComboBox<>(options);
        add(comboBox, BorderLayout.NORTH);

        // Create a button to run the selected option
        button = new JButton("Run");
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);

        // Create a text area to display the result
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int choice = comboBox.getSelectedIndex();

        switch (choice) {
            case 0:
                textArea.setText("Please select an option");
                break;

            case 1:
                try {
                    int data = 10 / 0;
                } catch (ArithmeticException ex) {
                    textArea.setText(ex.toString() + "\nYou shouldn't divide by 0");
                }
                break;

            case 2:
                int[] arr = new int[5];

                try {
                    System.out.println(arr[7]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    textArea.setText(ex.toString() + "\nArray index is out of bounds for 7");
                }
                break;

            case 3:
                String s = null;
                try {
                    System.out.println(s.length());
                } catch (NullPointerException ex) {
                    textArea.setText(ex.toString() + "\nNull pointer Exception Arises");
                }
                break;

            case 4:
                int age = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Your Age"));
                if (age < 18) {
                    //throw Arithmetic exception if not eligible to vote
                    throw new ArithmeticException("Person is not eligible to vote");
                } else {
                    textArea.setText("Person is eligible to vote!!");
                }
                break;

            default:
                textArea.setText("Wrong Choice");
                break;
        }
    }

    public static void main(String[] args) {
        new gui4();
    }
}

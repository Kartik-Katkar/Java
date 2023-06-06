import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui8 extends JFrame {

    private JLabel label;

    public gui8() {
        super("Mouse Event Handler");

        label = new JLabel("Welcome to Mouse Event Handler");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gui8();
            }
        });
    }
}

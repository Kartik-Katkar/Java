import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class gui7 extends JFrame {

    private JLabel label;

    public gui7() {
        super("Multithreaded Program");

        label = new JLabel("Press the button to start the program.");
        add(label);

        JButton button = new JButton("Start");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Thread t1 = new First();
                t1.start();
                label.setText("Program started.");
            }
        });
        add(button, "South");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gui7();
            }
        });
    }
}

class First extends Thread {
    public void run() {
        for (;;) {
            int r;
            Random d = new Random();
            r = d.nextInt(200) + 1;
            System.out.println("Generated number: " + r);
            if (r % 2 == 0) {
                Thread t2 = new Second(r);
                t2.start();
            } else {
                Thread t3 = new Third(r);
                t3.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class Second extends Thread {
    private int number;

    public Second(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + ": " + square);
    }
}

class Third extends Thread {
    private int number;

    public Third(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Triangle extends Shape {
    float height, base;

    void getInput() {
        String s1 = JOptionPane.showInputDialog("Enter Height Of Triangle:");
        height = Float.parseFloat(s1);

        String s2 = JOptionPane.showInputDialog("Enter the Base size of Triangle:");
        base = Float.parseFloat(s2);
    }

    void setArea() {
        float area;
        area = 0.5f * height * base;
        JOptionPane.showMessageDialog(null, "The area Of Triangle is: " + area);
    }
}

class Square extends Shape {
    int side;

    void getInput() {
        String s = JOptionPane.showInputDialog("Enter the side of Square:");
        side = Integer.parseInt(s);
    }

    void setArea() {
        long area;
        area = side * side;
        JOptionPane.showMessageDialog(null, "The area of Square is: " + area);
    }
}

class Circle extends Shape {
    double radius;

    void getInput() {
        String s = JOptionPane.showInputDialog("Enter the Radius Of Circle:");
        radius = Double.parseDouble(s);
    }

    void setArea() {
        double area;
        area = 3.14 * radius * radius;
        JOptionPane.showMessageDialog(null, "The area of Circle is: " + area);
    }
}

class Shape {
    void getInput() {
        System.out.println();
    }
}

public class gui3 extends JFrame {
    JButton triangleButton, squareButton, circleButton;
    JPanel panel;

    public gui3() {
        panel = new JPanel();
        triangleButton = new JButton("Triangle");
        squareButton = new JButton("Square");
        circleButton = new JButton("Circle");

        panel.add(triangleButton);
        panel.add(squareButton);
        panel.add(circleButton);

        add(panel);

        triangleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Triangle obj1 = new Triangle();
                obj1.getInput();
                obj1.setArea();
            }
        });

        squareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Square obj2 = new Square();
                obj2.getInput();
                obj2.setArea();
            }
        });

        circleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Circle obj3 = new Circle();
                obj3.getInput();
                obj3.setArea();
            }
        });

        setTitle("Shape Calculator");
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gui3();
    }
}

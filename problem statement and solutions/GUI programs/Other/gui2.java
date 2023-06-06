import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;

public class gui2 extends JFrame {

    private JLabel numLabel, elemLabel, sumLabel;
    private JTextField numField, elemField, sumField;
    private JButton button;
    private JTextArea resultArea;
    
    public gui2() {
        super("Array Sum Finder");

        numLabel = new JLabel("Number of elements:");
        elemLabel = new JLabel("Array elements:");
        sumLabel = new JLabel("Target sum:");
        numField = new JTextField(10);
        elemField = new JTextField(20);
        sumField = new JTextField(10);
        button = new JButton("Find Sum");
        resultArea = new JTextArea(10, 20);

        JPanel panel = new JPanel();
        panel.add(numLabel);
        panel.add(numField);
        panel.add(elemLabel);
        panel.add(elemField);
        panel.add(sumLabel);
        panel.add(sumField);
        panel.add(button);
        panel.add(resultArea);

        add(panel);

        button.addActionListener(e -> {
            int num = Integer.parseInt(numField.getText());
            int[] arr = new int[num];
            String[] elements = elemField.getText().split(" ");
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }
            int targetsum = Integer.parseInt(sumField.getText());
            ArrayList<Integer> result = findTargetSum(arr, targetsum);
            resultArea.setText(result.toString());
        });

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ArrayList<Integer> findTargetSum(int[] arr, int targetsum) {
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < (arr.length-1); i++) {
            int temp = arr[i];
            int sub = targetsum - temp;
            for (int j = i+1; j < arr.length; j++) {
                if(sub == arr[j])
                {
                    result.add(arr[j]);
                    result.add(arr[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new gui2();
    }
}

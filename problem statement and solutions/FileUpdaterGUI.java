import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FileUpdaterGUI extends JFrame {
    private JTextArea textArea;
    private JButton loadButton;
    private JButton saveButton;

    public FileUpdaterGUI() {
        setTitle("File Updater");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create components
        textArea = new JTextArea();
        loadButton = new JButton("Load File");
        saveButton = new JButton("Save File");

        // Add components to content pane
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new JScrollPane(textArea), BorderLayout.CENTER);
        container.add(loadButton, BorderLayout.NORTH);
        container.add(saveButton, BorderLayout.SOUTH);

        // Add action listeners
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadFile();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
    }

    private void loadFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                StringBuilder content = new StringBuilder();
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line).append("\n");
                }

                bufferedReader.close();
                textArea.setText(content.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                String content = textArea.getText();
                bufferedWriter.write(content);

                bufferedWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FileUpdaterGUI gui = new FileUpdaterGUI();
                gui.setVisible(true);
            }
        });
    }
}


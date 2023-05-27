import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ChatFrame extends JFrame implements ActionListener {
    private JTextArea chatTextArea;
    private JButton sendButton;
    private JButton resetButton;

    public ChatFrame() {
        setTitle("Chat Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");

        openMenuItem.addActionListener(this);
        saveAsMenuItem.addActionListener(this);

        fileMenu.add(openMenuItem);
        fileMenu.add(saveAsMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        JPanel textPanel = new JPanel(new BorderLayout());
        chatTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(chatTextArea);
        textPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        sendButton = new JButton("Send");
        resetButton = new JButton("Reset");
        sendButton.addActionListener(this);
        resetButton.addActionListener(this);
        buttonPanel.add(sendButton);
        buttonPanel.add(resetButton);

        add(textPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Open")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                openTextFile(file);
            }
        } else if (e.getActionCommand().equals("Save As")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                saveTextAsFile(file);
            }
        } else if (e.getActionCommand().equals("Send")) {
            String text = chatTextArea.getText();
            if (!text.isEmpty()) {
                chatTextArea.append("\n"); // Append a new line before adding the text
                chatTextArea.setCaretPosition(chatTextArea.getDocument().getLength()); // Scroll to the bottom
            }
        } else if (e.getActionCommand().equals("Reset")) {
            chatTextArea.setText("");
        }
    }

    private void openTextFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            chatTextArea.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveTextAsFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(chatTextArea.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatFrame chatFrame = new
                    ChatFrame();
            chatFrame.setVisible(true);
        });
    }
}
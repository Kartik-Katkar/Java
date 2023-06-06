import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

// import org.w3c.dom.Document;
// import com.itextpdf.kernel.pdf.PdfDocument;
// import com.itextpdf.kernel.pdf.PdfWriter;
// import com.itextpdf.layout.Document;
// import com.itextpdf.layout.element.Paragraph;

// import java.io.File;
// import java.io.FileNotFoundException;

public class ApplicationForm extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panelHeader;
    private JPanel panelForm;
    private JLabel lblHeader;
    private JLabel lblLogo;
    private JTextField txtName;
    private JTextField txtRegNo;
    private JFormattedTextField txtDOB;
    private JCheckBox chkAgree;
    private JButton btnSubmit;


    public class ApplicationFormMain {
        public static void main(String[] args) {
            new ApplicationForm();
        }
    }
    

    public ApplicationForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setTitle("Application Form - VIT");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        // Header Panel
        panelHeader = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeader.setBackground(Color.WHITE);
        panelHeader.setPreferredSize(new Dimension(800, 100));
        contentPane.add(panelHeader, BorderLayout.NORTH);

        lblLogo = new JLabel();
        lblLogo.setIcon(new ImageIcon(getClass().getResource("vit_logo.png")));
        lblLogo.setPreferredSize(new Dimension(100, 100));
        panelHeader.add(lblLogo);

        lblHeader = new JLabel("Vellore Institute of Technology", SwingConstants.CENTER);
        lblHeader.setFont(new Font("Serif", Font.BOLD, 24));
        lblHeader.setPreferredSize(new Dimension(600, 100));
        panelHeader.add(lblHeader);

        // Form Panel
        panelForm = new JPanel(new GridBagLayout());
        panelForm.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),
                "Application Form", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                new Font("Serif", Font.BOLD, 16)));
        contentPane.add(panelForm, BorderLayout.CENTER);

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.anchor = GridBagConstraints.WEST;
        c.gridx = 0;
        c.gridy = 0;

        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Serif", Font.PLAIN, 14));
        panelForm.add(lblName, c);

        c.gridx = 1;
        c.gridy = 0;

        txtName = new JTextField(20);
        txtName.setPreferredSize(new Dimension(200, 20));
        panelForm.add(txtName, c);

        c.gridx = 0;
        c.gridy = 1;

        JLabel lblRegNo = new JLabel("Registration Number:");
        lblRegNo.setFont(new Font("Serif", Font.PLAIN, 14));
       
        panelForm.add(lblRegNo, c);

        c.gridx = 1;
        c.gridy = 1;

        txtRegNo = new JTextField(20);
        txtRegNo.setPreferredSize(new Dimension(200, 20));
        panelForm.add(txtRegNo, c);

        c.gridx = 0;
        c.gridy = 2;

        JLabel lblDOB = new JLabel("Date of Birth:");
        lblDOB.setFont(new Font("Serif", Font.PLAIN, 14));
        panelForm.add(lblDOB, c);

        c.gridx = 1;
        c.gridy = 2;

        try {
            MaskFormatter formatter = new MaskFormatter("##/##/####");
            formatter.setPlaceholderCharacter('_');
            txtDOB = new JFormattedTextField(formatter);
            txtDOB.setPreferredSize(new Dimension(200, 20));
            panelForm.add(txtDOB, c);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        c.gridx = 0;
        c.gridy = 3;

        JLabel lblAgree = new JLabel("I agree to the terms and conditions:");
        lblAgree.setFont(new Font("Serif", Font.PLAIN, 14));
        panelForm.add(lblAgree, c);

        c.gridx = 1;
        c.gridy = 3;

        chkAgree = new JCheckBox();
        chkAgree.setPreferredSize(new Dimension(20, 20));
        panelForm.add(chkAgree, c);

        c.gridx = 0;
        c.gridy = 4;

        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;

        btnSubmit = new JButton("Submit");
        btnSubmit.setPreferredSize(new Dimension(100, 30));
        btnSubmit.addActionListener(this);
        panelForm.add(btnSubmit, c);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if (e.getSource() == btnSubmit) {
    //         String name = txtName.getText();
    //         int regNo = Integer.parseInt(txtRegNo.getText());
    //         String dob = txtDOB.getText();
    //         boolean agree = chkAgree.isSelected();

    //         if (name.isEmpty() || dob.isEmpty() || !agree) {
    //             // Display error message if any field is empty or checkbox is not checked
    //             JOptionPane.showMessageDialog(this, "Please fill in all fields and agree to the terms and conditions",
    //                     "Error", JOptionPane.ERROR_MESSAGE);
    //         } else {
    //             // Create PDF document
    //             try {
    //                 // Get current date and time
    //                 Date now = new Date();
    //                 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //                 String dateTime = dateFormat.format(now);

    //                 // Create PDF document with title "Application Form - <Name>"
    //                 String fileName = "Application Form - " + name + ".pdf";
    //                 Document document = new Document();
    //                 PdfWriter.getInstance(document, new FileOutputStream(fileName));
    //                 document.open();

    //                 // Add title to document
    //                 Font titleFont = new Font(Font.SANS_SERIF, 24, Font.BOLD);
    //                 Paragraph title = new Paragraph("Application Form", titleFont);
    //                 title.setAlignment(Element.ALIGN_CENTER);
    //                 document.add(title);

    //                 // Add name, registration number, and date of birth to document
    //                 Font valueFont = new Font(Font.SANS_SERIF, 14, Font.PLAIN);
    //                 Font labelFont = new Font(Font.SANS_SERIF, 14, Font.BOLD);
    //                 Paragraph nameParagraph = new Paragraph("Name: ", labelFont);
    //                 nameParagraph.add(new Chunk(name, valueFont));
    //                 document.add(nameParagraph);
    //                 Paragraph regNoParagraph = new Paragraph("Registration Number: ", labelFont);
    //                 regNoParagraph.add(new Chunk(String.valueOf(regNo), valueFont));
    //                 document.add(reg);

    //                 Paragraph dobParagraph = new Paragraph("Date of Birth: ", labelFont);
    //                 dobParagraph.add(new Chunk(dob, valueFont));
    //                 document.add(dobParagraph);

    //                 // Add agreement to document
    //                 Paragraph agreeParagraph = new Paragraph("Agreed to terms and conditions: ", labelFont);
    //                 agreeParagraph.add(new Chunk(agree ? "Yes" : "No", valueFont));
    //                 document.add(agreeParagraph);

    //                 // Add date and time to document
    //                 Paragraph dateTimeParagraph = new Paragraph("Date and Time: ", labelFont);
    //                 dateTimeParagraph.add(new Chunk(dateTime, valueFont));
    //                 document.add(dateTimeParagraph);

    //                 // Close document
    //                 ((FileOutputStream) document).close();

    //                 // Display success message with link to PDF document
    //                 JOptionPane.showMessageDialog(this,
    //                         "Your application has been submitted!\nClick OK to open the PDF document.",
    //                         "Success", JOptionPane.INFORMATION_MESSAGE);
    //                 Desktop.getDesktop().open(new File(fileName));
    //             } catch (Exception ex) {
    //                 ex.printStackTrace();
    //                 JOptionPane.showMessageDialog(this, "An error occurred while submitting your application",
    //                         "Error", JOptionPane.ERROR_MESSAGE);
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
        new ApplicationForm();
    }
}

//By extending 

// import javax.swing.*;
// class FrameInherited extends JFrame{ //inherit from JFrame class
// JFrame f;
// FrameInherited(){
// JButton b=new JButton("JFrame_Button");//create button object
// b.setBounds(100,50,150, 40);
// add(b);//add button on frame
// setSize(300,200);
// setLayout(null);
// setVisible(true);
// }
// }
// public class swing1 {
// public static void main(String[] args) {
// new FrameInherited(); //create an object of FrameInherited class
// }
// }

//by instantization

// import javax.swing.*;
// public class swing1 {
// public static void main(String[] args) {
// JFrame f=new JFrame("JFrameInstanceExample");//create a JFrame object

// JButton b=new JButton("JFrameButton");//create instance of JButton
// b.setBounds(100,50,150, 40);//dimensions of JButton object
// f.add(b);//add button in JFrame
// f.setSize(300,200);//set frame width = 300 and height = 200
// f.setLayout(null);//no layout manager specified
// f.setVisible(true);//make the frame visible
// }
// }

// The creation of a panel container in a frame using javax.swing package classes. 

// import javax.swing.*;
// class JPanelExample {
// JPanelExample(){
// JFrame frame = new JFrame("Panel Example"); //create a frame
// JPanel panel = new JPanel(); //Create JPanel Object
// panel.setBounds(40,70,100,100); //set dimensions for Panel
// JButton b = new JButton("ButtonInPanel"); //create JButton object
// b.setBounds(60,50,80,40); //set dimensions for button
// panel.add(b); //add button to the panel
// frame.add(panel); //add panel to frame
// frame.setSize(400,400);
// frame.setLayout(null);
// frame.setVisible(true);
// }
// }
// public class swing1 {
// public static void main(String[] args) {
// new JPanelExample(); //create an object of FrameInherited class
// }
// }


// import javax.swing.*;
// class JTextAreaExample {
// JTextAreaExample(){
// JFrame frame= new JFrame();
// JTextArea t_area=new JTextArea("JTextArea example"); //create object of JTextArea
// t_area.setBounds(10,30, 150,100); //set its dimensions
// frame.add(t_area); //add it to the frame
// frame.setSize(200,200);
// frame.setLayout(null);
// frame.setVisible(true);
// }
// }
// public class swing1 {
// public static void main(String[] args) {
// new JTextAreaExample(); //create an object of TextAreaExample class
// }
// }

// import javax.swing.*;
// public class swing1 {
// public static void main(String[] args) {

// JFrame frame=new JFrame("JButton Example"); //create JFrame object
// JButton button=new JButton("Button"); //Create a JButton object
// button.setBounds(100,100,150,70); //set dimensions for button
// frame.add(button); //add button to the frame
// frame.setSize(1000,1000);
// frame.setLayout(null);
// frame.setVisible(true);
// }
// }

// Jlist in java 

// import javax.swing.*;
// public class Main {
// public static void main(String[] args) {
// JFrame frame= new JFrame("JList Example");
// //create a list model and add items to it
// DefaultListModel&lt;String&gt; colors = new DefaultListModel&lt;&gt;();
// colors.addElement("Red");
// colors.addElement("Green");
// colors.addElement("Blue");
// //create JList object and add listModel to it
// JList&lt;String&gt; colorsList = new JList&lt;&gt;(colors);
// colorsList.setBounds(100,100, 75,50);
// frame.add(colorsList); //add list to the frame
// frame.setSize(400,400);
// frame.setLayout(null);
// frame.setVisible(true);
// }
// }

// Jcombobox in java

// import javax.swing.*;
// class ComboBoxExample {
// JFrame frame;
// ComboBoxExample(){
// frame=new JFrame("ComboBox Example");
// //create a string array
// String country[]={"India","SriLanka","Singapore","Maldives","SeyChelles"};
// //create a combobox object with given string array
// JComboBox countries=new JComboBox(country);
// countries.setBounds(100, 100,180,40);
// frame.add(countries); //add it to the frame
// frame.setLayout(null);
// frame.setSize(900,900);
// frame.setVisible(true);
// }
// }
// public class swing1 {
// public static void main(String arg[]) {
// new ComboBoxExample();
// }
// }

// jslider in java 
// import javax.swing.*;
// class SliderExample extends JFrame {
// public SliderExample() {
// //create a slider object
// JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
// //set major and minor ticks for the slider
// slider.setMinorTickSpacing(2);
// slider.setMajorTickSpacing(10);
// slider.setPaintTicks(true);
// slider.setPaintLabels(true);

// JPanel panel = new JPanel();
// panel.add(slider); //add slider to the panel
// add(panel);
// }
// }
// public class swing1{
// public static void main(String s[]) {
// SliderExample frame=new SliderExample();
// frame.pack();
// frame.setVisible(true);
// }
// }


// Java event handler 

import javax.swing.*;
import java.awt.event.*;

public class swing1 {
public static void main(String[] args) {
JFrame frame=new JFrame("Button Click Example");
final JTextField text_field=new JTextField(); //JTextField object
text_field.setBounds(50,100, 150,20);
JButton click_button=new JButton("Click Me!!!");//JButton object
click_button.setBounds(20,50,75,30);
click_button.addActionListener(new ActionListener(){ //add an event and take action
public void actionPerformed(ActionEvent e){
text_field.setText("The button was clicked");
}
});

//add button and textfield to the frame
frame.add(click_button);frame.add(text_field);
frame.setSize(700,700);
frame.setLayout(null);
frame.setVisible(true);
}
}



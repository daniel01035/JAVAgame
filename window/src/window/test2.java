package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class test2 {

 private JFrame frame;
 private JTextField textFieldNum1;
 private JTextField textFieldNum2;
 private JTextField textFieldAns;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
    	test2 window = new test2();
     window.frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public test2() {
  initialize();
 }

 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frame = new JFrame();
  frame.setBounds(100, 100, 450, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().setLayout(null);
  
  textFieldNum1 = new JTextField();
  textFieldNum1.setBounds(30, 31, 182, 37);
  frame.getContentPane().add(textFieldNum1);
  textFieldNum1.setColumns(10);
  
  textFieldNum2 = new JTextField();
  textFieldNum2.setBounds(242, 31, 182, 37);
  frame.getContentPane().add(textFieldNum2);
  textFieldNum2.setColumns(10);
  
  JButton btnNewButton1 = new JButton("\u6E1B");
  btnNewButton1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    int num1,num2,ans;
    try {
      num1=Integer.parseInt(textFieldNum1.getText());
      num2=Integer.parseInt(textFieldNum2.getText());
      
      ans=num1-num2;
    }catch(Exception e) {
     JOptionPane.showMessageDialog(null, "請入數字");
    }
    }
   }
  );
  
  JButton btnNewButton = new JButton("\u52A0");
  btnNewButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    int num1,num2,ans;
    try {
      num1=Integer.parseInt(textFieldNum1.getText());
      num2=Integer.parseInt(textFieldNum2.getText());
      
      ans=num1+num2;
      textFieldAns.setText(Integer.toString(ans));
    }catch(Exception e1) {
     JOptionPane.showMessageDialog(null, "請入數字");
    }
    }
       }
  );
  btnNewButton.setBounds(22, 134, 190, 43);
  frame.getContentPane().add(btnNewButton);
  JButton btnNewButton11 = new JButton("\u52A0");
  btnNewButton11.setBounds(242, 134, 182, 43);
  frame.getContentPane().add(btnNewButton11);
  
  textFieldAns = new JTextField();
  textFieldAns.setBounds(178, 210, 201, 41);
  frame.getContentPane().add(textFieldAns);
  textFieldAns.setColumns(10);
  
  JLabel lblNewLabel = new JLabel("\u7B54\u6848\u662F:");
  lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 16));
  lblNewLabel.setBounds(105, 214, 83, 26);
  frame.getContentPane().add(lblNewLabel);
 }
}
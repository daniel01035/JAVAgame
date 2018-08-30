package window;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
 
@SuppressWarnings("serial")
public class test3 extends JFrame implements ActionListener, KeyListener{
  JLabel tip1 = new JLabel();
  JLabel tip2 = new JLabel();
  JTextField pushMoney_field = new JTextField(15);
  JButton transform_btn = new JButton();
   
  int number [] = {1000,500,200,100,50,10,5,1};
  ArrayList<JLabel> GUIComponent ;
   
 public test3(){
  super("換鈔機--幫你換好最大張的面額");
  Container contain = this.getContentPane();
  JPanel parent_panel = new JPanel();
  JPanel top_panel = new JPanel();
  JPanel bottom_panel = new JPanel();
   
  parent_panel.setLayout(new GridLayout(2,0));
  bottom_panel.setLayout(new GridLayout(0,2));
   
  tip1.setText("換鈔機會自動幫您換好最大張的面額");
  tip2.setText("換鈔的金額會顯示如下");
  tip2.setBorder(BorderFactory.createMatteBorder(
    2, 2, 2, 2, Color.blue));
  pushMoney_field.setText("請將換鈔的金額輸入於此欄");
  pushMoney_field.selectAll();
  transform_btn.setText("轉換");
    
  GUIComponent = new ArrayList<JLabel>();
  for(int i = 0; i < number.length;i++){
   JLabel nLabel = new JLabel(number[i]+"元紙鈔：");
   GUIComponent.add(nLabel);
   bottom_panel.add(GUIComponent.get(i));
  }
   
   
  top_panel.add(pushMoney_field);
  top_panel.add(transform_btn);
  top_panel.add(tip1);
  top_panel.add(tip2);
   
  parent_panel.add(top_panel);
  parent_panel.add(bottom_panel);
   
  contain.add(parent_panel);
   
  transform_btn.addActionListener(this);
  pushMoney_field.addKeyListener(this);
   
 }
   
 public static void main(String[] args) {
	 test3 frame = new test3();
  frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  frame.setSize(300,300);
  frame.setResizable(false);
  frame.setVisible(true);
   
 }
 
 @Override
 public void actionPerformed(ActionEvent arg0) {
  changeMoney();
 }
 
 @Override
 public void keyPressed(KeyEvent event) {
  // TODO Auto-generated method stub
   
 }
 
 @Override
 public void keyReleased(KeyEvent event) {
  // TODO Auto-generated method stub
   
  if(event.getKeyCode() == 10){
   changeMoney();
  }
 }
 
 @Override
 public void keyTyped(KeyEvent event) {
  // TODO Auto-generated method stub
   
 }
  
 public void changeMoney(){
  int amount = Integer.parseInt(
    pushMoney_field.getText());
  int remainder = amount;
   
  int quantity [] = {0,0,0,0,0,0,0,0};
   
   
  if(amount <= 0){
   JOptionPane.showMessageDialog(null,"您輸入了0或負值唷!","錯誤訊息>U<"
     ,JOptionPane.INFORMATION_MESSAGE);
  }
  else if (amount > 0){
   
   for(int i = 0;i < number.length;i++){
    quantity[i] = remainder / number[i];
    remainder = remainder % number[i];
   }
    
   for(int i = 0;i < number.length;i++){
    JLabel nLabel = GUIComponent.get(i);
    nLabel.setText(number[i] + "元紙鈔：" + quantity[i]);
   }
    
  }
 }
}
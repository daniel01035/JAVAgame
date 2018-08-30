package window;
import javax.swing.*; 
import java.awt.event.*; 

class CFrame extends JFrame implements ActionListener { 

JTextField txtInput = new JTextField("0"); 
JTextField txtArea = new JTextField(); 
JButton btnOK = new JButton("確定"); 
JButton btnCls = new JButton("清除"); 
JLabel lbl2 = new JLabel("輸入值："); 

CFrame() { 

lbl2.setBounds(20,50,100,20); 
add(lbl2); 
txtInput.addActionListener(this); 
txtInput.setBounds(90,50,100,20); 
add(txtInput); 
txtArea.setEditable(false); 
txtArea.setBounds(20,80,170,20); 
add(txtArea); 
btnOK.addActionListener(this); 
btnOK.setBounds(20,110,70,20); 
add(btnOK); 
btnCls.addActionListener(this); // 關鍵，監聽按下button後的反應 
btnCls.setBounds(120,110,70,20); 
add(btnCls); 

setTitle("test"); 
setLayout(null); 
setBounds(100, 100, 220, 180); 
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 

public void actionPerformed(ActionEvent e) { 
if (e.getSource() == btnOK || e.getSource() == txtInput) { //如果按下按鈕 
String area; 
area = txtInput.getText(); //獲取值 
String stArea = String.valueOf(area); 
txtArea.setText("獲取值為： " + stArea ); 
} 
if (e.getSource() == btnCls) { 
txtInput.setText("0"); 
txtArea.setText(""); 
} 
} 
} 

public class test4 { 
public static void main(String[] args) { 
CFrame frame = new CFrame(); 
} 
} 
package window;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame implements ActionListener, KeyListener{
	public static JTextField textField_input;
	public static JTextField textField_name;
	public static JLabel label_range;
	public static JButton play_button;
	public static int tmp=0,min=0,max=100,num=1;
	int number =(int)(Math.random()*100);
	public static JTable table=new JTable();
	public static DefaultTableModel tableModel=null;
	
	public static void main(String[] args){
		windowtest frame = new windowtest();
		frame.setResizable(false);
        frame.setVisible(true);
	}
	
	KeyListener textField_input_keyListener = new KeyListener() {
		@Override
		public void keyReleased(KeyEvent event) {
			// TODO Auto-generated method stub
			if(event.getKeyCode() == 10){
				playgame();
			}
		}
		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}
	};
	
	test(){
		setTitle("猜數字");
		setBounds(0,0,615,565);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);

		//panel
		JPanel panel = new JPanel();
		panel.setBounds(0,0,610,515);
		panel.setBackground(Color.black);
		panel.add(new JLabel(new ImageIcon("C:/Users/danie/Desktop/test.png")));
		panel.setVisible(true);
		add(panel);
				
		JPanel panel_play = new JPanel();
		panel_play.setLayout(null);
		panel_play.setBounds(0,0,615,565);
		panel_play.setBackground(Color.gray);
		
		JLabel label_play = new JLabel("輸入數字");
		label_play.setFont(new Font("新細明體", Font.PLAIN, 55));
		label_play.setBounds(37, 57, 229, 113);
		panel_play.add(label_play);
		
		textField_input = new JTextField();
		textField_input.setFont(new Font("新細明體", Font.PLAIN, 60));
		textField_input.addKeyListener(textField_input_keyListener);
		textField_input.setBounds(308, 73, 247, 78);
		textField_input.setColumns(10);
		panel_play.add(textField_input);
		
		label_range = new JLabel("範圍：1~100");
		label_range.setFont(new Font("新細明體", Font.PLAIN, 60));
		label_range.setBounds(130, 220, 415, 100);
		panel_play.add(label_range);
		
		play_button = new JButton("重新");
		play_button.setBounds(230, 400, 122, 50);
		play_button.addActionListener(this);
		panel_play.add(play_button);
		
		panel_play.setVisible(false);
		add(panel_play);
		
		//panel_file
		JPanel panel_file = new JPanel();
        panel_file.setBounds(0,0,615,565);
        panel_file.setBackground(Color.lightGray);
        
        tableModel=new DefaultTableModel(
	    new Object [][] {
	    	{"0","0"}
	    },
	    new String [] {
	    	"號碼","猜題次數"
	    }
	    );
	    table.setModel(tableModel);
	    table.setFont(new Font("新細明體", Font.PLAIN, 20));
	    table.setRowHeight(20);
	    panel_file.add(new JScrollPane(table));
        
        panel_file.setVisible(false);
        add(panel_file);
        
		//JmenuBar
		JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        JMenu menuFile = new JMenu("檔案");
        bar.add(menuFile);
        JMenuItem play = new JMenuItem("遊戲");
        JMenuItem file = new JMenuItem("資料");
        menuFile.add(play);
        menuFile.add(file);
        
        play.addActionListener(new ActionListener(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		number =(int)(Math.random()*100);
        		panel_play.setVisible(true);
				panel.setVisible(false);
				panel_file.setVisible(false);
			}
        });
        file.addActionListener(new ActionListener(){
        	@Override
			public void actionPerformed(ActionEvent e) {
        		panel_file.setVisible(true);
				panel.setVisible(false);
				panel_play.setVisible(false);
			}
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
              int result=JOptionPane.showConfirmDialog(windowtest(),
                         "確定要結束程式嗎?",
                         "確認訊息",
                         JOptionPane.OK_CANCEL_OPTION,
                         JOptionPane.WARNING_MESSAGE);
              if (result==JOptionPane.YES_OPTION) {System.exit(0);}
              else setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
              }    
            });
	}
	protected Component windowtest() {
		return null;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == play_button){
			number = (int)(Math.random()*100);
			label_range.setText("範圍：1~100");
			textField_input.setText("");
		}
	}
	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		if(event.getKeyCode() == 10){
			playgame();
		}
	}
	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	public void playgame(){
		try{
			int x = Integer.parseInt(textField_input.getText());
			if(x<min || x>max){
				JOptionPane.showMessageDialog(null,"您輸入錯誤的範圍唷!","錯誤訊息-重新輸入"
				,JOptionPane.INFORMATION_MESSAGE);
				textField_input.setText("");
			}else{
				tmp++;
				if(x>number){
					max=x;
					label_range.setText("第"+tmp+"次："+min+"~"+max );
					textField_input.setText("");
				}else if(x<number){
					min=x;
					label_range.setText("第"+tmp+"次："+min+"~"+max );
					textField_input.setText("");
				}else{
					label_range.setText("第"+tmp+"次：Bingo!");
					tableModel.addRow(new Object []{num,tmp});
					tmp=0;
					min=0;
					max=100;
					num++;
					number = (int)(Math.random()*100);
				}
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"您輸入錯誤了唷!","錯誤訊息-重新輸入"
			,JOptionPane.INFORMATION_MESSAGE);
			textField_input.setText("");
		}
	}
}

		

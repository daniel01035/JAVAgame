package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class test5 extends JFrame implements ActionListener, KeyListener{

	private JPanel contentPane;
	private JTextField textField_input;
	private JTextField textField_name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test5 frame = new test5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,615,565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_play = new JLabel("輸入數字");
		label_play.setFont(new Font("新細明體", Font.PLAIN, 55));
		label_play.setBounds(36, 72, 229, 113);
		contentPane.add(label_play);
		
		textField_input = new JTextField();
		textField_input.setFont(new Font("新細明體", Font.PLAIN, 60));
		textField_input.addKeyListener(this);
		textField_input.setBounds(308, 88, 247, 78);
		contentPane.add(textField_input);
		textField_input.setColumns(10);
		
		JLabel label_range = new JLabel("範圍");
		label_range.setFont(new Font("新細明體", Font.PLAIN, 60));
		label_range.setBounds(134, 218, 415, 100);
		contentPane.add(label_range);
		
		JButton button = new JButton("重新");
		button.setBounds(229, 388, 122, 50);
		contentPane.add(button);
		
		JPanel pa = new JPanel();
		pa.setBackground(Color.gray);
		getContentPane().add(pa);
		
		JLabel label_name = new JLabel("輸入姓名");
		label_name.setFont(new Font("新細明體", Font.PLAIN, 50));
		label_name.setBounds(36, 10, 229, 70);
		contentPane.add(label_name);
		label_name.setVisible(true);
		
		textField_name = new JTextField();
		textField_name.setFont(new Font("微軟正黑體", Font.PLAIN, 50));
		textField_name.setBounds(308, 10, 247, 58);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		textField_name.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

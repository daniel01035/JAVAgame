package window;
import javax.swing.*;

public class file {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		String [] headings= new String[] {"���X","�q�D����"};
        Object[][] data = new Object[][] {
	        {"������","2"},
	        {"�p�s","3"}
        };
		JTable table=new JTable(data,headings);
		jf.getContentPane().add(new JScrollPane(table));
		jf.setVisible(true);
	}

}

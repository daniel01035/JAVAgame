package window;
import javax.swing.*;

public class file {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		String [] headings= new String[] {"號碼","猜題次數"};
        Object[][] data = new Object[][] {
	        {"井民全","2"},
	        {"小山","3"}
        };
		JTable table=new JTable(data,headings);
		jf.getContentPane().add(new JScrollPane(table));
		jf.setVisible(true);
	}

}

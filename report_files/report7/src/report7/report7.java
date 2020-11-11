package report7;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class report7 {
	JFrame jFrame = new JFrame("My Key Pad");
	JButton [] btn = new JButton [12];	
	
	public report7()
	{		
		jFrame.setLayout(new GridLayout(4,3));
		
		Container container = jFrame.getContentPane();
		
		for(int i=1; i<=btn.length-3; i++)
		{
			btn[i-1] = new JButton(" " + i + " ");
			container.add(btn[i-1]);
		}
		
		btn[9] = new JButton("*");
		btn[10] = new JButton("0");
		btn[11] = new JButton("#");
		
		for(int i=9; i<12; i++)
		{
			container.add(btn[i]);
		}
		jFrame.setSize(300, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new report7();
	}
}

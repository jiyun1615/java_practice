import javax.swing.*;
import java.awt.FlowLayout;

public class Frame_practice2 extends JFrame {
	public Frame_practice2()
	{
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Frame practice2");
		
		setLayout(new FlowLayout());	//��ġ ������ ����
		JButton button = new JButton("��ư");		//������Ʈ ���� �� �߰�
		this.add(button);
		setVisible(true);
	}
}

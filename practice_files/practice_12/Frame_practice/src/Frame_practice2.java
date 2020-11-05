import javax.swing.*;
import java.awt.FlowLayout;

public class Frame_practice2 extends JFrame {
	public Frame_practice2()
	{
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Frame practice2");
		
		setLayout(new FlowLayout());	//배치 관리자 설정
		JButton button = new JButton("버튼");		//컴포넌트 생성 및 추가
		this.add(button);
		setVisible(true);
	}
}

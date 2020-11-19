package report8;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

class Point{
	int x, y;
}

class MyPanel extends JPanel implements MouseMotionListener, KeyListener{
	private int index = 0;
	Point[] array = new Point[1000];
	public int i=1;
	public int j=1;
	public MyPanel() {
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 37)
		{
			i--;
		}
		if(e.getKeyCode() == 38)
		{
			if(j<=1)
				j=5;
			else
				j--;
		}
		if(e.getKeyCode() == 39)
		{
			if(i>=1)
				i++;
		}
		if(e.getKeyCode() == 40)
		{
			if(j>=5)
				j=1;
			else
				j++;
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(index > 1000)
			return;
		array[index] = new Point();
		array[index].x = e.getX();
		array[index].y = e.getY();
		index++;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Point p : array) {
			if(p!=null) {
				g.drawRect(p.x, p.y, i, i);
				switch(j) {
				case 1:
					g.setColor(Color.black);
					break;
				case 2:
					g.setColor(Color.blue);
					break;
				case 3:
					g.setColor(Color.cyan);
					break;
				case 4:
					g.setColor(Color.green);
					break;
				case 5:
					g.setColor(Color.orange);
					break;
				}
				g.fillRect(p.x, p.y, i, i);
				
			}
		}
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
	}
}

public class report8 extends JFrame {
	public report8() {
		setSize(300, 300);
		setTitle("마우스로 그림그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		report8 s = new report8();
	}
}
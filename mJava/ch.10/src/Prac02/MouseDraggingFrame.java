package Prac02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDraggingFrame extends JFrame{
	public MouseDraggingFrame() {
		super("드래깅동안 YELLOW로 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mouseDragged(MouseEvent e) {
			Container c = getContentPane();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			Container c = getContentPane();
			c.setBackground(Color.GREEN);}
		
	}

	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}

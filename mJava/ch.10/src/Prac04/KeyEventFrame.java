package Prac04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventFrame extends JFrame{
	String str = "Love Java";
	JLabel label = new JLabel(str);

	
	public KeyEventFrame() {
		super("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		label.addKeyListener(new MyKeyListener());		
		c.add(label);

		setSize(250,150);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			//label.setText(KeyEvent.getKeyText(e.getKeyCode());
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				str =  str.substring(1) + str.substring(0,1);
				label.setText(str);
			}
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTypeed(KeyEvent e) {}
	}
	
	public static void main(String[] args) {
		new KeyEventFrame();
	}

}

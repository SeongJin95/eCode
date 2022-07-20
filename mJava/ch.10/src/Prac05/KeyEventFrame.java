package Prac05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventFrame extends JFrame{
	String str = "Love Java";
	JLabel label = new JLabel(str);
	int f = 20; 

	
	public KeyEventFrame() {
		super("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, f));
		label.setText(str);
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
			if(e.getKeyChar() == '+') {
				f+=5;
				label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, f));
				label.setText(str);
			}else if(e.getKeyChar() == '-') {
				f-=5;
				label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, f));
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

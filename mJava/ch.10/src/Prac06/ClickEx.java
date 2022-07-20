package Prac06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickEx extends JFrame {
	
	public ClickEx() {
		super("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel();
		label.setSize(15, 15);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		label.setText("C");
		label.setLocation(100,100);
		c.add(label);
		
		label.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container d = la.getParent();
				System.out.println(d.getWidth());
				int xBound = d.getWidth() - la.getWidth();
				int yBound = d.getHeight() - la.getHeight();
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);
				//clicke.setTitle(x+ "," +y);
				la.setLocation(x,y);
				
			}
		});
				
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	public static void main(String[] args) {
		new ClickEx();
	}

}

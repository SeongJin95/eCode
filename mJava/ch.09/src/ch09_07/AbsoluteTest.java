package ch09_07;

import javax.swing.*;
import java.awt.*;

public class AbsoluteTest extends JFrame{
	public AbsoluteTest() {
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		JButton b1 = new JButton("Button #1");
		p.add(b1);
		JButton b2 = new JButton("Button #2");
		p.add(b2);
		JButton b3 = new JButton("Button #3");
		p.add(b3);
		
		b1.setBounds(20,5,95,30);
		b2.setBounds(55,45,105,70);
		b3.setBounds(100,15,105,90);
		
		add(p);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		AbsoluteTest f = new AbsoluteTest();
	}

}

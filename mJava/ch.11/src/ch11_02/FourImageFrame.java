package ch11_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FourImageFrame extends JFrame {
	public FourImageFrame() {
		setTitle("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4,10,10));
		
		ImageIcon img[] = new ImageIcon[4];
		
		for(int i=0;i<img.length;i++) {
			img[i] = new ImageIcon("images/icon" + (i+1) + ".png");
			JLabel j = new JLabel(img[i]);
			c.add(j);
		}		
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FourImageFrame();
	}

}

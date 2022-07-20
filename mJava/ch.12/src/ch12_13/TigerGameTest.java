package ch12_13;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;


class MyPanel extends JPanel{	
	BufferedImage img = null;
	int img_x = 50, img_y = 50;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("images/tiger.gif"));
		}catch(IOException e) {
			System.out.println("no Image");
			System.exit(0);
		}
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
					case KeyEvent.VK_UP: img_y -= 10; break;
					case KeyEvent.VK_DOWN: img_y += 10; break;
					case KeyEvent.VK_LEFT: img_x -= 10; break;
					case KeyEvent.VK_RIGHT: img_x += 10; break;
				}
				repaint();
			}
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		this.requestFocus();
		setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,img_x,img_y,null);
	}
}

public class TigerGameTest extends JFrame {	
	public TigerGameTest() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new TigerGameTest();
	}
} 
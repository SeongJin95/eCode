package ch14_14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.sound.sampled.*;

public class Capture {
	public static void main(String [] args) {
		JFrame capture = new JFrame();
		capture.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension d;
		Rectangle rect = new Rectangle(500, 500);
		capture.setSize(d = new Dimension(500, 500));
		
		try {
			Robot robot = new Robot();
			final BufferedImage image = robot.createScreenCapture(rect);
			image.flush();
			JPanel panel = new JPanel() {
				public void paintComponent(Graphics g) {
					g.drawImage(image, 0, 0, d.width, d.height, this);
				}
			};
			panel.setOpaque(true);
			panel.prepareImage(image, panel);
			panel.repaint();
			capture.getContentPane().add(panel);			
		}catch(Exception e) {e.printStackTrace();}
		capture.setVisible(true);
	}
}

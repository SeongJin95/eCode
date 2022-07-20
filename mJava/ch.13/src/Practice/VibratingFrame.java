package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class VibratingFrame extends JFrame{
	public VibratingFrame() {
		setTitle("진동하는 레이블 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("진동 레이블");
		label.setFont(new Font("고딕", Font.PLAIN, 20));
		label.setLocation(100,100);
		label.setSize(150,20);
		c.add(label);
		
		setSize(300,300);
		setLocation(100,100);
		setVisible(true);
		
		Thread th = new VibratingThread(label);
		th.start();
	}

	class VibratingThread extends Thread{
		private Container c;
		public VibratingThread(Container c){
			this.c = c;
		}
		@Override
		public void run() {
			Random r = new Random();
			int x = c.getX();
			int y = c.getY();
			while(true){
				try{
					Thread.sleep(10);
				}catch(Exception e){
					return;
				}
				/*c.setLocation(c.getX()-5, c.getY()-5);
				c.setLocation(c.getX(), c.getY());
				c.setLocation(c.getX()+5, c.getY()+5);
				c.setLocation(c.getX(), c.getY());*/
				int sign = (r.nextBoolean())? 1:-1;
				int tmpX = x + r.nextInt(5)*sign;
				
				sign = (r.nextBoolean())? 1:-1;
				int tmpY = y+r.nextInt(5)*sign;				
				c.setLocation(tmpX,tmpY);
			}
		} 
	}
	
	public static void main(String[] args) {
		new VibratingFrame();
	}
}

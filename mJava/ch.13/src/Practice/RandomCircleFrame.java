package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomCircleFrame extends JFrame{
	public RandomCircleFrame() {
		setTitle("원을 0.5 초 간격으로 랜덤한 위치로 이동시키는 스레드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		setContentPane(new CirclePanel());
	}
	
	class CirclePanel extends JPanel implements Runnable{
		private int x = 100;
		private int y = 100;
		
		public CirclePanel() {
			this.addMouseListener(new MouseAdapter() {
				private Thread th = null;
				
				@Override
				public void mousePressed(MouseEvent e) {
					if(th==null) {
						System.out.println("on");
						th = new Thread(CirclePanel.this);
						th.start();
					}
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			g.drawOval(x, y, 50, 50);
		}
		
		@Override
		public void run(){
			while(true) {
				try {					
					Thread.sleep(500);
				}catch (InterruptedException e) {return;}
				
				x = (int)(Math.random()*this.getWidth());
				y = (int)(Math.random()*this.getHeight());
				repaint();
			}			
		}
	}
	

	public static void main(String[] args) {
		new RandomCircleFrame();
	}

}

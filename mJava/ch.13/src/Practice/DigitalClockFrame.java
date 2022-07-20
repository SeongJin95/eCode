package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DigitalClockFrame extends JFrame{
	public DigitalClockFrame() {
		setTitle("디지탈 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.add(new MyLabel());
		setSize(300,200);
		setVisible(true);
	}
	
	class MyLabel extends JLabel implements Runnable {
		private Thread timerThread = null;
		public MyLabel() {
			setText(makeClockText());
			setFont(new Font("TimesRoman",Font.ITALIC,50));
			setHorizontalAlignment(JLabel.CENTER);
			timerThread = new Thread(MyLabel.this);
			timerThread.start();
		}
		
		public String makeClockText(){
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			return hour+":"+minute+":"+second;
		}
		
		public void run() {
			while(true) {
				try {					
					Thread.sleep(1000);
				}catch (InterruptedException e) {return;}
				setText(makeClockText());
			}		
		}
	}

	public static void main(String[] args) {
		new DigitalClockFrame();
	}

}

package ch13_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RandomThread extends Thread{
	private  Container contentPane;
	private boolean flag = false;
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void finish() {
		flag = true;
	}
	//스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		
		while(true) {//무한루프
			int x = (int)(Math.random()*contentPane.getWidth());
			int y = (int)(Math.random()*contentPane.getHeight());
			JLabel la = new JLabel("java");
			la.setSize(80, 30);
			la.setLocation(x,y);
			contentPane.add(la);
			contentPane.repaint();
			try {
				Thread.sleep(300);//1초동안 잠을잔다
				if(flag==true) {
					contentPane.removeAll();
					la = new JLabel("finish");
					la.setSize(80, 30);
					la.setLocation(100,100);
					la.setForeground(Color.RED);
					contentPane.add(la);
					contentPane.repaint();
					return;
				}
			}
			catch(InterruptedException e) {
				return ;//예외 발생시 스레드 종료
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {				
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}			
		});
		
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();		
	}
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}

}



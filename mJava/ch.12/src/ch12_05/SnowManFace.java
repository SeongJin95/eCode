package ch12_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnowManFace extends JFrame{
	private MyPanel panel = new MyPanel();
	public SnowManFace() {
		setTitle("눈사람 얼굴");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(300,300);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//JPanel의 paintComponent() 호출
			g.setColor(Color.YELLOW);
			g.fillOval(20,30,200,200);
			g.setColor(Color.BLACK);
			g.drawArc(60,80,50,50,180,-180);
			g.drawArc(150,80,50,50,180,-180);
			g.drawArc(70,130,100,70,180,180);
		}
	}

	public static void main(String[] args) {
		new SnowManFace();
	}

}

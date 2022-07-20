package ch12_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThreeColorCircle extends JFrame{
	private MyPanel panel = new MyPanel();
	public ThreeColorCircle() {
		setTitle("fillxxx 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(400, 300);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.RED);//마젠타색 선택
			g.fillArc(50,50,100,100,90,120);
			g.setColor(Color.BLUE);//마젠타색 선택
			g.fillArc(50,50,100,100,210,120);
			g.setColor(Color.YELLOW);//마젠타색 선택
			g.fillArc(50,50,100,100,330,120);
			
			g.setColor(Color.RED);//마젠타색 선택
			g.fillArc(200,50,100,100,0,90);
			g.setColor(Color.BLUE);//마젠타색 선택
			g.fillArc(200,50,100,100,90,90);
			g.setColor(Color.YELLOW);//마젠타색 선택
			g.fillArc(200,50,100,100,180,90);
			g.setColor(Color.GREEN                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        );//마젠타색 선택
			g.fillArc(200,50,100,100,270,90);
		}
	}

	public static void main(String[] args) {
		new ThreeColorCircle();
	}

}
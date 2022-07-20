package ch12_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawLineEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(200,170);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//JPanel의 paintComponent() 호출
			g.setColor(Color.RED);//빨간색 선택
			g.drawLine(20,20,100,100);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}

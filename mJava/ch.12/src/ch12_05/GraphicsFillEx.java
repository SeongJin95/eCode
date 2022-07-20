package ch12_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsFillEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillxxx 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(100,350);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//JPanel의 paintComponent() 호출
			g.setColor(Color.RED);//빨간색 선택
			g.fillRect(10,10,50,50);
			g.setColor(Color.BLUE);//파란색 선택
			g.fillOval(10,70,50,50);
			g.setColor(Color.GREEN);//초록색 선택
			g.fillRoundRect(10,130,50,50,20,20);
			g.setColor(Color.MAGENTA);//마젠타색 선택
			g.fillArc(10,190,50,50,0,270);
			g.setColor(Color.ORANGE);//오렌지색 선택
			int x[]= {30,10,30,60};
			int y[] = {250,275,300,275};
			g.fillPolygon(x,y,4);
		}
	}

	public static void main(String[] args) {
		new GraphicsFillEx();
	}

}

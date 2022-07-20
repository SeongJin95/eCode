package ch12_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawStringEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawStringEx() {
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(350,470);
		setVisible(true);
	}
	
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//JPanel의 paintComponent() 호출
			g.setColor(Color.BLUE);
			g.drawString("자바는 재밌다.~~", 30,30);// (30,30) 위치에 문자열 출력
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for(int i=1;i<=5;i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*60);
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}

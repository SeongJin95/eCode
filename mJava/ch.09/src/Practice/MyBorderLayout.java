package Practice;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout extends JFrame{
	public MyBorderLayout() {
		setTitle("BorderLayout Sample");//프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));//컨텐트팬에 BorderLayout 배치간리자 설정
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyBorderLayout();
	}

}

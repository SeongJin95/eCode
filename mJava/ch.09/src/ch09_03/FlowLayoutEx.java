package ch09_03;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");//프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우를 닫으면 프로그램 종료
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));//컨텐트팬에 FlowLayout 배치
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();
	}

}

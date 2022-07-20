package ch10_05;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");// "Hello"를 출력하기 위한 레이블

	public MouseAdapterEx() {
		super("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());	//컨텐트팬에 Mouse 이벤트 리스너 달기

		c.setLayout(null);	//컨텐트팬의 배치관리자 삭제
		la.setSize(50, 20);	//레이블의 크기 50x20설정
		la.setLocation(30, 30);//레이블의 위치 (30,30)으로 설정
		c.add(la);//레이블 컴포넌트 삽입

		setSize(250, 250);
		setVisible(true);
	}
	//MouseAdapter를 상속받아 리스너 구현
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		
	}
	

	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}

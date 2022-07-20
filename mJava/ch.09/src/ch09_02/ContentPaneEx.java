package ch09_02;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");				//프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프레임 윈도우를 닫으면 프로그램을 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));				//OK버튼 달기
		contentPane.add(new JButton("Cancel"));			//Cancle버튼 달기
		contentPane.add(new JButton("Ignore"));			//Ignore버튼 달기
		
		setSize(300, 150);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}

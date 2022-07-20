package ch09_04;

import javax.swing.*;

public class MyLab {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		
		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(10);
		JButton button1 = new JButton("변환");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button1);
		
		f.setTitle("온도변환기");//프레임의 타이틀 달기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우를 닫으면 프로그램 종료
		
		f.setSize(250, 150);
		f.setVisible(true);
	}

}

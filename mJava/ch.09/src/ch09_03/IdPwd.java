package ch09_03;

import java.awt.*;
import javax.swing.*;

public class IdPwd {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel label1 = new JLabel("아이디 ");
		JLabel label2 = new JLabel("패스워드");
		
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button1);
		panel.add(button2);
		
		panel.setBackground(Color.GREEN);
		
		f.setTitle("FlowLayout Sample");//프레임의 타이틀 달기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우를 닫으면 프로그램 종료
		
		f.setSize(300, 200);
		f.setVisible(true);
	}

}



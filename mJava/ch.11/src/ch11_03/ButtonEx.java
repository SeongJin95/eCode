package ch11_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3개의 이미지를 파일로부터 읽어들인다.		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");//이미지 로딩
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");//이미지 로딩
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");//이미지 로딩
		
		//3개의 이미지를 가진 버튼 생성
		JButton btn = new JButton("call~~", normalIcon);//용 이미지 등록
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}

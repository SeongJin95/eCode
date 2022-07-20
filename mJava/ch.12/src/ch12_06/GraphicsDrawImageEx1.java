package ch12_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx1 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx1() {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(300,300);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}

}

package ch12_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx2() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(200,300);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx2();
	}

}

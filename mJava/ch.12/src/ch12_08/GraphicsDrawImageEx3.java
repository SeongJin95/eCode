package ch12_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDrawImageEx3 extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx3() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(300,400);
		setVisible(true);
	}
	//JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setClip(100,20,150,150);
			g.drawImage(img,  0,  0,  getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}

}

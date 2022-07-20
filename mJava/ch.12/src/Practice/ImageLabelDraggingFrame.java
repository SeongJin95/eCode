package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageLabelDraggingFrame extends JFrame {
	public ImageLabelDraggingFrame() {
		super("이미지 레이블 원 드래깅 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		setContentPane(new MyLabel());
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	class MyLabel extends JLabel{	
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image img = icon.getImage();
		private int ovalX = 100, ovalY = 100;
		private final int RADIUS = 100;
		
		public MyLabel() {
			JLabel la = new JLabel(icon);
			la.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
				
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, ovalX,ovalY,RADIUS,RADIUS, this);
		}
		
	
	}
	
	public static void main(String[] args) {
		new ImageLabelDraggingFrame();
	}

}

/*
public class ImageLabelDraggingFrame extends JFrame {
	public ImageLabelDraggingFrame() {
		super("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon icon = new ImageIcon("images/apple.jpg");//이미지 로딩
		JLabel imageLabel = new JLabel(icon);//이미지 레이블 만들기
		
		//이미지 레이블의 크기와 위치 지정
		imageLabel.setSize(icon.getIconHeight(),icon.getIconWidth());
		imageLabel.setLocation(100,100);
		
		//마우스 리스너와 마우스 모션 리스너 객체 달기
		class MyMouseListener extends MouseAdapter{
			private Point startP = null;//드래깅 시작 점
			
			@Override
			public void mousePressed(MouseEvent e){
				startP = e.getPoint();
			}
			
			@Override 
			public void mouseDragged(MouseEvent e){
				Point endP = e.getPoint();
				Component la = (JComponent)(e.getSource());
				Point p = la.getLocation();
				la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
				la.getParent().repaint();//음직인 la의 위치에 다시 그리기
			}
		}
}
		
	
	public static void main(String[] args) {
		new ImageLabelDraggingFrame();
	}

}

*/

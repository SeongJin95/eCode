package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClipAndKeyFrame extends JFrame {
	public ClipAndKeyFrame() {
		setTitle("Open Challenge 12");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel p = new ImagePanel();
		setContentPane(p);
		
		setSize(700,700);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}

	class ImagePanel extends JPanel {
		private Image img = null;
		private int clipX=0,clipY=0;
		
		public ImagePanel() {
			img = new ImageIcon("images/image0.jpg").getImage();		
		
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JPanel panel = (JPanel)e.getSource();
					panel.requestFocus();
				}
			});
			this.addKeyListener(new MyKeyListener());
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(clipX,clipY,100,100);
			g.drawImage(img,0,0,getWidth(),getHeight(),this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("굴림체",Font.ITALIC,40));
			g.drawString("자바",40,340);
		}
		
		class MyKeyListener extends KeyAdapter{
			public void keyPressed(KeyEvent e) {
				//상,하,좌,우 키는 유니코드 키가 아니므로 getKeyCode()로 키 값을 알아낸다.
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:
					clipY -= 10;
					if(clipY < 0)
						clipY = 0;
					break;
				case KeyEvent.VK_DOWN:
					clipY += 10;
					if(clipY > getHeight())
						clipY = 700;
					break;
				case KeyEvent.VK_LEFT:
					clipX -= 10;
					if(clipX < 0)
						clipX = 0;
					break;
				case KeyEvent.VK_RIGHT:
					clipX += 10;
					if(clipX > getWidth())
						clipX = 700;
					break;
			
				}
				repaint();
			}
		}
	}
	public static void main(String [] args) {
		new ClipAndKeyFrame();
	}
} 
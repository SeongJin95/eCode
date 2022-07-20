package Prac07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WheelEventFrame extends JFrame{
	String str = "Love Java";
	JLabel label = new JLabel(str);
	int f = 20; 

	
	public WheelEventFrame() {
		super("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();	
		c.setLayout(new FlowLayout());
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, f));
		label.setText(str);
		label.addMouseWheelListener(new MyMouseWheelListener());		
		c.add(label);

		setSize(250,150);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
		
	}
	
	class MyMouseWheelListener implements MouseWheelListener{
		public void mouseWheelMoved(MouseWheelEvent e) {
			JLabel la = (JLabel)(e.getSource());
			int n = e.getWheelRotation();
			//Fonf f = la.getFont();
			//int size = f.getSize();
			if(n>0) {
				f+=5;
				la.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, f));
			}else {
				f-=5;
				la.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, f));
			}
			
		}
	}
	
	public static void main(String[] args) {
		new WheelEventFrame();
	}

}

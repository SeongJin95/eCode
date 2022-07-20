package Exercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise extends JFrame{
	public Exercise() {
		/*JButton btn = new JButton("Hello");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(btn);
		btn.addActionListener(new MyActionListener("1"));
		btn.addActionListener(new MyActionListener("2"));
		btn.addActionListener(new MyActionListener("3"));
		
		setSize(300,300);
		setVisible(true);
	}
	class MyActionListener implements ActionListener{
		private String msg;
		MyActionListener(String msg){
			this.msg = msg;
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println(msg);
		}		
	}*/
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{
		private int count = 0;
		public void mousePressed(MouseEvent e) {count++;}
		public void mouseReleased(MouseEvent e) {System.out.print(count);}
		public void mouseDragged(MouseEvent e) {count++;}
		
	}
	public static void main(String[] args) {
		new Exercise();
	}

}

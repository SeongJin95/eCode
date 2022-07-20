package ch10_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Hello");
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
			System.out.print(msg + " ");
		}
		
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}

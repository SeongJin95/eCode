package ch14_11;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneEx extends JFrame{
	private JLabel imageLabel = new JLabel();
	
	public TabbedPaneEx() {
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		setSize(250,250);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("Tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("Tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("Tab3", new MyPanel());
		return pane;
	}

	class MyPanel extends JPanel{
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3에 들어가는 JPanel 입니다.", 30, 50);
		}
	}
	
	public static void main(String[] args) {
		new TabbedPaneEx();
	}

}

package ch14_03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolBarEx extends JFrame{
	private Container c;
	
	public ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createTooBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createTooBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		c.add(toolBar, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}

}

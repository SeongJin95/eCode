package ch14_01;

import java.awt.FlowLayout;

import javax.swing.*;

public class FrameSample extends JFrame{
	public FrameSample() {
		setTitle("프레임 구성");
		
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		JMenu searchMenu = new JMenu("Search");
		JMenu windowMenu = new JMenu("Window");
		
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(sourceMenu);
		mb.add(searchMenu);
		mb.add(windowMenu);
		setJMenuBar(mb);
		
		setLayout(new FlowLayout());
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameSample();
	}

}

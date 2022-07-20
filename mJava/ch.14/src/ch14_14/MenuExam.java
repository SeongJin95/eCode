package ch14_14;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.sound.sampled.*;

public class MenuExam extends JFrame{
	private JPanel contentPane;
	
	public static void main(String [] args) {
		MenuExam frame = new MenuExam();
		frame.setVisible(true);
	}
	
	public MenuExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("파일");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("새파일");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("열기");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("저장");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem miExit = new JMenuItem("종료");
		miExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MenuExam.this, "종료할까요?");
				if(result==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}			
		});
		mnNewMenu.add(miExit);
		
		JMenu mnNewMenu_1 = new JMenu("색상");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem miRed = new JMenuItem("Red");
		miRed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
			}
		});
		
		mnNewMenu_1.add(miRed);
		
		JMenuItem miGreen = new JMenuItem("Green");
		miGreen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.green);
			}
		});
		mnNewMenu_1.add(miGreen);
		
		JMenuItem miBlue = new JMenuItem("Blue");
		miBlue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.blue);
			}
		});
		mnNewMenu_1.add(miBlue);
		
		JMenuItem miBlack = new JMenuItem("Black");
		miBlack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLACK);
			}
		});
		mnNewMenu_1.add(miBlack);
		
		JMenu mnNewMenu_2 = new JMenu("도움말");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
	}
}

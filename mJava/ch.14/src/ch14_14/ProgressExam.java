package ch14_14;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.sound.sampled.*;

public class ProgressExam extends JFrame{
	
	private JPanel contentPane;
	private JProgressBar progress;
	
	public static void main(String [] args) {
		ProgressExam frame = new ProgressExam();
		frame.setVisible(true);
	}
	
	public ProgressExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		progress = new JProgressBar();
		progress.setStringPainted(true);
		contentPane.add(progress);
		
		JButton btnStart = new JButton("시작");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread th = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i=1;i<=100;i++) {
							progress.setValue(i);
							try {
								Thread.sleep(10);
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
						}
						JOptionPane.showMessageDialog(ProgressExam.this,  "완료되었습니다.");
					}
				});
				th.start();
			}
		});
		contentPane.add(btnStart);
	}

}

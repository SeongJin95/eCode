package ch14_14;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.sound.sampled.*;

public class Point extends JFrame{
	
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField  tfMath;
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	private JLabel lblResult;
	
	public static void main(String [] args) {
		Point frame = new Point();
		frame.setVisible(true);
	}
		
	public Point() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,285,409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(34,26,57,15);
		contentPane.add(lblNewLabel);
		
		tfName = new JTextField();
		tfName.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				name = tfName.getText();
				if(name.equals("")){
					check("이름을 입력하세요", tfName);
					return;
				}
				tfKor.requestFocus();
			}
		});
		tfName.setBounds(114,23,116,21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel label = new JLabel("국어");
		label.setBounds(34,57,57,15);
		contentPane.add(label);
		
		tfKor = new JTextField();
		tfKor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strKor = tfKor.getText();
				if(strKor.equals("")) {
					check("국어점수를 입력하세요.", tfKor);
					return;
				}
				tfEng.requestFocus();
			}
		});
		tfKor.setColumns(10);
		tfKor.setBounds(114,54,116,21);
		contentPane.add(tfKor);
		
		JLabel label_1 = new JLabel("영어");
		label_1.setBounds(34,90,57,15);
		contentPane.add(label_1);
		
		tfEng = new JTextField();
		tfEng.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strEng = tfEng.getText();
				if(strEng.equals("")) {
					check("영어점수를 입력하세요", tfEng);;
					return;
				}
				tfMath.requestFocus();
			}
		});
		tfEng.setColumns(10);
		tfEng.setBounds(114,87,116,21);
		contentPane.add(tfEng);
		
		JLabel label_2 = new JLabel("수학");
		label_2.setBounds(34,123,57,15);
		contentPane.add(label_2);
		
		tfMath = new JTextField();
		tfMath.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strEng = tfMath.getText();
				if(strEng.equals("")) {
					check("수학점수를 입력하세요", tfMath);;
					return;
				}
				calc();
			}
		});
		tfMath.setColumns(10);
		tfMath.setBounds(114,117,116,21);
		contentPane.add(tfMath);
		
		JButton btnEval = new  JButton("계산");
		btnEval.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		btnEval.setBounds(30,163,97,23);
		contentPane.add(btnEval);
		this.getRootPane().setDefaultButton(btnEval);
		
		JButton btnCancle = new JButton("취소");
		btnCancle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tfName.setText("");
				tfKor.setText("");
				tfEng.setText("");
				tfMath.setText("");
				tfName.requestFocus();				
			}
		});
		btnCancle.setBounds(133,163,97,23);
		contentPane.add(btnCancle);
		
		lblResult = new JLabel("결 과");
		lblResult.setBounds(34,196,196,144);
		contentPane.add(lblResult);
	}
	void check(String message, JTextField tf) {
		JOptionPane.showMessageDialog(Point.this, message);
		tf.requestFocus();
	}
	void calc() {
		name = tfName.getText();
		if(name=="") {
			check("이름을 입력하세요", tfName);
			return;
		}
		if(name.equals("")) {
			check("이름을 입력하세요", tfName);
			return;
		}
		String strKor = tfKor.getText();
		if(strKor.equals("")) {
			check("국어점수를 입력하세요", tfKor);
			return;
		}
		String strEng = tfEng.getText();
		if(strEng.equals("")) {
			check("국어점수를 입력하세요", tfEng);
			return;
		}
		String strMath = tfMath.getText();
		if(strMath.equals("")) {
			check("국어점수를 입력하세요", tfMath);
			return;
		}
		kor = Integer.parseInt(strKor);
		eng = Integer.parseInt(strEng);
		math = Integer.parseInt(strMath);
		tot = kor + eng + math;
		avg = tot / 3.0;
		String result = "이름:" + name + " 총점:" + tot + " 평균:" + String.format("%.2f", avg);
		
		lblResult.setText(result);
	}
}

package ch11_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class JTextTest extends JFrame {
	JLabel lbl, la1, la2;
	JTextField id;
	JPasswordField passwd;
	JPanel idPanel, paPanel, loginPanel;
	JButton b1, b2;
	JTextArea content;
	
	public JTextTest() {
		super("JText 테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		lbl = new JLabel("아이디와 패스워드를 입력해 주세요");//레이블 생성
		add(lbl);
		
		//id패널과 pw패널생성
		idPanel = new JPanel();
		la1 = new JLabel("아이디");
		idPanel.add(la1);
		id = new JTextField(10);
		idPanel.add(id);
		add(idPanel);
		
		paPanel = new JPanel();
		la2 = new JLabel("패스워드");
		paPanel.add(la2);
		passwd = new JPasswordField(10);
		paPanel.add(passwd);
		add(paPanel);
		
		loginPanel = new JPanel();
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		
		loginPanel.add(b1);
		loginPanel.add(b2);
		add(loginPanel);
		
		content = new JTextArea(3, 20);
		JScrollPane s = new JScrollPane(content);
		add(s);
		add(content);
		/*	
		 id 패널과 pw 패널 생성
		idPanel = new JPanel();
		paPanel = new JPanel();
		la1 = new JLabel("아이디");
		la2 = new JLabel("패스워드");
		//id텍스트 필드와 pw 텍스트 필드 선언
		id = new JTextField(10);
		passwd = new JPasswordField(10);
		paPanel.add(passwd);
		idPanel.add(la1);
		idPanel.add(id);
		paPanel.add(la2);
		paPanel.add(passwd);
		//로그인과 회원가입을 위한 패널 생성
		loginPanel = new JPanel();
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		loginPanel.add(b1);
		loginPanel.add(b2);
		add(idPanel);
		add(paPanel);
		add(loginPanel);
		
		 */
		setSize(400, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextTest();
	}

}


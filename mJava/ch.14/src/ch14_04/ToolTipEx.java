package ch14_04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolTipEx extends JFrame{
	private Container c;
	
	public ToolTipEx() {
		setTitle("툴팁 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createTooBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createTooBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");		
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		JButton b1 = new JButton("New");
		b1.setToolTipText("파일을 생성합니다.");
		toolBar.add(b1);
		
		JButton b2 = new JButton(new ImageIcon("images/open.jpg"));
		b2.setToolTipText("파일을 엽니다.");
		toolBar.add(b2);
		
		JButton b3 = new JButton(new ImageIcon("images/save.jpg"));
		b3.setToolTipText("파일을 저장합니다.");
		toolBar.add(b3);
				
		toolBar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요.");
		toolBar.add(tf);
		c.add(toolBar, BorderLayout.NORTH);
		
		
		
		
	}

	public static void main(String[] args) {
		new ToolTipEx();
	}

}

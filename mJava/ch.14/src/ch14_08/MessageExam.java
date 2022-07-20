package ch14_08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MessageExam extends JFrame{
	private JPanel c;
	public MessageExam() {
		super("다이얼로그 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		c = new JPanel();
		c.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(c);
		c.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		JButton button1 = new JButton("Message");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MessageExam.this, "Message");
			}
		});		
		c.add(button1);
		
		JButton button2 = new JButton("Message");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(MessageExam.this, "종료할까요?", null, JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_NO_OPTION)
					System.exit(0);					
			}
		});
		c.add(button2);
		
		JButton button3 = new JButton("Input");
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(MessageExam.this, "이름을 입력하세요.");
				JOptionPane.showMessageDialog(MessageExam.this, name+"님 환영 합니다.");
			}
		});
		c.add(button3);
		
		JButton button4 = new JButton("Option");
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] str = {"추가","수정","삭제"};
				JOptionPane.showOptionDialog(MessageExam.this, "선택하세요.", "작업선택", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,null,str,str[2]);
			}
		});
		c.add(button4);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MessageExam();
	}

}


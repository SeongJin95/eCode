package ch11_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ComboActionEx extends JFrame{
	private String fruits[] = {"apple", "banana", "kiwi", "mango"};//콤보 박스의 아이템
	private ImageIcon images[] = {new ImageIcon("images/apple.jpg"), new ImageIcon("images/banana.jpg"), //이미지 객체 배열
								  new ImageIcon("images/kiwi.jpg"), new ImageIcon("images/mango.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);//이미지 레이블 컴포넌트
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);//문자열 콤보박스
	
	public ComboActionEx() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		//Action 리스너 등록
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);				
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ComboActionEx();
	}

}

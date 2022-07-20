package ch11_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class TextConverter extends JFrame{
	JButton converter;
	JButton canceler;
	JTextArea textIn;
	JTextArea textOut;
	
	public TextConverter() {
		super("텍스트 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//텍스트 영역
		textIn = new JTextArea(10,14);
		textOut = new JTextArea(10,14);
		textIn.setLineWrap(true);//자동줄바꿈
		textOut.setLineWrap(true);
		textOut.setEnabled(false);//비활성화
		
		//텍스트 영역을 관리할 패널
		JPanel textAreaPanel = new JPanel (new GridLayout(1,2,20,20));
		textAreaPanel.add(textIn);
		textAreaPanel.add(textOut);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());;
		
		//버튼
		converter = new JButton("변환");
		canceler = new JButton("취소");
		converter.addActionListener(new ButtonActionListener());
		canceler.addActionListener(new ButtonActionListener());
		
		//버튼 패널
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(converter);
		buttonPanel.add(canceler);
		
		//메인 패널
		JPanel mainPanel = new JPanel(new BorderLayout(10,10));
		mainPanel.add(BorderLayout.CENTER, textAreaPanel);
		mainPanel.add(BorderLayout.SOUTH, buttonPanel);
		
		//프레임 설정
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		add(mainPanel);
		pack();		
		setSize(350, 300);
		setVisible(true);		
	}
	
	private class ButtonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e ) {
			if(e.getSource() == converter) {
				textOut.setText("");
				String result = toEnglish(textIn.getText());
				textOut.append(result);
			}
			if(e.getSource() == canceler) {
				textOut.setText("");
			}
		}
		
		private String toEnglish(String korean) {
			String result = korean;
			result = result.replace("텍스트", "Text");
			result = result.replace("영어", "English");
			result = result.replace("사과", "Apple");
			result = result.replace("바나나", "Banana");
			return result;
		}
	}
	
	public static void main(String[] args) {
		new TextConverter();
	}

}


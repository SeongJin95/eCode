package ch11_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class DigitChangerFrame extends JFrame{
	JTextField src = new JTextField(8);	//입력용 텍스트필드
	JTextField dest = new JTextField(8);	//출력용 텍스트 필드
	JRadioButton radio[] = new JRadioButton[4];	//라디오 버튼 배열 생성
	String text[] = {"decimal", "binary", "octal", "hex"};

	public DigitChangerFrame() {
		super("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹 생성
		MyItemListener  listener = new MyItemListener();//Item리스너 생성
		
		//컴포넌트 부착
		add(src);
		add(new JLabel("==>"));
		add(dest);
		
		for(int i=0;i<radio.length;i++) {
			radio[i] = new JRadioButton(text[i]);	//라디오버튼 생성
			radio[i].addItemListener(listener);		//리스너 부착
			add(radio[i]);	//라디오버튼을 컨텐트팬에 부착
			g.add(radio[i]);	//라디오버튼을 버튼 그룹에 부착
		}
		
		setSize(280, 150);
		setVisible(true);		
	}
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED)
				return;
			int n;
			String text = ((JRadioButton)e.getItem()).getText();
			try {
				switch(text) {
					case "decimal":
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toString(n));
						break;
					case "binary":
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toBinaryString(n));
						break;
					case "octal":
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toOctalString(n));
						break;
					case "hex":
						n = Integer.parseInt(src.getText());
						dest.setText(Integer.toHexString(n));
						break;
				}
			}catch(NumberFormatException exp) {
				dest.setText("변환할 수 없습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new DigitChangerFrame();
	}

}

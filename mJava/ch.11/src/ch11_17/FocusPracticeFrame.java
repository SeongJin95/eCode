package ch11_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class FocusPracticeFrame extends JFrame{
	JTextField tf = new JTextField(10);
	
	public FocusPracticeFrame() {
		super("Focus Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new JLabel("입력한 후 다른 창에 마우스 클릭하면 대문자로 변합니다."));
		add(tf);
		
		tf.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				JTextField t = (JTextField)e.getSource();
				t.setText(t.getText().toUpperCase());
			}
		});
		
		setSize(400, 100);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new FocusPracticeFrame();
	}

}

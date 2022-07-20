package ch10_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	public MyFrame() {
		super("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		JLabel label = new JLabel("");
		JButton button = new JButton("Action");
		JPanel panel = new JPanel();
		
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					//label.setText("마침내 버튼이 눌려졌습니다.");
				}
			}
		});
		
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
}

public class ActionEventTest extends JFrame{
	public static void main(String[] args) {
		new ActionEventTest();
	}
}


package ch10_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCounter extends JFrame implements ActionListener{
	private JLabel label, label1;
	private JButton button;
	private int count = 0;
	
	public MyCounter() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);
		label1 = new JLabel("" + count);
		//레이블에 폰트를 설정한다.
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
		
		panel.add(label1);
		button = new JButton("count");
		button.addActionListener(this);
		panel.add(button);
		
		
		add(panel);
		setSize(300,200);
		setTitle("My Counter");
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		count++;
		label1.setText(count + "");
	}
	
}

public class CounterTest {
	
	public static void main(String[] args) {
		new MyCounter();
	}

}

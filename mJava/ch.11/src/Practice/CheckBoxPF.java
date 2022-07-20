package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxPF extends JFrame{	
	public CheckBoxPF() {
		setTitle("Swing 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox enable = new JCheckBox("버튼 비활성화");
		JCheckBox diable = new JCheckBox("버튼 감추기");
		
		JButton b = new JButton("test button");
		
		enable.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					b.setEnabled(false);
				else
					b.setEnabled(true);
			}
		});
		
		diable.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					b.setVisible(false);
				else {
					b.setVisible(true);
				}
			}
		});
		
		
		c.add(enable);
		c.add(diable);
		c.add(b);		
		
		setSize(250,300);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new CheckBoxPF();
	}

}

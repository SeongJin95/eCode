package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTF_and_JCB extends JFrame{
	String list[];
	public JTF_and_JCB() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField jtf = new JTextField(10);
		JComboBox jcb = new JComboBox();//문자열 콤보박스
		
		jtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				String text = t.getText();
				jtf.setText("");
				jcb.addItem(text);
			}
		});
		
		
		c.add(jtf);
		c.add(jcb);
		
		setSize(300,300);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new JTF_and_JCB();
	}

}

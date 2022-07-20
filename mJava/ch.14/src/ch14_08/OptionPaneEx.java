package ch14_08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneEx extends JFrame{
	
	public OptionPaneEx() {
		super("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new MyPanel(), BorderLayout.NORTH);		
		setSize(500,200);
		setVisible(true);
	}

	class MyPanel extends JPanel{
		private JButton inputB = new JButton("Input Name");
		private JButton confirmB = new JButton("Confirm");
		private JButton MessageB = new JButton("Message");
		private JTextField tf = new JTextField(10);
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputB);
			add(confirmB);
			add(MessageB);
			add(tf);
			
			inputB.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					if(name != null)
						tf.setText(name);
				}
			});
			confirmB.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else 
						tf.setText("No");
				}
			});
			MessageB.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
				}
			});
		}
	}
	
	public static void main(String[] args) {
		new OptionPaneEx();
	}

}


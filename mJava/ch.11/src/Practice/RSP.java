package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RSP extends JFrame {
	JLabel la1 = new JLabel("me");
	JLabel la2 = new JLabel("com");
	JLabel la3 = new JLabel();
	JButton b1, b2, b3;
	ImageIcon icon1 = new ImageIcon("./images/gawi.jpg");
	ImageIcon icon2 = new ImageIcon("./images/bawi.jpg");
	ImageIcon icon3 = new ImageIcon("./images/bo.jpg");
	public RSP() {
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		
		panel.setPreferredSize(new Dimension(300, 100));
		panel1.setPreferredSize(new Dimension(300, 150));
		panel.setBackground(Color.GRAY);
		panel1.setBackground(Color.YELLOW);
				
		
		b1 = new JButton();
		b1.setIcon(icon1);
		b1.setPreferredSize(new Dimension(100, 100));
		b2 = new JButton();
		b2.setIcon(icon2);
		b2.setPreferredSize(new Dimension(100, 100));
		b3 = new JButton();
		b3.setIcon(icon3);
		b3.setPreferredSize(new Dimension(100, 100));
		
		panel.setLayout((new FlowLayout(FlowLayout.CENTER)));
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		panel1.setLayout(new FlowLayout());
		
		la3.setBackground(Color.YELLOW);
		la3.setForeground(Color.RED);
		la3.setOpaque(true);
		
		b1.addActionListener(new MyActionListener());
		b2.addActionListener(new MyActionListener());
		b3.addActionListener(new MyActionListener());
		
		panel1.add(la1);
		panel1.add(la2);
		panel1.add(la3);
				
		add(panel);
		c.add(panel1);
		
		
		
		setSize(350,300);
		setVisible(true);
	}	
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = new JButton();
			b = (JButton)e.getSource();
			la1.setIcon(b.getIcon());
			int r = (int)(Math.random()*3);
			
			if(r==0) {				
				la2.setIcon(icon1);
				if(e.getSource() == b1)
					la3.setText("Same !!!");
				else if(e.getSource() == b2)
					la3.setText("You Win !!!");
				else
					la3.setText("Computer Win !!!");
			}else if(r==1) {
				la2.setIcon(icon2);
				if(e.getSource() == b1)
					la3.setText("Computer Win !!!");
				else if(e.getSource() == b2)
					la3.setText("Same !!!");
				else
					la3.setText("You Win !!!");
			}else if(r==2) {
				la2.setIcon(icon3);
				if(e.getSource() == b1)
					la3.setText("You Win !!!");
				else if(e.getSource() == b2)
					la3.setText("Computer Win !!!");
				else
					la3.setText("Same !!!");
			}
				
		}
	}
	
	public static void main(String[] args) {
		new RSP();
	}

}


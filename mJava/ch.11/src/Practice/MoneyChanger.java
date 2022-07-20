package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoneyChanger extends JFrame {
	private JLabel lb, l1, l2, l3, l4, l5, l6, l7, l8;
	private JTextField j, j1, j2, j3, j4, j5, j6, j7, j8 ;
	private JButton jb = new JButton("계산");
	JPanel panel, panel1, panel2;
	int sum = 0;
	public MoneyChanger() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		panel = new JPanel();
		lb = new JLabel("금액     ");
		j = new JTextField(10);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s = Integer.parseInt(j.getText());
				int c = s/50000;
				int su = s%50000;
				j1.setText(Integer.toString(c));
				c = su/10000;
				su = s%10000;
				j2.setText(Integer.toString(c));
				c = su/1000;
				su = s%1000;
				j3.setText(Integer.toString(c));
				c = su/500;
				su = s%500;
				j4.setText(Integer.toString(c));
				c = su/100;
				su = s%100;
				j5.setText(Integer.toString(c));
				c = su/50;
				su = s%50;
				j6.setText(Integer.toString(c));
				c = su/10;
				su = s%10;
				j7.setText(Integer.toString(c));
				j8.setText(Integer.toString(su));
			}
		});
		jb.setPreferredSize(new Dimension(100, 20));
		panel.add(lb);
		panel.add(j);
		panel.add(jb);
		
		
		 
		l1 = new JLabel("오만원   ");
		j1 = new JTextField(7);
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(8,2));
		panel1.add(l1);
		panel1.add(j1);
		
		l2 = new JLabel("만원   ");
		j2 = new JTextField(7);
		panel1.add(l2);
		panel1.add(j2);
		
		l3 = new JLabel("오천원   ");
		j3 = new JTextField(7);
		panel1.add(l3);
		panel1.add(j3);
		
		l4 = new JLabel("천원   ");
		j4 = new JTextField(7);
		panel1.add(l4);
		panel1.add(j4);
		
		l5 = new JLabel("500원   ");
		j5 = new JTextField(7);
		panel1.add(l5);
		panel1.add(j5);
		
		l6 = new JLabel("100원   ");
		j6 = new JTextField(7);
		panel1.add(l6);
		panel1.add(j6);
		
		l7 = new JLabel("10원   ");
		j7 = new JTextField(7);
		panel1.add(l7);
		panel1.add(j7);
		
		l8 = new JLabel("1원   ");
		j8 = new JTextField(7);
		panel1.add(l8);
		panel1.add(j8);
		/*
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(8,1));
		panel2.add(j1);
		panel2.add(j2);
		panel2.add(j3);
		panel2.add(j4);
		panel2.add(j5);
		panel2.add(j6);
		panel2.add(j7);
		panel2.add(j8);
		*/
		panel.setBackground(Color.PINK);
		panel1.setBackground(Color.PINK);
		//panel2.setBackground(Color.PINK);
		c.setBackground(Color.PINK);
		
		c.add(panel, BorderLayout.NORTH);
		c.add(panel1, BorderLayout.CENTER);
		/*JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(panel1);
		panel3.add(panel2);
		add(panel3, BorderLayout.CENTER);*/
		
		setSize(300,300);
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		new MoneyChanger();
	}

}

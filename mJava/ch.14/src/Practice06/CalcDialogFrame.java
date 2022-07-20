package Practice06;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class CalcDialogFrame extends JFrame{
	CalcDialog ca;
	JLabel la = new JLabel("계산 결과 출력");
	public CalcDialogFrame() {
		super("다이얼로그 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JButton b = new JButton("calculate");
		
		la.setBackground(Color.green);
		la.setOpaque(true);
		c.add(b);
		c.add(la);
		ca = new CalcDialog(this);
		b.addActionListener(new MyActionListener());
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	class MyActionListener implements ActionListener{
		private CalcDialog dialog;
		public MyActionListener(){
			dialog = new CalcDialog(CalcDialogFrame.this);
		}
			
		@Override
		public void actionPerformed(ActionEvent e) {
			dialog.setVisible(true);
			//la.setText(Integer.toString(dialog.getResult()));
			if(dialog.isValid())
				la.setText(Integer.toString(dialog.getResult()));
		}
	}
	
	
	public static void main(String[] args) {
		CalcDialogFrame frame = new CalcDialogFrame();
	}

}

class CalcDialog extends JDialog{
	JTextField tf = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton ca = new JButton("Add");
	boolean bValid = false;
	int result;
	public CalcDialog(JFrame frame) {
		super(frame, "Calculation Dialog", true);
		setLayout(new FlowLayout());
		add(new JLabel("두 수를 더합니다."));
		add(tf);
		add(tf2);
		add(ca);
		setVisible(false);
		setSize(150,200);
		
		ca.addActionListener(new MyActionListener());
	}
	
	public int getResult() {
		return result;
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int x;
				int y;
				
				x = Integer.parseInt(tf.getText());
				y = Integer.parseInt(tf2.getText());
				result = x + y;
				bValid =true;
			}catch(NumberFormatException e2) {
				JOptionPane.showMessageDialog(CalcDialog.this, "정수가 아닌 키가 있습니다", "오류", JOptionPane.ERROR_MESSAGE);
				return;
			}
			CalcDialog.this.setVisible(false);
		}
	}
	
	public boolean isValid() {
		return bValid;
	}
}
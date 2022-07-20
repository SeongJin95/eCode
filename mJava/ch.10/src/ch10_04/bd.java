package ch10_04;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JPanel panel;
	MyListener listener = new MyListener();
	Random rand = new Random();
	private int r,g,b;
	Color c = new Color(r,g,b);
	
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("이벤트 예제");
		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("핑크색");
		button2.addActionListener(listener);
		panel.add(button2);
		button3 = new JButton("빨간색");
		button3.addActionListener(listener);
		panel.add(button3);
		button4 = new JButton("녹색");
		button4.addActionListener(listener);
		panel.add(button4);
		button5 = new JButton("랜덤");
		button5.addActionListener(listener);
		panel.add(button5);
		
		add(panel);
		setVisible(true);
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			r=rand.nextInt(255);
			g=rand.nextInt(255);
			b=rand.nextInt(255);
			if(e.getSource()==button1) {
				panel.setBackground(Color.yellow);
			}else if(e.getSource()==button2) {
				panel.setBackground(Color.pink);
			}else if(e.getSource()==button3) {
				panel.setBackground(Color.red);
			}else if(e.getSource()==button4) {
				panel.setBackground(Color.green);
			}else if(e.getSource()==button5) {
				panel.setBackground(new Color(r,g,b));
			}
		}
	}
	
}


public class bd {

	public static void main(String[] args) {
		new MyFrame();
	}

}

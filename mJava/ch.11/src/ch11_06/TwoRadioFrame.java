package ch11_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoRadioFrame extends JFrame{	
	JRadioButton red = new JRadioButton("RED");
	JRadioButton blue = new JRadioButton("BLUE");
	JRadioButton green = new JRadioButton("GREEN"); 
	JRadioButton yellow = new JRadioButton("YELLOW");//이미지 라디오 버튼
	public TwoRadioFrame() {		
		super("Two Radio Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		ButtonGroup g = new ButtonGroup();
		g.add(red);
		g.add(blue);
		g.add(green);
		g.add(yellow);
		
		add(red);
		add(blue);
		add(green);
		add(yellow);
		
		MyItemListener listener = new MyItemListener();
		red.addItemListener(listener);
		blue.addItemListener(listener);
		green.addItemListener(listener);
		yellow.addItemListener(listener);
		
		setSize(300,200);
		setVisible(true);
	}		
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() != ItemEvent.SELECTED)
				return;
			if(e.getItem() == red) {
				getContentPane().setBackground(Color.RED);
			}else if(e.getItem() == blue) {
				getContentPane().setBackground(Color.BLUE);
			}else if(e.getItem() == green) {
				getContentPane().setBackground(Color.green);
			}else if(e.getItem() == yellow) {
				getContentPane().setBackground(Color.yellow);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new TwoRadioFrame();
	}
}

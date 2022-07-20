package Practice;

import java.awt.*;
import javax.swing.*;

public class RandomLabel extends JFrame{
	public RandomLabel() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		c.setLayout(null);
						
		for(int i=0;i<20;i++) {
			JLabel l = new JLabel();
			l.setBackground(Color.blue);
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;	
			l.setLocation(x,y);			
			l.setSize(10,10);
			l.setOpaque(true);
			c.add(l);
		}
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		RandomLabel r = new RandomLabel();
	}

}

package Exercise;

import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame{
	public MyFrame3(){
		Container c = getContentPane();
		c.setLayout(null);		
		JButton b = new JButton("click");
		b.setSize(100,30);
		b.setLocation(50, 70);
		c.add(b);
		
				
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]){
		MyFrame3 frame = new MyFrame3();
	}
}	

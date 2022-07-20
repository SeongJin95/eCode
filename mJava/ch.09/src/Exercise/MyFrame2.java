package Exercise;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{
	public MyFrame2(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.yellow);
		c.add(new JButton("click"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]){
		MyFrame2 frame = new MyFrame2();
	}
}	
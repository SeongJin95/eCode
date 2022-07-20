package Practice;

import java.awt.*;
import javax.swing.*;

public class RandomLabel2 extends JFrame{
	public RandomLabel2() {
		setTitle("여러개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
				
		c.add(new aPanel1(),BorderLayout.NORTH);				
		c.add(new aPanel2(),BorderLayout.CENTER);
		c.add(new aPanel3(),BorderLayout.SOUTH);
				
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RandomLabel2();
	}

}

class aPanel1 extends JPanel{
	aPanel1(){
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
/*
class NorthPanel extends JPanel{
	NorthPanel(){
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
*/



class aPanel2 extends JPanel{
	aPanel2(){
		setLayout(null);
		//setBackground(new Color(0,0,0,0));
		setBackground(Color.white);
		for(int i=0;i<10;i++) {	
			JLabel l = new JLabel("*");
			l.setForeground(Color.red);
			l.setBackground(Color.white);
			l.setSize(40,40);
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;	
			l.setLocation(x,y);				
			//l.setOpaque(true);
			add(l);
		}
	}
}

/*
class CenterPanel extends JPanel{
	CenterPanel(){
		setLayout(null);
		setBackground(Color.white);
		
		for(int i=0;i<10;i++) {
			JLabel l = new JLabel("*");	
			l.setSize(40,40);		
			l.setForeground(Color.red);
			int x = (int)(Math.random()*250)+10;
			int y = (int)(Math.random()*200)+10;	
			l.setLocation(x,y);			
			
			l.setOpaque(true);
			add(l);
		}
	}
}
*/


class aPanel3 extends JPanel{
	aPanel3(){
		setLayout(new FlowLayout());
		setBackground(Color.yellow);
		add(new JButton("Word Input"));
		add(new JTextField("",20));
	}
}
/*
 SouthPanel{
	SouthPanel(){
		setBackground(Color.yellow);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Word Input"));
		add(new JTextField("",15));
	}
}
*/


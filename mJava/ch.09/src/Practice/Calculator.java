package Practice;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	public Calculator() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		Panel1 panel1 = new Panel1();	
		c.add(panel1,BorderLayout.NORTH);
		
		Panel2 panel2 = new Panel2();	
		c.add(panel2,BorderLayout.CENTER);
		
		Panel3 panel3 = new Panel3();
		c.add(panel3,BorderLayout.SOUTH);
		
		setSize(350,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

}

class Panel1 extends JPanel{
	Panel1(){
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(" ",20));	
	}
}

class Panel2 extends JPanel{
	Panel2(){
		setLayout(new GridLayout(4,4,5,5));
		JButton btn[]=new JButton[16];
		String name[]= {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","x","/"};
		for(int i=0;i<16;i++) {
			btn[i]=new JButton(name[i]);
			if(i>=12) {
				btn[i].setBackground(Color.cyan);
			}
			add(btn[i]);
		}
	}
}

class Panel3 extends JPanel{
	Panel3(){
		setLayout(new FlowLayout());
		setBackground(Color.yellow);
		add(new JLabel("계산 결과"));
		add(new JTextField("",20));
	}
}

/*
public Calculator() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		
		c.add(new SouthPanel(),BorderLayout.SOUTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);.
		c.add(new NorthPanel(),BorderLayout.NORTH);
		
		setSize(350,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

}

class Panel1 extends JPanel{
	Panel1(){
		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(" ",20));	
	}
}

class Panel2 extends JPanel{
	Panel2(){
		setLayout(new GridLayout(4,4,5,5));
		JButton btn[]=new JButton[16];
		String name[]= {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","x","/"};
		for(int i=0;i<16;i++) {
			btn[i]=new JButton(name[i]);
			if(i>=12) {
				btn[i].setBackground(Color.cyan);
			}
			add(btn[i]);
		}
	}
}

class Panel3 extends JPanel{
	Panel3(){
		setLayout(new FlowLayout());
		setBackground(Color.yellow);
		add(new JLabel("계산 결과"));
		add(new JTextField("",20));
	}
}

class CenterPanel extends JPanel{
	JButton b[] = {new JButton("+"),new JButton("-"), new JButton("x"), new JButton("/")};
	public CenterPanel(){
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4,4,5,5));
		for(int i=0;i<10;i++){
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		
		for(int i=0;i<b.length;i++){
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
	}
}

class NorthPanel extends JPanel {
	public NorthPanel(){
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JLabel("수식입력");
		add(new JTextField(16));
		
	}
}
*
*/
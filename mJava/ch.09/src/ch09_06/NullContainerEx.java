package ch09_06;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		//JLabel 컴포넌트 생성하고 위치과 크기를 직접 지정한다.
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); //la를 (130,50) 위치로 지정
		la.setSize(200,20);//la를 200x20크기로 지정
		c.add(la);
		
		//9개의 버튼 컴포넌트를 생성하고 모두 동일한 크기로 설정한다.
		//위치는 서로 다르게 설정
		for(int i=1;i<=9;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
		
		setSize(300,200);		
		setVisible(true);
	}
	public static void main(String[] args) {
		NullContainerEx f = new NullContainerEx();
	}

}

package Practice;

import java.awt.*;
import javax.swing.*;
import java.util.Random;





public class MyGridLayoutColor2 extends JFrame{
	
	public MyGridLayoutColor2() {
		
		Random rand = new Random();
		
		setTitle("TenColor Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1*10 격자의 GridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(4, 4);
		
		Container c = getContentPane();
		c.setLayout(grid);	//grid를 컨텐트팬의 배치관리자로 지정
		for(int i=0;i<16;i++) {
			JLabel b = new JLabel(Integer.toString(i));
			Color color = new Color(rand.nextInt(0xFFFFFF));
			b.setBackground(color);
			b.setOpaque(true);
			c.add(b);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyGridLayoutColor2 f = new MyGridLayoutColor2();
	}

}

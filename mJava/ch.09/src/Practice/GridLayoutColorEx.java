package Practice;

import javax.swing.*;
import java.awt.*;



public class GridLayoutColorEx extends JFrame{
	
	public GridLayoutColorEx() {
		Color color[] = {Color.red,Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, 
				Color.magenta, Color.gray, Color.pink, Color.LIGHT_GRAY};
		
		setTitle("TenColor Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1*10 격자의 GridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(1, 10);
		
		Container c = getContentPane();
		c.setLayout(grid);	//grid를 컨텐트팬의 배치관리자로 지정
		for(int i=0;i<10;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setBackground(color[i]);
			c.add(b);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		GridLayoutColorEx f = new GridLayoutColorEx();
	}

}


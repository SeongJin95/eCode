package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TenLabelClick extends JFrame {
	private JLabel j[] = new JLabel[10];
	int count = 0;
	public TenLabelClick() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setSize(500,500);	
		
		for(int i=0;i<j.length;i++) {
			j[i] = new JLabel(Integer.toString(i));
			j[i].setSize(15,15);
			j[i].setFont(new Font("Gothic", Font.PLAIN, 15));
			int x = (int)(Math.random()*(c.getWidth()-j[i].getWidth()));
			int y = (int)(Math.random()*(c.getHeight()-j[i].getHeight()));
			j[i].setLocation(x,y);
			j[i].setOpaque(true);
			j[i].setForeground(Color.MAGENTA);
			
			j[i].addMouseListener(new MyMouseListener());
			c.add(j[i]);
		}
		
		System.out.println(c.getWidth() + " "+ j[0].getWidth());
		
		
		setSize(500,500);	
		setVisible(true);
	}	
	
	
	
	public static void main(String[] args) {
		new TenLabelClick();
	}
	
	class MyMouseListener implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel j = (JLabel)e.getSource();
			if(count == Integer.parseInt(j.getText())) {
				count++;
				if(count == 10) {
					count = 0;
					new TenLabelClick();
				}
				else
					j.setVisible(false);
			}
				
			
				
		}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		
	}

}

/*
public class TenLabelsFrame extends JFrame{
	private JLabel[] gameLabels = new JLabel[10];
	private int nextPressed = 0;
	public TenLabelsFrame(){
		super("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		setSize(500, 500);
		setVisible(true);
		
		for(int i=0;i<gameLabels.length;i++){
			gameLabels[i] = new JLabel(Integet.toString(i));
			gameLabels[i].setFont(new Font("Gothic", Font.PLAIN, 15);
			gameLabels[i].setForeground(Color.MAGENTA);
			c.add(gameLabels[i];
			
			gameLabels[i].addMouseListener(new MouseAdapter(){
				@Override
				public void mousePressed(MouseEvent e){
					JLabel la = (JLabel)e.getSource();
					if(Integer.parseInt(la.getText() == nextPressed){
						nextpressed++;
						if(nextPressed == 10){
							nextPressed = 0;
							configure();
						}else
							la.setVisible(false);
						
					}
				}			
			}
		}
		
		private void configure(){
			Container c = getContentPane();
			for(int i=0;i<gameLabels.length;i++){
				//크기를 먼저 지정하여야 뒤에서 getWidth(),getHeight의 값이 정확해짐
				gameLabels[i].setSize(15,15);
				int xBound = c.getWidth() - gameLabels[i].getWidth();
				int yBound = c.getHeight() - gameLabels[i].getHeight();
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);
				gameLabels[i].setLocation(x,y);
				gameLabels[i].setVisible(true);					
			}			
		}
		
		public static void main(String[] args) {
			new TenLabelsFrame();
		}
		
}
*/


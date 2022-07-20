package OpenChallenge14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Coffeem extends JFrame {	
	MainPanel panel = new MainPanel();
	public Coffeem() {
		setTitle("Open Challenge 14");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		panel.setOpaque(true);
		c.add(new TitlePanel(), BorderLayout.NORTH);
		c.add(panel, BorderLayout.CENTER);
		c.add(new MenuPanel(), BorderLayout.SOUTH);
		setSize(480,400);
		setVisible(true);
		
	}	
	
	public static void main(String [] args) {
		new Coffeem();
	}
	
	class TitlePanel extends JPanel{
		public TitlePanel() {
			JLabel label = new JLabel("Welcome, Hot Coffee!!");
			setBackground(Color.MAGENTA);
			add(label);
		}	
	}
	
	class MainPanel extends JPanel{
		int cup=10, coffee=10, water = 10, sugar = 10, cream = 10;
		final int CUP = 0, COFFEE = 1, WATER = 2, SUGAR = 3, CREAM = 4;
		private final int barSize = 10;
		JLabel label[] = new JLabel[5];
		JLabel stock[] = new JLabel[5];
		JLabel stockname[] = new JLabel[5];
		String name[] = new String[]{ "Cup", "Coffee", "Water", "Sugar", "Cream" };
		JLabel cof = new JLabel(new ImageIcon("images/coffee.jpg"));
		public MainPanel() {
			setLayout(null);
			for(int i=0;i<label.length;i++) {
				stock[i] = new JLabel();
				stock[i].setSize(50,100);	
				stock[i].setLocation(50+i*80,10);
				add(stock[i]);
				stockname[i] = new JLabel(name[i]);
				stockname[i].setSize(50,10);
				stockname[i].setHorizontalAlignment(JLabel.CENTER);
				stockname[i].setLocation(50+i*80,130);
				add(stockname[i]);
			}
			cof.setLocation(180, 170);
			cof.setSize(100,100);
			cof.setVisible(false);
			add(cof);
		}		
		/*
		class stock extends JLabel{
			private final int MAXSIZE = 10; // 통 크기
			private int currentSize; // 현재 통에 들어 있는 재료의 양
			
			public stock() {
				currentSize = MAXSIZE; // 초기에는 통에 재료가 가득채워져 있도록 설정				
			}
			
			boolean consume() { // 재료를 하나 소비한다.
				if(currentSize > 0) {
					currentSize--;
					return true;
				}
				else
					return false;
			}
			
			void reset() { // 통을 초기 상태의 양으로 설정한다. 
				currentSize = MAXSIZE; 
			}				
		
			boolean isEmpty() { return currentSize == 0; }
			
			// 통에 남아 있는 재료의 양을 보여주기 위해 작성됨
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				// LIGHT_GRAY 색으로 남아 있는 양을 보여 주기위해 그린다.
				g.setColor(Color.LIGHT_GRAY);
				int y = this.getHeight() - (currentSize*this.getHeight() / MAXSIZE);
				g.fillRect(0, y, this.getWidth(), this.getHeight() - y);
				
				// GRAY 색으로 통의 외곽선을 그린다.			
				g.setColor(Color.GRAY);
				g.drawRect(0, 0, this.getWidth()-1, this.getHeight()-1);			
			}
		}
		*/
		public int st(int n) {
			if(n==0)
				return cup;
			else if(n==1)
				return coffee;
			else if(n==2)
				return water;
			else if(n==3)
				return sugar;
			else 
				return cream;
		}
		
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i=0;i<stock.length;i++) {
				int height = (int)((barSize-st(i))*10);
				g.setColor(Color.LIGHT_GRAY);
				g.fillRect(stock[i].getX(),  stock[i].getY() + height, stock[i].getWidth(), st(i)*10);
				g.setColor(Color.GRAY);
				g.drawRect(stock[i].getX(), stock[i].getY(), stock[i].getWidth()-1, stock[i].getHeight()-1);
			}
		}
		
		
		
		public void opreate(String s) {
			if(s.equals("Black Coffee")) {
				if(cup == 0 || coffee == 0 || water == 0) {
				}else {
					cup--;
					coffee--;
					water--;
					cof.setVisible(true);
					repaint();
					JOptionPane.showMessageDialog(null, "뜨거워요 즐거운 하루~~", "커피나왔습니다", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else if(s.equals("Sugar Coffee")) {
				if(cup == 0 || coffee == 0 || water == 0 || sugar == 0) {
					JOptionPane.showMessageDialog(null, "부족한 것이 있습니다. 채워주세요.", "커피 자판기 경고", JOptionPane.ERROR_MESSAGE);
				}	else {
					cup--;
					coffee--;
					water--;
					sugar--;
					cof.setVisible(true);
					repaint();
					JOptionPane.showMessageDialog(null, "뜨거워요 즐거운 하루~~", "커피나왔습니다", JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(s.equals("Dabang Coffee")) {
				if(cup == 0 || coffee == 0 || water == 0 || sugar == 0 || cream == 0) {
					JOptionPane.showMessageDialog(null, "부족한 것이 있습니다. 채워주세요.", "커피 자판기 경고", JOptionPane.ERROR_MESSAGE);
				}else {
					cup--;
					coffee--;
					water--;
					sugar--;
					cream--;
					cof.setVisible(true);
					repaint();
					JOptionPane.showMessageDialog(null, "뜨거워요 즐거운 하루~~", "커피나왔습니다", JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(s.equals("Reset")) {
				cup=10;
				coffee=10;
				water=10;
				sugar=10;
				cream=10;
				cof.setVisible(false);
				repaint();
			}
		}
	}
	
	class MenuPanel extends JPanel{
		private JButton btn[] = new JButton[4];
		private String menu[] = {"Black Coffee", "Sugar Coffee", "Dabang Coffee", "Reset"};		
		
		public MenuPanel() {
			setLayout(new FlowLayout());
			for(int i=0;i<btn.length;i++) {
				btn[i] = new JButton(menu[i]);
				add(btn[i]);
				btn[i].addActionListener(new ActionListener() {	
					@Override
					public void actionPerformed(ActionEvent e) {						
						JButton b = (JButton)e.getSource();
						panel.opreate(b.getText());
					}
				});
			}
		}
	}
}

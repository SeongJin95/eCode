package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gamble extends JFrame {
	private JLabel la1 = new JLabel("0");
	private JLabel la2 = new JLabel("0");
	private JLabel la3 = new JLabel("0");
	private JLabel la4 = new JLabel("시작합니다.");
	
	Font myFont = new Font("Serif", Font.BOLD, 30);
	
	public Gamble() {
		setTitle("Open Challenge 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		
		c.setLayout(null);	//컨텐트팬의 배치관리자 삭제
		la1.setFont(myFont);
		la1.setHorizontalAlignment(JLabel.CENTER);
		la1.setSize(50, 25);	//레이블의 크기 50x20설정
		la1.setLocation(55, 30);//레이블의 위치 (30,30)으로 설정
		la1.setBackground(Color.magenta);
		la1.setOpaque(true);
		c.add(la1);
		
		la2.setFont(myFont);
		la2.setHorizontalAlignment(JLabel.CENTER);
		la2.setSize(50, 25);	//레이블의 크기 50x20설정
		la2.setLocation(125, 30);//레이블의 위치 (30,30)으로 설정
		la2.setBackground(Color.magenta);
		la2.setOpaque(true);
		c.add(la2);
		
		la3.setFont(myFont);
		la3.setHorizontalAlignment(JLabel.CENTER);
		la3.setSize(50, 25);	//레이블의 크기 50x20설정
		la3.setLocation(195, 30);//레이블의 위치 (30,30)으로 설정
		la3.setBackground(Color.magenta);
		la3.setOpaque(true);
		c.add(la3);
		
		la4.setHorizontalAlignment(JLabel.CENTER);
		la4.setSize(100, 25);	//레이블의 크기 50x20설정
		la4.setLocation(100, 100);//레이블의 위치 (30,30)으로 설정
		c.add(la4);
		
		
		setSize(300,200);
		setVisible(true);
		
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
		
		/*
		 super("Open Challenge 10");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 setContentPane(new GamePanel());
		 
		 setSize(300,200);
		 setVisible(true);
		 
		 getContentPane().setFocusable(true);
		 getContentPane().requestFocus();
		 */
	}
	/*
	 class GamePanel extends JPanel{
	 	private JLabel []label = new JLabel[3];
	 	private JLabel result = new JLabel("시작합니다.");
	 
	 	public GamePanel(){
	 		setLayout(null);
	 	
	 		for(int i=0;i<label.length;i++){
		 		label[i] = new JLabel("0");
		 		label[i].setSize(60,30);
		 		label[i].setLocation(30+80*i,50);
		 		label[i].setHorizontalAlignment(JLabel.CENTER);
		 		label[i].setOpaque(true);
		 		label[i].setBackground(Color.MAGENTA);
		 		label[i].setForeground(Color.yellow);
		 		label[i].setFont(new Font("Tahoma", Font.ITALIC,30));
		 		add(label[i]);
	 		}
	 		result.setSize(200,20);
	 		result.setLocation(100,120);
	 		add(result);
	 		
	 		addKeyListener(new KeyAdapter(){
	 			@Override
	 			public void keyPressed(KeyEvent e){
	 				if(e.getKeyChar() == '\n') {
	 					int x1 = (int)(Math.random()*5);
	 					label[0].setText(Integer.toString(x1));
	 					int x2 = (int)(Math.random()*5);
	 					label[1].setText(Integer.toString(x2));
	 					int x3 = (int)(Math.random()*5);
	 					label[2].setText(Integer.toString(x3));
	 					
	 					if(x1==x2 && x1==x3)
	 						result.setText("100억 당첨 축하합니다!");
	 					else
	 						result.setText("아쉽군요");
	 				}
	 			}
	 		});
	 		
	 	}
	 	
	 	
	 
	 }
	 
	  */

	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			//la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
			la4.setText(e.getKeyCode() + "키가 입력되었음");
			
			if(e.getKeyCode() == 10) {
				int r1 = (int)(Math.random()*5);
				int r2 = (int)(Math.random()*5);
				int r3 = (int)(Math.random()*5);
				la1.setText(Integer.toString(r1));
				la2.setText(Integer.toString(r2));
				la3.setText(Integer.toString(r3));
				
				if(r1==r2 && r1==r3) {
					la4.setText("축하합니다!!");
				}else
					la4.setText("아쉽군요");
				
			}
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTypeed(KeyEvent e) {}
	}
	
	public static void main(String[] args) {
		new Gamble();
	}

}

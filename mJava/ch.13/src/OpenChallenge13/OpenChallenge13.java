package OpenChallenge13;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class OpenChallenge13 extends JFrame{
	/*int x,y;
	int x2,y2;
	private MyAbata a; 
	public OpenChallenge13() {
		super("Open Challenge 13");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setSize(350, 300);
		JLabel la = new JLabel("@");
		la.setForeground(Color.RED);
		Random r = new Random();
		x = (int)(Math.random()*(c.getWidth()-15));
		y = (int)(Math.random()*(c.getHeight()-15));
		la.setSize(15,15);
		la.setLocation(x,y);
		c.add(la);
		c.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					System.out.println(x + "up" + y);
					if(y-10<=0)
						y = 0;
					else 
						y -= 10;
					la.setLocation(x, y);
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					System.out.println(x + "up" + y);
					if(y+15>=c.getHeight()-10)
						y = c.getHeight()-15;
					else 
						y += 10;
					la.setLocation(x, y);
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					System.out.println(x + "up" + y);
					if(x-10<=0)
						x = 0;
					else 
						x -= 10;
					la.setLocation(x, y);
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					System.out.println(x + "up" + y);
					if(x+15>=c.getWidth()-10)
						x = c.getWidth()-15;
					else 
						x += 10;
					la.setLocation(x, y);
				}else if(e.getKeyCode() == KeyEvent.VK_Q) 	
					System.exit(3);
			}
		});	
		
				
		JLabel la2 = new JLabel("M");
		x2 = (int)(Math.random()*(c.getWidth()-15));
		y2 = (int)(Math.random()*(c.getHeight()-15));
		la2.setSize(15,15);
		la2.setLocation(x2,y2);
		
		
		c.add(la2);
		c.setFocusable(true);
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
		setSize(350, 300);
		setVisible(true);
	}*/
	private JPanel gamePanel = new GamePanel("@","M",'q',200);
	
	public OpenChallenge13() {
		setTitle("Open Challenge 13");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(gamePanel);
		
		setSize(300,300);
		setVisible(true);
		
		gamePanel.setFocusable(true);
		gamePanel.requestFocus();
	}
	
	class GamePanel extends JPanel{
		private String avatarChar;
		private String monsterChar;
		private char quitChar;
		private long monsterDelay;
		private JLabel avatar;
		private JLabel monster;
		final int AVATAR_MOVE = 10;
		
		public GamePanel(String avatarChar, String monsterChar, char quitChar, long monsterDelay) {
			this.avatarChar = avatarChar;
			this.monsterChar = monsterChar;
			this.quitChar = quitChar;
			this.monsterDelay = monsterDelay;
			
			avatar = new JLabel(avatarChar);
			monster = new JLabel(monsterChar);
			
			setLayout(null);
			addKeyListener(new MyKeyListener());
			
			avatar.setLocation(50,50);
			avatar.setSize(15,15);
			avatar.setForeground(Color.RED);
			add(avatar);
			
			monster.setLocation(200,5);
			monster.setSize(15,15);
			add(monster);
			
			MonsterThread th = new MonsterThread(monster, avatar, monsterDelay);
			th.start();
			
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					JPanel panel = (JPanel)e.getSource();
					panel.requestFocus();
				}
			});
		}
		
		class MyKeyListener extends KeyAdapter{
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == quitChar)
					System.exit(0);
				int keyCode = e.getKeyCode();
				
				switch(keyCode) {
				case KeyEvent.VK_UP:
					avatar.setLocation(avatar.getX(),avatar.getY()-AVATAR_MOVE);
					break;
				case KeyEvent.VK_DOWN:
					avatar.setLocation(avatar.getX(),avatar.getY()+AVATAR_MOVE);
					break;
				case KeyEvent.VK_LEFT:
					avatar.setLocation(avatar.getX()-AVATAR_MOVE,avatar.getY());
					break;
				case KeyEvent.VK_RIGHT:
					avatar.setLocation(avatar.getX()+AVATAR_MOVE,avatar.getY());
					break;
				}
				avatar.getParent().repaint();
			}
		}
	}
	class MonsterThread extends Thread {
		private JLabel from; // 좇아가는 레이블. 괴물 레이블
		private JLabel to; // 도망가는 레이블. 아바타 레이블
		private long monsterDelay;
		private final int MONSTER_MOVE = 5; // from 레이블이 한번에 이동하는 거리
		
		public MonsterThread(JLabel from, JLabel to, long monsterDelay) {
			this.from = from;
			this.to = to;
			this.monsterDelay = monsterDelay;
		}
		
		@Override
		public void run() {
			int x=from.getX(),y=from.getY(); // 현재 괴물의 위치
			
			while(true) {
				if(to.getX() < from.getX()) // 아바타가 괴물의 왼쪽이 있는 경우 
					x = from.getX() - MONSTER_MOVE;
				else 						// 아바타가 괴물의 오른쪽이 있는 경우
					x = from.getX() + MONSTER_MOVE;
				
				if(to.getY() < from.getY()) // 아바타가 괴물의 위쪽이 있는 경우
					y = from.getY() - MONSTER_MOVE;
				else 						// 아바타가 괴물의 아래쪽이 있는 경우
					y = from.getY() + MONSTER_MOVE;			
				
				// 괴물의 위치 수정
				from.setLocation(x, y);
				
				// 괴물의 위치가 변경되었기 때문에 괴물을 포함하는 패널을 다시 그리도록 함
				from.getParent().repaint();
				
				// 200ms 동안 잠을 잔다.
				try {
					sleep(monsterDelay);
				}catch(InterruptedException e) {
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new OpenChallenge13();
	}
}



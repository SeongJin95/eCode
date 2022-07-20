package ch10_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame{
	private JLabel []keyMessage;//3개의 메시지를 출력할 레이블 컴포넌트 배열
	public KeyListenerEx() {
		super("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		//레이블 배열을 3개 생성하고 각 레이블 컴포넌트 생성
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getKeyCode ");
		keyMessage[1] = new JLabel(" getKeyCode ");
		keyMessage[2] = new JLabel(" getKeyCode ");
		
		//3개의 레이블 컴포넌트를 컨텐트팬에 부착
		for(int i=0;i<keyMessage.length;i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.yellow);
		}
		
		setSize(300,150);
		setVisible(true);
		
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed");
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}
		public void keyTypeed(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
	

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}

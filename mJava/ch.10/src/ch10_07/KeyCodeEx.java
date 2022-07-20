package ch10_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame{
	private JLabel la = new JLabel();//3개의 메시지를 출력할 레이블 컴포넌트 배열
	public KeyCodeEx() {
		super("Key Code 예제 : F1키:초록색, %키: 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		//컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			//la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력되었음");
			
			if(e.getKeyCode() == KeyEvent.VK_F1) {
				contentPane.setBackground(Color.GREEN);
			}else if(e.getKeyChar() == '%') {
				contentPane.setBackground(Color.yellow);
			}else if(e.getKeyCode() == KeyEvent.VK_F2) {
				contentPane.setBackground(Color.red);
			}
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTypeed(KeyEvent e) {}
	}
	

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}

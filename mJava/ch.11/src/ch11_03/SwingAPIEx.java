package ch11_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAPIEx extends JFrame{
	JButton b1, b2, b3, b4;
	
	public SwingAPIEx() {
		setTitle("Swing 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		//위치와 크기 정보 버튼 생성
		b1 = new JButton("위치와 크기 정보");
		b1.addActionListener(new MyButtonListener());
		add(b1);
		
		//모양 정보 버튼 생성
		b2 = new JButton("모양 정보");
		b2.setOpaque(true);
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("고딕체", Font.ITALIC, 20));
		b2.addActionListener(new MyButtonListener());
		add(b2);
		
		//작동하지 않는 버튼 생성
		b3 = new JButton("작동하지 않는 버튼");
		b3.setEnabled(false);
		b3.addActionListener(new MyButtonListener());
		add(b3);
		//숨기기/보이기 토글 버튼 생성
		b4 = new JButton("숨기기/보이기");
		b4.addActionListener(new MyButtonListener());
		add(b4);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//선택된 버튼의 주소 알아내기
			Object source = e.getSource();
			if(source == b1) {
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치= (" + b1.getX() + "," + b1.getY() + ")");
				System.out.println("크기= (" + b1.getWidth() + "," + b1.getHeight() + ")");
				
				 //부모 컨테이너의 주소를 알아낸다.
				JPanel c = (JPanel)b2.getParent();
				System.out.println("컨텐트팬의 위치와 크기");
				System.out.println("위치= (" + c.getX() + "," + c.getY() + ")");
				System.out.println("크기= (" + c.getWidth() + "," + c.getHeight() + ")");
			}else if(source == b2) {
				System.out.println("폰트 = " + b2.getFont());
				System.out.println("배경색 = " + b2.getBackground());
				System.out.println("배경색 = " + b2.getForeground());
			}else {//숨기기/보이기 버튼이 선택된 경우
					//현재 다른 버튼이 보이는 상태이면 모두 안보이게 처리
				if(b1.isVisible()) {
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				}else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
				
					
			}
		}
	}
		
	
	public static void main(String[] args) {
		new SwingAPIEx();
	}
}

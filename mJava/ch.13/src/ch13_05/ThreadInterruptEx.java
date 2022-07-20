package ch13_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;//타이머 값이 출력될 레이블
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; //초 카운트를 출력할 레이블
	}
	
	//스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		int n = 0;//타이머값
		while(true) {//무한루프
			timerLabel.setText(Integer.toString(n));//레이블에 타이머값 출력
			n++;
			try {
				Thread.sleep(1000);//1초동안 잠을잔다
			}
			catch(InterruptedException e) {
				return ;//예외 발생시 스레드 종료
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame{
	public ThreadInterruptEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);//레이블을 컨텐트 팬에 부착
		
		
		
		//타이머 값을 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		JButton b = new JButton("kill Timer");
		c.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b1 = (JButton)e.getSource();
				b1.setEnabled(false);
				th.interrupt();
			}
		});
		
		setSize(300,170);
		setVisible(true);
		
		th.start();		
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}

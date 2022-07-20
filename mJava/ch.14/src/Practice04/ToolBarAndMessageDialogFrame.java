package Practice04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolBarAndMessageDialogFrame extends JFrame{
	private Container c;
	
	public ToolBarAndMessageDialogFrame() {
		setTitle("툴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar();
		JButton b = new JButton("학번");
		toolBar.add(b);		
		JTextField ta = new JTextField();
		toolBar.add(ta);
		c.add(toolBar, BorderLayout.SOUTH);
		ta.addKeyListener(new inputKeyActionListener());
	}
	
	class inputKeyActionListener extends KeyAdapter{
		@Override
		public void keyTyped(KeyEvent e) {
			if(e.getKeyChar() < '0' || e.getKeyChar() > '9')
				JOptionPane.showMessageDialog(null, e.getKeyChar() + "는 숫자가 아닙니다. \n숫자를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
		}	
		/*
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() < '0' || e.getKeyChar() > '9')
				JOptionPane.showMessageDialog(null, e.getKeyChar() + "는 숫자가 아닙니다. \n숫자를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
		}	*/	
	}

	public static void main(String[] args) {
		ToolBarAndMessageDialogFrame frame = new ToolBarAndMessageDialogFrame();
	}

}
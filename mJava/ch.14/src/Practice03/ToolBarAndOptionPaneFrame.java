package Practice03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolBarAndOptionPaneFrame extends JFrame{
	private Container c;
	
	public ToolBarAndOptionPaneFrame() {
		setTitle("툴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar();
		JButton b = new JButton("종료");
		toolBar.add(b);		
		c.add(toolBar, BorderLayout.NORTH);
		b.addActionListener(new CloseActionListener());	
	}
	
	class CloseActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int result = JOptionPane.showConfirmDialog(null,"정말 종료하시겠습니까?", "", JOptionPane.YES_NO_OPTION);
			if(result == JOptionPane.CLOSED_OPTION)
				return;			
			else if(result == JOptionPane.YES_OPTION)
				System.exit(0);
			else if(result == JOptionPane.NO_OPTION)
				return;
		}		
	}

	public static void main(String[] args) {
		ToolBarAndOptionPaneFrame frame = new ToolBarAndOptionPaneFrame();
	}

}
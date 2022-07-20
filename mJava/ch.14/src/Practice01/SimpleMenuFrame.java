package Practice01;

import javax.swing.*;
/*
public class SimpleMenuFrame extends JFrame{
	public SimpleMenuFrame() {
		setTitle("메뉴 만들기");
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("파일"));
		mb.add(new JMenu("편집"));
		JMenu se = new JMenu("보기");
		
		se.add(new JMenuItem("화면확대"));
		se.add(new JMenuItem("쪽윤곽"));
		
		mb.add(se);
		mb.add(new JMenu("입력"));
		
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new SimpleMenuFrame();
	}

}*/

public class SimpleMenuFrame extends JFrame{
	public SimpleMenuFrame() {
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		setSize(300,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenu fileMenu = new JMenu("파일");
		JMenu editMenu = new JMenu("편집");
		JMenu viewMenu = new JMenu("보기");				
		JMenu writeMenu = new JMenu("입력");
		
		JMenuBar mb = new JMenuBar();
		mb.add(fileMenu);
		mb.add(editMenu);
		viewMenu.add(new JMenuItem("화면확대"));
		viewMenu.add(new JMenuItem("쪽윤곽"));
		mb.add(viewMenu);		
		mb.add(writeMenu);
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new SimpleMenuFrame();
	}

}

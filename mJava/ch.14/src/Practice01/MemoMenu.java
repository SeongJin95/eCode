package Practice01;

import javax.swing.*;

public class MemoMenu extends JFrame{
	String[] fileMenuItem = {"새로만들기(N)","열기(O)", "저장(S)", "다른 이름으로 저장(A)", "페이지 설정(T)", "인쇄(P)", "끝내기(X)"};
	String[] editMenuItem = {"잘라내기(X)","페이지 설정(T)", "인쇄(P)", "복사(C)", "붙여넣기(V)", "삭제(L)", "찾기(F)", "바꾸기(R)", "모두선택(A)"};
	String[] formMenuItem = {"자동줄바꿈(W)","글꼴(F)"};
	String[] seeMenuItem = {"화면확대/축소하기","상태표시줄(S)"};
	String[] helpMenuItem = {"도움말 보기(H)","피드백 보내기(F)", "메모장 정보(A)"};
	public MemoMenu() {		
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		createMenu();
		setSize(500,300);
		setVisible(true);
	}
	
	private void createMenu() {		
		JMenuBar mb = new JMenuBar();
		
		JMenu fileMenu = new JMenu("파일(F)");
		JMenu editMenu = new JMenu("편집(E)");
		JMenu formMenu = new JMenu("서식(O)");
		JMenu seeMenu = new JMenu("보기(V)");				
		JMenu helpMenu = new JMenu("도움말(H)");
		
		for(int i=0;i<fileMenuItem.length;i++) {
			if(i==4||i==6)
				fileMenu.addSeparator();
			fileMenu.add(new JMenuItem(fileMenuItem[i]));
		}
		
		for(int i=0;i<editMenuItem.length;i++) {
			if(i==4||i==6)
				editMenu.addSeparator();
			editMenu.add(new JMenuItem(editMenuItem[i]));
		}
		
		for(int i=0;i<formMenuItem.length;i++) {
			if(i==4||i==6)
				formMenu.addSeparator();
			formMenu.add(new JMenuItem(formMenuItem[i]));
		}
		
		for(int i=0;i<seeMenuItem.length;i++) {
			if(i==4||i==6)
				seeMenu.addSeparator();
			seeMenu.add(new JMenuItem(seeMenuItem[i]));
		}
		
		for(int i=0;i<helpMenuItem.length;i++) {
			if(i==4||i==6)
				helpMenu.addSeparator();
			helpMenu.add(new JMenuItem(helpMenuItem[i]));
		}
		
		
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(formMenu);
		mb.add(seeMenu);
		mb.add(helpMenu);		
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MemoMenu();
	}

}

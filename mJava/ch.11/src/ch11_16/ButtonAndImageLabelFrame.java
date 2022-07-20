package ch11_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.event.*;

public class ButtonAndImageLabelFrame extends JFrame {
	private JLabel imageLabel; //이미지 레이블
	private ImageIcon images[] = new ImageIcon[4]; //이미지 객체 배열
	int currentId; //현재 선택된 이미지 번호(0~3).
	
	public ButtonAndImageLabelFrame() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//이미지 파일 로딩.
		//프로젝트의 image 폴더의 images0.jpg, images1.jpg, images2.jpg, images3.jpg
				
		
		for(int i=0;i<images.length;i++) {
			images[i] = new ImageIcon("images/image" + i + ".jpg");
		}
		
		currentId = 0;
		imageLabel = new JLabel(images[currentId]);
		c.add(imageLabel, BorderLayout.CENTER);
		c.add(new MenuPanel(), BorderLayout.SOUTH);
		
		setSize(300, 400);
		setVisible(true);
	}
		
		// 두 개의 화살표 버튼을 가진 메뉴 패널
		class MenuPanel extends JPanel{
			public MenuPanel() {
				setBackground(Color.GRAY);
				ImageIcon leftIcon = new ImageIcon("images/left.png");
				ImageIcon rightIcon = new ImageIcon("images/right.png");
				JButton leftBtn = new JButton(leftIcon);//왼쪽 버튼 생성
				JButton rightBtn = new JButton(rightIcon);//오른쪽 버튼 생성
				
				add(leftBtn);
				add(rightBtn);
				
				//왼쪽 화살표 버튼에 Action 리스너 달기
				leftBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						currentId--; //이미지 번호 감소 , 이전이미지
						currentId += images.length;//currentId가 음수가 될 수 있기 때문에 4를 더함
						currentId %= images.length;//4가 넘는 것을 막기 위해 이미지 개수로 나머지 구함
						imageLabel.setIcon(images[currentId]);						
					}
				});
			}
		}
	
	public static void main(String[] args) {
		new ButtonAndImageLabelFrame();
	}

}

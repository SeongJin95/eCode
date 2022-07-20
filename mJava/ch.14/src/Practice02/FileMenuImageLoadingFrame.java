package Practice02;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileFilter;

public class FileMenuImageLoadingFrame extends JFrame{
	//String filePath;
	public FileMenuImageLoadingFrame() {
		setTitle("메뉴로 배경 이미지 로딩하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		createMenu();
		setSize(400,400);
		
		setVisible(true);
	}	
	
	private void createMenu() {
		JMenu fileMenu = new JMenu("파일");
		JMenuItem openItem = new JMenuItem("열기");
		
		openItem.addActionListener(new OpenActionListener());		
		fileMenu.add(openItem);
		JMenuBar mb = new JMenuBar();
		mb.add(fileMenu);
		
		setJMenuBar(mb);		
	}
	
	class OpenActionListener implements ActionListener{
		private JFileChooser chooser;
		private MyPanel p;
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String filePath = chooser.getSelectedFile().getPath();
			ImageIcon icon = new ImageIcon(filePath);
			p = new MyPanel();
			add(p);
			p.setBgImage(icon.getImage());
		}
	}
	
	class MyPanel extends JPanel{		
		private Image bgImg = null;
		
		public void setBgImage(Image bgImg) {
			ImageIcon icon = new ImageIcon("images/img.jpg");
			this.bgImg = icon.getImage();
			repaint();
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(bgImg == null)
				return;
			g.drawImage(bgImg,0,0,this.getWidth(),this.getHeight(),this);
		}
	}	
	
	public static void main(String[] args) {
		new FileMenuImageLoadingFrame();
	}

}

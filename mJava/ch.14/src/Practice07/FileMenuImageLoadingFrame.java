package Practice07;

import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileMenuImageLoadingFrame extends JFrame{
	private JFileChooser chooser = null;
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel msgLabel = new JLabel("오디오 파일을 선택하세요");
	public FileMenuImageLoadingFrame() {
		setTitle("오디오 파일을 찾아 연주/종료 제어");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		createMenu();
		JLabel la = new JLabel("오디오 파일을 선택하세요");
		setSize(400,400);
		
		setVisible(true);
	}	
	
	private void createMenu() {
		JMenu fileMenu = new JMenu("오디오");
		JMenuItem openItem = new JMenuItem("열기");
		JMenuItem exitItem = new JMenuItem("종료");
		
		openItem.addActionListener(new OpenActionListener());		
		exitItem.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				clip.stop();
			}
		});
		fileMenu.add(openItem);
		fileMenu.add(exitItem);
		JMenuBar mb = new JMenuBar();
		mb.add(fileMenu);
		
		setJMenuBar(mb);		
	}
	
	private void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
		}catch(LineUnavailableException e) {e.printStackTrace();}
		catch(UnsupportedAudioFileException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
	}
	
	class OpenActionListener implements ActionListener{
		private JFileChooser chooser;
		public OpenActionListener() {
			chooser = new JFileChooser();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio Files(wav, au, mid, rmf)", "wav", "au", "mid", "rmf");
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String filePath = chooser.getSelectedFile().getPath();
			loadAudio(filePath);
		}
	}
	public static void main(String[] args) {
		new FileMenuImageLoadingFrame();
	}

}

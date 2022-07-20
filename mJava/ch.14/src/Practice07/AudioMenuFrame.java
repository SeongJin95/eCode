package Practice07;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import Practice07.FileMenuImageLoadingFrame.OpenActionListener;

import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class AudioMenuFrame extends JFrame{
	private JFileChooser chooser = null;
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel msgLabel = new JLabel("오디오 파일을 선택하세요");
	
	public AudioMenuFrame() {
		super("오디오 파일을 찾아 연주/종료 제어");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		msgLabel.setFont(new Font("Gothic", Font.PLAIN, 15));
		msgLabel.setHorizontalAlignment(JLabel.CENTER);
		c.add(msgLabel);
		
		createMenu();
		
		setSize(450,150);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenu audioMenu = new JMenu("오디오");
		JMenuItem playItem = new JMenuItem("열기");
		JMenuItem stopItem = new JMenuItem("종료");
		
		playItem.addActionListener(new OpenActionListener());		
		stopItem.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(clip != null && clip.isActive())
					clip.close();
				msgLabel.setText("연주를 종료합니다.");
			}
		});
		audioMenu.add(playItem);
		audioMenu.add(stopItem);
		JMenuBar mb = new JMenuBar();
		mb.add(audioMenu);
		
		setJMenuBar(mb);		
	}
	
	class OpenActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String filePath = chooseFile();
			if(filePath == null)
				return;
			playAudio(filePath);
			msgLabel.setText(new File(filePath).getName() + "를 연주하고 있습니다.");
		}
	}

	private String chooseFile() {
		if(chooser == null)
			chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio Files(wav, au, mid, rmf)", "wav", "au", "mid", "rmf");
		chooser.setFileFilter(filter);
		int ret = chooser.showOpenDialog(AudioMenuFrame.this);
		if(ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
			return null;
		}
		String filePath = chooser.getSelectedFile().getPath();
		return filePath;
	}
	
	
	private void playAudio(String pathName) {
		try {
			
			File audioFile = new File(pathName);			
			audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip = AudioSystem.getClip();
			clip.addLineListener(new MyLineListener());
			clip.open(audioStream);
			clip.start();
		}catch(LineUnavailableException e) {e.printStackTrace();}
		catch(UnsupportedAudioFileException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
	}
	class MyLineListener implements LineListener{
		@Override
		public void update(LineEvent e) {
			if(e.getType() == LineEvent.Type.STOP) {
				try {
					audioStream.close();
					msgLabel.setText("연주를 종료하였습니다.");
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		new AudioMenuFrame();
	}

}

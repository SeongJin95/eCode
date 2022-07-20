package Practice05;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class AudioStarAndStopFrame extends JFrame{
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel msgLabel = new JLabel("");
	
	public AudioStarAndStopFrame() {
		super("오디오 시작 중단 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		msgLabel.setFont(new Font("Gothic", Font.PLAIN, 15));
		c.add(msgLabel);
		
		setSize(300,150);
		setVisible(true);
		
		playAudio("images/애국가1절.wav");
		msgLabel.setText("images/kor.wav 연주 중");
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				msgLabel.setText("images/kor.wav 연주 계속");
				clip.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				msgLabel.setText("images/kor.wav 연주 일시 중단");
				clip.stop();
			}
		});
	}
	
	private void playAudio(String pathName) {
		try {
			File audioFile = new File(pathName);
			audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
		}
		catch(LineUnavailableException e) {e.printStackTrace();}
		catch(UnsupportedAudioFileException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		AudioStarAndStopFrame frame = new AudioStarAndStopFrame();
	}

}
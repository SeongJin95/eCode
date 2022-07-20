package Practice08;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class AudioCheckFrame extends JFrame{
	private JFileChooser chooser = null;
	private Clip clip = null;
	private AudioInputStream audioStream = null;
	private JLabel msgLabel = new JLabel("체크된 곡만 순서대로 한 번 연주합니다");
	MyPanel panel = new MyPanel();
	public AudioCheckFrame() {
		super("오디오 연주");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		msgLabel.setHorizontalAlignment(JLabel.CENTER);
		msgLabel.setBackground(Color.gray);
		msgLabel.setOpaque(true);
		c.add(msgLabel, BorderLayout.NORTH);
		c.add(panel, BorderLayout.CENTER);
		
		
		
		setSize(350,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{		
		JCheckBox cb[] = new JCheckBox[4];
		String path[] = {"audio\\wolf.wav", "audio\\dhol.wav", "audio\\sirenpolice.wav", "audio\\hiphop.wav"};
		public MyPanel() {
			setLayout(null);
			for(int i=0;i<cb.length;i++) {
				cb[i] = new JCheckBox(path[i]);
				cb[i].setSize(150,15);	
				cb[i].setLocation(100,50+30*i);
				add(cb[i]);
			}
			JButton b1 = new JButton("연주 시작");
			b1.setSize(100,30);
			b1.setLocation(65,170);
			JButton b2 = new JButton("연주 끝");
			b2.setSize(100,30);
			b2.setLocation(170,170);
			add(b1);
			add(b2);
			b1.addItemListener(new MyItemListener());
			b2.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					if(clip != null && clip.isActive())
						clip.close();
					msgLabel.setText("연주를 종료합니다.");
				}
			});
		}
		
		class MyItemListener implements ItemListener{			
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					for(int i=0;i<cb.length;i++)
						if(e.getItem() == cb[i])
							playAudio(path[i]);
				}
			}		
		}		
		
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
		new AudioCheckFrame();
	}

}

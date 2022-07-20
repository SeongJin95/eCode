package Practice;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TextAreaPracticeFrame extends JFrame {
	JLabel label;	
	
	public TextAreaPracticeFrame() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextArea tf = new JTextArea(5, 24);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		c.add(tf);
		c.add(slider);
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider temp=(JSlider)e.getSource();
				String text=tf.getText();
				if(text.length()<=slider.getValue()) {
					slider.setValue(text.length());
				}
				else {
					tf.setText(text.substring(0,temp.getValue()));
				}
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				JTextArea t=(JTextArea)e.getSource();
				String text=t.getText();
				if(text.length()<=100) {
					slider.setValue(text.length());
				}
				else {
					text=text.substring(0,99);
					tf.setText(text);
				}
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaPracticeFrame();
	}

}

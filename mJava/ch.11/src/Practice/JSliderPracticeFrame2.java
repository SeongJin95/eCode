package Practice;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JSliderPracticeFrame2 extends JFrame {
	
	
	public JSliderPracticeFrame2() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 100, 50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		c.add(slider, BorderLayout.NORTH);
		
		JLabel label = new JLabel("I Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, slider.getValue()));
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				label.setFont(new Font("Arial", Font.PLAIN, slider.getValue()));
			}
		});
		
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JSliderPracticeFrame2();
	}

}

package ch11_14;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SliderEx extends JFrame {
	JLabel label;	
	
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 150);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(0);
		c.add(slider);
		
		
		JLabel label = new JLabel();
		label.setText(Integer.toString(slider.getValue()));
		label.setBackground(Color.GREEN);
		label.setOpaque(true);
		slider.addChangeListener(new ChangeListener(){
			
			public void stateChanged(ChangeEvent e) {
				JSlider sl = (JSlider)e.getSource();
				label.setText(Integer.toString(sl.getValue()));
			}
		});
		c.add(label);
		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx();
	}

}

package Practice;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;

public class ImageGalleryPracticeFrame extends JFrame {
	JLabel label;	
	int i = 0;
	int x=0;
	public ImageGalleryPracticeFrame() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton b1, b2;
		
		JPanel panel = new JPanel();
		b1 = new JRadioButton("left");
		b2 = new JRadioButton("right");
		
		g.add(b1);
		g.add(b2);
		b1.setSelected(true);
		panel.add(b1);
		panel.add(b2);
		
		c.add(panel, BorderLayout.NORTH);		
		
		
		File f = new File("./images/");
		File files[] = f.listFiles();
		ImageIcon icon[] = new ImageIcon[files.length];
		
		for(int i=0;i<files.length;i++) {
			icon[i] = new ImageIcon(""+files[i]);
		}
		
		JLabel label = new JLabel(icon[0]);
		c.add(label, BorderLayout.CENTER);
		
		
		
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(x == 1) {
					if(files.length-1 == i) {
						i=0;
						label.setIcon(icon[i]);
					}
					else {
						i++;
						label.setIcon(icon[i]);
					}
				}
				else if(x == 0) {
					if(i == 0) {
						i=files.length-1;
						label.setIcon(icon[i]);
					}else {
						i--;
						label.setIcon(icon[i]);
					}
				}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
		});
		
		ItemListener listener = new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() != ItemEvent.SELECTED)
					return;
				else {
					if(e.getItem() == b1) {
						x = 0;
					}else if(e.getItem() == b2)					
						x = 1;
					}
				}
		};
		b1.addItemListener(listener);
		b2.addItemListener(listener);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageGalleryPracticeFrame();
	}

}

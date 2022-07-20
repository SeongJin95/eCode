package Practice;

import java.awt.*;
import javax.swing.*;

public class SJ extends JFrame{
	public SJ(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		SJ j = new SJ("Let's study Java");
	}

}

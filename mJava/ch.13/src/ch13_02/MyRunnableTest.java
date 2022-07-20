package ch13_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyRunnable implements Runnable {
	public void run() {
		for(int i=10;i>=0;i--)
			System.out.print(i+" ");
	}
}

public class MyRunnableTest extends JFrame{

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}

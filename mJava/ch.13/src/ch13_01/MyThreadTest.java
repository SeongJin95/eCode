package ch13_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyThread extends Thread{
	public void run() {
		for(int i=10;i>=0;i--)
			System.out.print(i+" ");
	}
}

public class MyThreadTest extends JFrame{
	
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
	}

}

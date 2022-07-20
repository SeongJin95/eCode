package Practice02;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.print.attribute.PrintServiceAttribute;
import javax.swing.*;
/*
public class TimeServer extends JFrame{
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private Receiver receiver;
	private JTextField sender;
	
	public TimeServer() {
		setTitle("서버 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);
		
		add(new JScrollPane(receiver), BorderLayout.CENTER);
		
		setSize(400,200);
		setVisible(true);
		
		try {
			receiver.append("타임서버입니다\n");
			setupConnection();
		}catch(IOException e) {
			handleError(e.getMessage());
		}
		TimerThread th = new TimerThread(out);
		th.start();
	}
	
	class TimerThread extends Thread{
		private BufferedWriter out;
		public TimerThread(BufferedWriter out) {
			this.out = out;
		}
		
		@Override
		public void run() {
			
			try {
				out.write("서버의 시간 : ");
				for(int i=0;i<20;i++) {
					sleep(500);
					out.write(Integer.toString(i) + "\n");
					out.flush();
				}
				out.write("연결을 종료합니다.");
				out.flush();
				receiver.append("종료합니다.");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}	
	private void setupConnection() throws IOException{
		listener = new ServerSocket(1002);
		socket = listener.accept();
		receiver.append("연결되었습니다\n500ms마다 수를 보냅니다.\n");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));		
	}
	
	private class Receiver extends JTextArea implements Runnable{
		@Override
		public void run() {
			String msg = null;
			while(true) {
				try {
					msg = in.readLine();
				}catch(IOException e) {
					handleError(e.getMessage());
				}
				int pos = this.getText().length();
				this.setCaretPosition(pos);
			}
		}
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}	
	
	public static void main(String[] args) throws IOException {
		new TimeServer();
	}
}*/

public class TimeServer{
	public static void main(String[] args) {
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		System.out.println("타임서버입니다.");
		
		try {
			listener = new ServerSocket(1002);
			socket = listener.accept();
			System.out.println("연결되었습니다.\n500ms마다 수를 보냅니다.");
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			TimerThread th = new TimerThread(out);
			th.start();
			try {
				th.join();
			}catch(InterruptedException e) {}
			socket.close();
			listener.close();
			System.out.println("종료합니다.");
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다");
		}
	}
}

class TimerThread extends Thread{
	private BufferedWriter out;
	public TimerThread(BufferedWriter out) {
		this.out = out;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<20;i++) {
				sleep(500);
				out.write(Integer.toString(i) + "\n");
				out.flush();
			}
			out.write("끝\n");
			out.flush();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}


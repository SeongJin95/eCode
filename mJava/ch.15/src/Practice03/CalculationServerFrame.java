package Practice03;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
public class CalculationServerFrame extends JFrame{
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private Receiver receiver;
	
	public CalculationServerFrame() {
		setTitle("멀티스레드 계산 서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);
		
		add(new JScrollPane(receiver), BorderLayout.CENTER);
		
		setSize(400,200);
		setVisible(true);
		
		try {
			setupConnection();
		}catch(IOException e) {
			handleError(e.getMessage());
		}
		Thread th = new Thread(receiver);
		th.start();
	}
	
	private void setupConnection() throws IOException{
		listener = new ServerSocket(1003);
		socket = listener.accept();
		receiver.append("클라이언트 연결됨\n");
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
					String first = in.readLine();
					String operator = in.readLine();
					String second = in.readLine();
					int a = Integer.parseInt(first);
					int b = Integer.parseInt(second);
					
					String resText = "";
					int res = 0;
					switch(operator){
						case "+" : res = a + b; resText = Integer.toString(res); break;
						case "-" : res = a - b; resText = Integer.toString(res); break;
						case "*" : res = a * b; resText = Integer.toString(res); break;
						case "/" : if(b==0) resText = "0으로 나울 수 없음";
						 			else res = a / b; resText = Integer.toString(res); break;
					}
				}catch(IOException e) {
					try {
						out.write("잘못된 연산");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}	
	
	public static void main(String[] args) throws IOException {
		new CalculationServerFrame();
	}
}*/
/*
public class CalculationServerFrame extends JFrame{
	private JTextArea log = new JTextArea();
	public CalculationServerFrame() {
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new JLabel("계산 서버 입니다."));
		c.add(new JScrollPane(log), BorderLayout.CENTER);
		setVisible(true);
		
		new ServerThread().start();
	}
	
	class ServerThread extends Thread{
		@Override
		public void run(){
			ServerSocket listener = null;
			Socket socket = null;
			try{
				listener = new ServerSocket(1003);
				while(true){
					socket = listener.accept();
					log.append("클라이언트 연결됨\n");
					new ServiceThread(socket).start();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			try{
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}				
		}			
	}
	class ServiceThread extends Thread{
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out =null;
		public ServiceThread(Socket socket){
			this.socket = socket;
			try{
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		public void run(){
			while(true){
				try{
					String first = in.readLine();
					String operator = in.readLine();
					String second = in.readLine();
					int a = Integer.parseInt(first);
					int b = Integer.parseInt(second);
					
					String resText = "";
					int res = 0;
					switch(operator){
						case "+" : res = a + b; resText = Integer.toString(res); break;
						case "-" : res = a - b; resText = Integer.toString(res); break;
						case "*" : res = a * b; resText = Integer.toString(res); break;
						case "/" : if(b==0) resText = "0으로 나울 수 없음";
						 			else {res = a / b; resText = Integer.toString(res); }break;
						default:
							resText = "잘못된 연산";
					}
					out.write(resText + "\n");
					out.flush();
					log.append(first + operator + second + "=" + resText + "\n");
				}catch(IOException e){
					log.append("연결 종료\n");
					System.out.println("연결 종료");
					return;
				}
			}
		}
	}
	public static void main(String[] args){
		new CalculationServerFrame();
	}
}*/

public class CalculationServerFrame extends JFrame {
	private JTextArea log = new JTextArea();
	public CalculationServerFrame() {
		super("멀티스레드 계산 서버");
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료 버튼(X)을 클릭하면 프로그램 종료
		Container c = getContentPane();
		c.add(new JLabel("계산 서버 입니다"));
		c.add(new JScrollPane(log), BorderLayout.CENTER);
		setVisible(true);
		
		new ServerThread().start(); // 서비스 시작
	}
	
	class ServerThread extends Thread {
		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(1003);
				while(true) {
					socket = listener.accept();
					log.append("클라이언트 연결됨\n");
					new ServiceThread(socket).start();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	class ServiceThread extends Thread {
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;
		public ServiceThread(Socket socket) { // 클라이언트와 통신할 소켓을 전달받음
			this.socket = socket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			while(true) {
				try {
					String first = in.readLine(); // 첫 수
					String operator = in.readLine(); // 첫 수
					String second = in.readLine(); // 둘째 수
					int a = Integer.parseInt(first); // 정수로 변환
					int b = Integer.parseInt(second); // 정수로 변환
					
					String resText = "";
					int res = 0;
					switch(operator) {
						case "+" : res = a + b; resText = Integer.toString(res); break;
						case "-" : res = a - b; resText = Integer.toString(res); break;
						case "*" : res = a * b; resText = Integer.toString(res); break;
						case "/" : 
							if(b == 0) resText = "0으로 나눌 수 없음";
							else {
								res = a / b;
								resText = Integer.toString(res); 
							}
							break;
						default:
							resText = "잘못된 연산";
					}
					
					out.write(resText+"\n");
					out.flush();
					log.append(first + operator + second + "=" + resText + "\n");
				} catch (IOException e) {
					log.append("연결 종료\n");
					System.out.println("연결 종료");
					return; // 스레드 종료
					//e.printStackTrace();
				}

			}
		}
	}
	public static void main(String[] args) {
		new CalculationServerFrame();
	}

}


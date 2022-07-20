package Practice02;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimerClient extends JFrame{
	/*private BufferedReader in = null;
	private BufferedWriter out = null;
	private JTextArea area;
	Socket socket = null;
	private Receiver receiver = null;
	
	public TimerClient() throws Exception, IOException{
		setTitle("클라이언트 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);		
		
		c.add(new JScrollPane(receiver), BorderLayout.CENTER);
		
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
		socket = new Socket("localhost", 1002);
		receiver.append("서버에 연결 완료\n");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));		
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
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
				if(msg.contains("종료"))
					this.append("\n"+ msg);
				this.append(" " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);
			}
		}
	}*/
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		Socket socket = null;
		try {
			socket = new Socket("localhost", 1002);
			System.out.println("서버에 접속하였습니다...");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputMessage;
			System.out.print("서버의 시간 : ");
			while(true) {
				inputMessage = in.readLine();
				if(inputMessage == null || inputMessage.equalsIgnoreCase("끝")) {
					System.out.println("\n연결을 종료합니다.");
					break;
				}
				else {
					int n = Integer.parseInt(inputMessage);
					System.out.print(n + " ");
				}
			}
			socket.close();
			sc.close();
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}


}
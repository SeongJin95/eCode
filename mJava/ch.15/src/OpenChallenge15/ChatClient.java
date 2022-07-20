package OpenChallenge15;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatClient extends JFrame implements ActionListener{
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private JTextField sender;
	private JTextArea area;
	Socket socket = null;
	private Receiver receiver = null;
	
	public ChatClient() throws Exception, IOException{
		setTitle("클라이언트 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);
		
		sender = new JTextField();
		sender.addActionListener(this);
		
		c.add(new JScrollPane(receiver), BorderLayout.CENTER);
		c.add(sender, BorderLayout.SOUTH);
		
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
		socket = new Socket("localhost", 7777);
		receiver.append("서버에 연결 완료");
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
				this.append("\n 서버: " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sender) {
			String msg = sender.getText();
			try {
				out.write(msg+"\n");
				out.flush();
				
				receiver.append("\n클라이언트: " + msg);
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos);
				sender.setText(null);				
			}catch(IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		ChatClient client = new ChatClient();
	}


}
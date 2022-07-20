package Practice06;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DicServerFrame extends JFrame{
	private JTextField eng = new JTextField(10);
	private JTextField kor = new JTextField(10);
	private JButton saveBtn = new JButton("저장");
	private JButton searchBtn = new JButton("찾기");
	private JTextArea ta = new JTextArea(7, 25);
	private HashMap<String, String> dic = new HashMap<>();
	
	public DicServerFrame() {
		super("클라이언트");
		setSize(350,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("영어"));
		c.add(eng);
		c.add(new JLabel("한글"));
		c.add(kor);
		c.add(saveBtn);
		c.add(searchBtn);
		c.add(new JScrollPane(ta));
		setVisible(true);
		
		saveBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append("삽입 (" + eng.getText() + "," + kor.getText() + ")\n");
				dic.put(eng.getText(), kor.getText());
			}
		});
		
		searchBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = dic.get(eng.getText());
				if(s==null)
					s = "없음";
				kor.setText(s);
			}
		});
		
		new ServerThread().start();
		
	}
	
	class ServerThread extends Thread{
		@Override
		public void run() {
			ServerSocket  listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(1004);
				while(true) {
					socket = listener.accept();
					//log.append("클라이언트 연결됨\n");
					new ServiceThread(socket).start();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(listener != null)
					listener.close();
				if(socket != null)
					socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	class ServiceThread extends Thread{
		private Socket socket = null;
		private BufferedReader in = null;
		private BufferedWriter out = null;
		
		public ServiceThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));					
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			while(true) {
				try {
					String word = in.readLine();
					String trans = dic.get(word);
					if(trans == null) 
						trans = "없음";
						
					out.write(trans + "\n");
					out.flush();
					
					ta.append("검색 (" + word + ")\n");
					int pos = ta.getText().length();
					ta.setCaretPosition(pos);
					
				}catch(IOException e) {
					return;
				}				
			}
		}
	}

	public static void main(String[] args) {
		new DicServerFrame();
	}
	
}

package Practice06;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Practice06.DicServerFrame.ServerThread;

public class DicClientFrame extends JFrame{
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private JTextField eng = new JTextField(10);
	private JTextField kor = new JTextField(10);
	private JButton searchBtn = new JButton("찾기");
	
	public DicClientFrame() {
		super("클라이언트");
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("영어"));
		c.add(eng);
		c.add(new JLabel("한글"));
		c.add(kor);
		c.add(searchBtn);
		
		try {
			setupConnection();
		}catch(IOException e) {
			handleError(e.getMessage());
		}
		
		setVisible(true);
		
		searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String word = eng.getText().trim();					
					if(word.length() == 0)
						return; // 입력되지 않았음
					
					out.write(word + "\n");
					out.flush();
					
					String trans = in.readLine();
					kor.setText(trans);
				} catch (IOException e1) {
					System.out.println("클라이언트 : 서버로부터 연결 종료");
					return;
					// e.printStackTrace();
				}				
			}			
		});
	}
	
	private void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	public void setupConnection() throws IOException{
		socket = new Socket("localhost", 1004);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}	

	public static void main(String[] args) {
		new DicClientFrame();
	}

}

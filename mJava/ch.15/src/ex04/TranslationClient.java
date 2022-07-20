package ex04;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.undo.StateEditable;

public class TranslationClient extends JFrame implements ActionListener{
	private BufferedReader in;
	private PrintWriter out;
	private JTextField field;
	private JTextArea area;
	
	public TranslationClient() throws Exception, IOException{
		setTitle("클라이언트");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		field = new JTextField(50);
		field.addActionListener(this);
		
		area = new JTextArea(10, 50);
		
		area.setEditable(false);
		add(field, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		Socket socket = new Socket("localhost", 9102);
		in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		
		area.append(in.readLine() + "\n");
		area.append(in.readLine() + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		out.println(field.getText());
		String response = null;
		try {
			response = in.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}area.append(response + "\n");
	}
	
	public static void main(String[] args) throws Exception {
		TranslationClient client = new TranslationClient();
	}


}
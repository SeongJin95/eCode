package Practice01;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EchoServer extends JFrame{
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		System.out.println("서버입니다. 클라이언트를 기다립니다...");
		try {
			listener = new ServerSocket(1001);
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inputMessage;
			while(true) {
				inputMessage = in.readLine();
				if(inputMessage.equals("끝")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				System.out.println("... " + inputMessage);
			}
			socket.close();
			listener.close();
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}

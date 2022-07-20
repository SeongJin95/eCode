package Practice01;

import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EchoClient extends JFrame {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter out = null;
		Socket socket = null;
		try {
			socket = new Socket("localhost", 1001);
			System.out.println("서버에 접속하였습니다...");
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String outputMessage;
			while(true) {
				System.out.print("텍스트 입력>> ");
				outputMessage = sc.nextLine();
				out.write(outputMessage+"\n");
				out.flush();
				if(outputMessage.equalsIgnoreCase("끝")){
					System.out.println("연결을 종료합니다.");
					break;
				}
			}
			socket.close();
			sc.close();
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}


}
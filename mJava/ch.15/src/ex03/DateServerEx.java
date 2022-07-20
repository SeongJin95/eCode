package ex03;

import java.io.*;
import java.net.*;
import java.util.*;

public class DateServerEx {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9100);
		try {
			while(true) {
				Socket socket = ss.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
				}finally {
					socket.close();
				}
			}
		}finally {
			ss.close();
		}
				
	}

}

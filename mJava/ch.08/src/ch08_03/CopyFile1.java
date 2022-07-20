package ch08_03;

import java.io.*;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("c:\\Temp\\Hangul.txt");
			out = new FileOutputStream("c:\\Temp\\Hangul2.txt");
			
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if(in != null)
				in.close();
			if(out != null)
				out.close();
		}

	}

}

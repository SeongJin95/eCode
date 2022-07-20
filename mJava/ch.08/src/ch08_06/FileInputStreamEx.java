package ch08_06;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		
		try {
			//"c:\\Temp\\test.out" 파일을 읽어 배열b에 저장;
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n = 0, c;
			while((c=fin.read())!=-1) {
				b[n] = (byte)c;
				n++;
			}
			//배열 b[]의 바이트 값을 모두 화면에 출력
			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			for(int i=0;i<b.length;i++)
				System.out.print(b[i] + " ");
			System.out.println();
			
			fin.close();
		}catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 확인해 주세요.");
			
		}		
	}

}


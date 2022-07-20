package Practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prac02 {

	public static void main(String[] args) {
		FileReader fin = null;
		File f = new File("c:\\Temp\\test.txt");//파일과 연결된 출력 문자 스트림 생성
		try {
			fin = new FileReader(f);//파일과 연결된 출력 문자 스트림 생성
			System.out.println(f.getPath() + "를 출력합니다.");
			while(true) {
				int c = fin.read();
				if(c==-1)
					break;
				System.out.print((char)c);
			}
			
			/*int c;
			while((c = fin.read())!=-1) {
				System.out.print((char)c);
			}*/
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}

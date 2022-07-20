package Practice;

//UpperCharacter
import java.io.*;

public class Prac03 {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			File f= new File("c:\\windows\\system.ini");
			fin = new FileReader(f);//파일과 연결된 출력 문자 스트림 생성
			int c;
			while((c = fin.read())!=-1) {
				char a = (char)c;
				if(Character.isLowerCase(a))
					a = Character.toUpperCase(a);
				System.out.print((char)a);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
	
}

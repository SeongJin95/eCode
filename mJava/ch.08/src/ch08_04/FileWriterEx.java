package ch08_04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");//파일과 연결된 출력 문자 스트림 생성
			while(true) {
				String line = sc.nextLine();
				if(line.length()==0)//한줄에<Enter>키만 입력한 경우
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);	//한 줄 띄기 위해 \r\n을 파일에 저장
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}

}

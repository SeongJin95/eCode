package Practice;

import java.io.*;
import java.util.Scanner;

public class Prac01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		String path = "c:\\Temp\\test.txt";
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			fout = new FileWriter(path);
			for(;;) {
				System.out.print("이름 전화번호 >> ");
				String s = sc.nextLine();
				if(s.equals("그만"))break;
				fout.write(s+"\r\n");
			}
			System.out.println(path + "에 저장 하였습니다.");
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}
}

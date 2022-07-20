package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prac04 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
		try {
		Scanner sc = new Scanner(new FileReader("c:\\windows\\system.ini"));
		int n = 1;
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.printf("%4d: ", n++);
			System.out.println(line);
		}
		sc.close();
		}catch(IOException e) {
			System.out.println("입출력 오류 발생");
		}
	}

}

package Practice;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String [] words = s.split(" ");
			System.out.println("어절 개수는 " + words.length);
		}
	}

}

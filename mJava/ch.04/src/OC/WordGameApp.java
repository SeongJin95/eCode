package OC;

import java.util.Scanner;

public class WordGameApp {
	
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		run();
		
	}
	

	static void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int num = sc.nextInt();
		Player player[] = new Player[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			player[i] = new Player();
			player[i].name = sc.next();
		}
		
		//System.out.println("시작하는 단어는 아버지입니다");
		//String word = "아버지";
		
		System.out.print("제시어를 입력하세요>>");
		String word = sc.next();
		System.out.println("시작하는 단어는 " + word +"입니다");
		
		
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);
		char FirstChar = word.charAt(0);
		
		
		for(;;) {
			for(int i=0;i<num;i++) {
				System.out.print(player[i].name + ">>");
				word = player[i].getWordFromUser();
				FirstChar = word.charAt(0);
				player[i].checkSuccess(lastChar,FirstChar);
				lastIndex = word.length()-1;
				lastChar = word.charAt(lastIndex);
			}
		}
		
	}	

}


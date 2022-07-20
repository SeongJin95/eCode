package Practice;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0;i<kor.length;i++) {
				if(word.equals(kor[i]))
					return word + "은 " + eng[i];				
				if(i==kor.length-1) { 
					if(!word.equals(kor[i])) 
						return word + "은 저의 사전에 없습니다.";
				}
					
		}
		return word + "은 저의 사전에 없습니다.";
	}
}

public class DicApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		for(;;) {
			System.out.print("한글 단어?");
			String s = sc.next();
			if(s.equals("그만"))
					break;
			//else
				//System.out.println(kor2Eng(s));
		}
	}

}

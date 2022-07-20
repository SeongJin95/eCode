import java.util.Scanner;

public class Kor2Eng {

	public static void main(String[] args) {
		String eng[] = {"student", "love", "java", "happy", "future" };
		String kor[] = {"학생", "사랑", "자바", "행복", "미래" };
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("단어를 입력하세요>>");
			String s = sc.nextLine();
			if(s.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			int i;
			for(i=0;i<kor.length;i++) {
				if(kor[i].equals(s)) {
					System.out.println(eng[i]);
					break;
				}
			}
			if(i==kor.length)
				System.out.println("그런 단어가 없습니다.");
		}
		sc.close();
	}

}

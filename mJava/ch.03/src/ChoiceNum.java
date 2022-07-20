import java.util.Random;
import java.util.Scanner;

public class ChoiceNum {

	public static void main(String[] args) {
		Random rand = new Random();
		int com = rand.nextInt(100)+1; // 1~100사이의 난수
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int count=0;
		while(true) {
			count++;
			int user = sc.nextInt();
			if(com==user) {
				System.out.println("맞았습니다.");
				break;
			}else if(com>user)
				System.out.print("더 큰 수를 입력하세요=>");
			else if(com<user)
				System.out.print("더 작은 수를 입력하세요=>");
		}
		System.out.println("컴퓨터의 숫자:+com");
		System.out.println(count + "번 만에 맞추셨네요.");
		if(count <= 3)
			System.out.println("당신의 추측력은 최상입니다.");

		else if(count <= 5)
			System.out.println("당신의 추측력은 훌륭합니다.");

		else
			System.out.println("당신의 추측력은 보통입니다.");
				
		sc.close();
				
		
	}

}

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int ans;
		//int guess;
		//int tries = 0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		ans = random.nextInt(100)+1;
		//반복 구조
		/*do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = sc.nextInt();
			tries++;
			
			if(guess > ans) // 사용자가 입력한 정수가 정답보다 높으면
				System.out.println("제시한 정수가 높습니다.");
			else if(guess < ans) // 사용자가 입력한 정수가 정답보다 낮으면
				System.out.println("제시한 정수가 낮습니다.");
			else if(guess == ans) // 사용자가 입력한 정수가 정답이면
			{
				System.out.println("정답은 " + ans + "입니다.");
				break;
			}			
		}while(true);*/
		for(int i=0;i<100;i++) {
			ans = random.nextInt(100)+1;
			System.out.println(ans);
		}
		
		sc.close();
	}

}

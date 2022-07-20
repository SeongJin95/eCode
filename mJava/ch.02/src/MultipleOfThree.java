import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int number = sc.nextInt();//정수를 입력 받는다
		if(number % 3 == 0) //3으로 나눈 나머지가 0인지 검사
			System.out.println("3의 배수 입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		
		sc.close();
	}

}

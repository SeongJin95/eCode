import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//if문을 사용하여 홀수와 짝수를 구별하는 프로그램
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = input.nextInt();
		
		if(number%2==0) {
			System.out.println("입력된 정수는 짝수 입니다.");
		}else {
			System.out.println("입력된 정수는 홀수 입니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
		input.close();
	}

}

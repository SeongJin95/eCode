import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
		
		sc.close();

	}

}

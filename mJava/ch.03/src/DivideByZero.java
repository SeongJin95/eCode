import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;	//나뉨수
		int divisor;	//나눗수
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = sc.nextInt();
		System.out.print("나뉫수를 입력하시오:");
		divisor = sc.nextInt();
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 " + dividend/divisor + "입니다.");
		
		sc.close();
	}

}

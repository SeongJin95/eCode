import java.util.Scanner;

public class Addtion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		System.out.print("두 정수를 입력 하세요>>");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println(a+"+"+b+"은 "+sum);
		
		sc.close();
	}

}

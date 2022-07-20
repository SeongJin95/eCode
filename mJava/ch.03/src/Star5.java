//import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		
		for(int a=5;a>=1;a--) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하세요>> ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();*/
	}

}

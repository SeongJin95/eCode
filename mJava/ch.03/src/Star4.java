import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}

}

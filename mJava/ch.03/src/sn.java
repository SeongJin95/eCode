import java.util.Scanner;

public class sn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int n[] = new int[1];
		 * 
		 * System.out.print("갯수 입력>>"); for(int i=0;i<n.length;i++) { n[i]=sc.nextInt();
		 * }
		 * 
		 * for(int i=2;i<=n[0];i++) { for(int j=1;j<i;j++) { if(i%j==0) break;
		 * if(i%j!=0); continue; } }
		 */
		// Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b > 44)
			System.out.println(a + " " + (b-45));
		else {
			if (a == 0) {
				a = 23;
				b = 60 + b - 45;
				System.out.println(a + " " + b);
			} else
				a = a - 1;
				b = 60 + b - 45;
			System.out.println(a + " " + b);
		}

		sc.close();
	}

}

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n; 
		//String name = "홍길동"; 
		
		System.out.print("반복 횟수 >>");
		n = sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			System.out.println("홍길동");
		}
		
		sc.close();

	}

}

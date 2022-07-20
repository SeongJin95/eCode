import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		System.out.print("문자열 입력: ");
		String str2 = sc.next();
		System.out.println(str2);
		
		sc.close();
	}

}

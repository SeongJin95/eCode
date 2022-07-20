import java.util.Scanner;

public class ScannerExam1 {

	public static void main(String[] args) {
		System.out.println("나이, 체중, 신장을 입력하세요");
		Scanner sc = new Scanner(System.in);

		System.out.println("나이는 " + sc.nextInt() + "살, ");
		System.out.println("체중은 " + sc.nextDouble() + "kg, ");
		System.out.println("신장은 " + sc.nextDouble() + "cm 입니다.");
		sc.close();

	}

}

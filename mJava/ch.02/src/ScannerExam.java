import java.util.Scanner;

//import java.util.*;

public class ScannerExam {

	public static void main(String[] args) {
		System.out.println("나이, 체중, 신장을 입력하세요");
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt(); // 정수 읽기
		System.out.println("나이는 " + age + "살, ");

		double weight = sc.nextDouble(); // 실수 읽기
		System.out.println("체중는 " + weight + "kg, ");

		double height = sc.nextDouble(); // 실수 읽기
		System.out.println("신장은 " + height + "cm 입니다.");
		sc.close();
	}

}


import java.util.Scanner;

//import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시 , 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner sc = new Scanner(System.in);

		String name = sc.next(); // 문자열 읽기
		System.out.println("이름은 " + name + ", ");

		String city = sc.next(); // 문자열 읽기
		System.out.println("도시는 " + city + ", ");

		int age = sc.nextInt(); // 정수 읽기
		System.out.println("나이는 " + age + ", ");

		double weight = sc.nextDouble(); // 실수 읽기
		System.out.println("체중는 " + weight + ", ");

		boolean isSingle = sc.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		sc.close();
	}

}

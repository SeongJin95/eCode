import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5]; //배열 생성
		int max = 0; //현재 가장 큰 수
		System.out.println("양수 5개를 입력 하세요.");
		for(int i=0;i<5;i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i]>max)
				max = intArray[i];
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		sc.close();
	}

}

import java.util.Scanner;

public class ArrayAccess1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int min = 0; //현재 가장 작은 수
		
		System.out.print("양수 5개를 입력하시오: ");		
		
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = sc.nextInt();
		}		
		min = intArray[0];
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]<min)
				min = intArray[i];
		}
		
		System.out.println("가장 작은 수는 " + min + "입니다.");
		
		sc.close();
	}

}

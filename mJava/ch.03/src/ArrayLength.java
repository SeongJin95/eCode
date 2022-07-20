import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<intArray.length;i++)
			intArray[i] = sc.nextInt();
		
		for(int i=0;i<intArray.length;i++)
			sum += intArray[i];
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		sc.close();
	}

}

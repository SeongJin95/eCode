import java.util.Scanner;

public class Multiple2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[3];
		
		System.out.print("정수 3개 입력>>");
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0)
				System.out.println("짝수 => " + n[i]);
			else
				System.out.println("홀수 => " + n[i]);
		}
		sc.close();
	}

}

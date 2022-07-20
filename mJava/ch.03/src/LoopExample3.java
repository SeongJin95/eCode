import java.util.Scanner;

public class LoopExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i=1;
		
		System.out.print("구구단 중에서 촐력하고 싶은 단을 입력하시오: ");
		n = sc.nextInt();
		
		do {			
			System.out.println(n + "*" + i + "=" + i*n);			
		}while(i++<9);
		
		sc.close();
	}

}

import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		int n;
		System.out.print("구구단 중에서 촐력하고 싶은 단을 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=1;i<=9;i++)
			System.out.println(n + "*" + i + "=" + n*i);
		scan.close();
	}

}

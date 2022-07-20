import java.util.Scanner;

public class PlusAndMinus {

	public static void main(String[] args) {
		int until;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요>>");
		until = sc.nextInt();

		for (int i = 1; i <= until; i++) {
			if (i == until) {
				System.out.println(i);
				break;
			}
			if (flag) {
				System.out.print(i + "+");
				flag = !flag;
			}		
			else if(!flag) {
				System.out.print(i + "-");
				flag = !flag;
			}
		}
		sc.close();
	}

}

package Practice;

import java.util.Scanner;
import java.util.Vector;

public class prac01 {

	public static void printBig(Vector<Integer> v) {
		int big = v.get(0);
		for(int i=1;i<v.size();i++) {
			if(big<v.get(i))
				big = v.get(i);
		}
		System.out.println("가장 큰 수는 " + big);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수(-1이 입력될 때까지)>>");
		for(;;) {
			int n = sc.nextInt();
			if(n==-1)
				break;
			else
				v.add(n);			
		}
		if(v.size()==0) {
			System.out.print("수가 하나도 없음");
			sc.close();
			return;
		}
		printBig(v);
		sc.close();
	
	}

}

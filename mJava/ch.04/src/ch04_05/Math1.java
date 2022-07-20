package ch04_05;

import java.util.Scanner;

public class Math1 {
		static int add(int x, int y) {
					return x+y;					
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		Math1 obj = new Math1();
		sum =  obj.add(2,3);
		System.out.println("2와 3의 합은 " + sum);
		sum =  obj.add(7,8);
		System.out.println("7와 8의 합은 " + sum);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum = obj.add(a,b);
		System.out.println(a + "와 " + b + "의 합은 " + sum);
		
		
		
	}

}

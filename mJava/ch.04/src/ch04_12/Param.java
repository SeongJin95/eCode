package ch04_12;

public class Param {
	static int plus(int a, int b) {
		return a + b;
	}

	static int minus(int a, int b) {
		return a - b;
	}

	static int multi(int a, int b) {
		return a * b;
	}

	static int divide(int a, int b) {
		return a / b;
	}

	static int remain(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		int n;
		n = plus(10, 20);
		System.out.println(n);
		n = minus(100, 50);
		System.out.println(n);
		n = multi(10, 5);
		System.out.println(n);
		n = divide(10, 5);
		System.out.println(n);
		n = remain(9, 5);
		System.out.println(n);

	}

}

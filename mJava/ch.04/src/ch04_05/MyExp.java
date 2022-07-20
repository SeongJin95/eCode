package ch04_05;

public class MyExp {
	int base;
	int exp;
	int getValue() {
		int res=1;
		for(int i=0;i<exp;i++)
			res = res * base;
		return res;
	}

	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.base = 2;
		number1.exp = 3;
		MyExp number2 = new MyExp();
		number2.base = 3;
		number2.exp = 4;
		MyExp number3 = new MyExp();
		number3.base = 7;
		number3.exp = 7;
		
		System.out.println("2의 3승= " + number1.getValue());
		System.out.println("3의 4승= " + number2.getValue());
		System.out.println("7의 7승= " + number3.getValue());
		
		System.out.println(number3.base + "의 "+number3.exp+"승= " + number3.getValue());
		
		
	}

}

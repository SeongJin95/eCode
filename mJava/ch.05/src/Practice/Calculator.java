package Practice;

import java.util.Scanner;

abstract class Calc{
	protected int a;
	protected int b;
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	abstract public int calculate();
}

class Add extends Calc{
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	public int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	public int calculate() {
		return a/b;
	}
}

public class Calculator {
	/*
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("두 정수와 연산자를 입력하시오>>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			String c = sc.next();
			switch(c) {
				case "+": 
					Add calc1 = new Add();
					System.out.println(calc1.calculate());
					break;
				case "-": 
					Sub calc2 = new Sub();
					System.out.println(calc2.calculate());
					break;
				case "*":
					Mul calc3 = new Mul();
					System.out.println(calc3.calculate());
					break;
				case "/":
					Div calc4 = new Div();
					System.out.println(calc4.calculate());
					break;
				default:
					System.out.println("다시 입력");
					break;
			}
		}
		sc.close();
	}
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
			System.out.print("두 정수와 연산자를 입력하시오>>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			char operator = sc.next().charAt(0);
			Calc exp;
			switch(operator) {
				case '+': 
					exp = new Add();
					break;
				case '-': 
					exp = new Sub();					
					break;
				case '*':
					exp = new Mul();
					break;
				case '/':
					exp = new Div();
					break;
				default:
					System.out.println("다시 입력");					
					sc.close();
					return;
			}
			exp.setValue(a,b);
			if(exp instanceof Div && b==0)
				System.out.println("계산불가");
			else
				System.out.println(exp.calculate());
			sc.close();
		
	}

}

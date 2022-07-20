package ch05_11;

class Base{
	public Base() {
		System.out.println("1");
	}
	public Base(int s) {
		System.out.println("Base() 생성자");
	}
}

class Derived extends Base{
	public Derived(int a) {
		super(2);
		System.out.println("Derived() 생성자" + a);
	}
}

public class Test {

	public static void main(String[] args) {
		Derived r = new Derived(1);
		//new Derived(1);
	}

}

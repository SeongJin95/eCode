package ch05_02;

class A{
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println("매개변수생성자A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자B");
	}
	public B(int x) {
		System.out.println("매개변수생성자B");
	}
}
class C extends B{
	public C() {
		System.out.println("생성자C");
	}
	public C(int x) {
		System.out.println("매개변수생성자C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C(1);
	}

}

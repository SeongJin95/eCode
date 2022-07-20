package Exercise;
// 7.
class AA{
	public AA() {System.out.println("A");}
	public AA(int x) {System.out.println("A: " + x);}
}
class BB extends AA{
	public BB() {System.out.println("B");}
	public BB(int x) {System.out.println("B: " + x);}
}


public class Example {

	public static void main(String[] args) {
		BB b = new BB(11);
	}

}
/* 8. 생성자 A가 없다, 생성자 B에 super를 삽입한다
class A{
	private int a;
	protected A(int i) {this.a = i;}
}
class B extends A{
	private int b;
	public B() {this.b = 0;}
	
}
*/
//9.1)추상 클래스의 추상 메소드는  abstract 한다, 3)추상 메소드의 구현을 하지 않았기때문에 C도 추상 클래스 선언
/*1)
abstract class A{
	abstract void f();
}
3)
abstract class A{
	abstract void f();
}
abstract class B extends A{
	
}
4)
abstract class A{
	abstract int f();
}
abstract class B extends A{
	int f() {System.out.println("~");return 0;}
	
}*/
//10. public boolean isOdd(){if(n%2==1) return true; else false;}
//11. 1) B b = new C();, A a = new D(); 2) true false 3) true true





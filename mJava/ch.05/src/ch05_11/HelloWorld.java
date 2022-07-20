package ch05_11;

public class HelloWorld {
	String msg;
	
	public HelloWorld() {
		msg = "Hello World !!";
	}
	
	public HelloWorld(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld(String msg, int option) {
		if(option == 1)
			this.msg = msg;
		if(option == 2)
			this.msg = msg + ", 안녕하세요";
	}
	
	public void print() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorld();
		hello1.print();
		HelloWorld hello2 = new HelloWorld("My Hello World!!");
		hello2.print();
		HelloWorld hello3 = new HelloWorld("Hello", 2);
		hello3.print();

	}

}

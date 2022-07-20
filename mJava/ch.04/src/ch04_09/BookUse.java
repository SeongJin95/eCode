package ch04_09;

public class BookUse {

	public static void main(String[] args) {
		Book b1 = new Book("java", "김선생", "영진", 2018, 30000,10);
		b1.calc();
		b1.print();
		
		Book b2 = new Book();
		
		Book b3 = new Book("홈페이지", "홍길동", "미래", 2021, 15000,20);
		b3.calc();
		b3.print();

	}

}

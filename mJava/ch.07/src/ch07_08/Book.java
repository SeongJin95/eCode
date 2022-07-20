package ch07_08;

import java.util.Scanner;

public class Book {
	private String bookName;
	private String press;
	private int price;
	private int amount;
	private int money;
	
	public Book() {}	//기본 생성자
	
	public Book(String bookName, String press, int price, int amount) {
		this.bookName = bookName;
		this.press = press;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("도서명:");
			bookName = sc.nextLine();
			System.out.print("출판사:");
			press = sc.nextLine();
			System.out.print("단가");
			price = sc.nextInt();
			System.out.print("수량");
			amount = sc.nextInt();
			money = price * amount;
		}catch(Exception e){
			System.out.println("데이터 입력 오류...");
			sc.close();
			
		}
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void input() {
	}

	
}

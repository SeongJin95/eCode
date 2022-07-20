package ch05_01;

public class BookSale extends Book {
	private int amount;
	private int rank;
	private int money;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney() {
		this.money = getAmount()*getPrice();
	}
	
	public void print() {
		System.out.println("도서명\t출판사\t저자\t출판연도\t단가\t판매수량\t판매금액\t판매순위");
		System.out.println(bookName + "\t" + press + "\t" + author + "\t" + year + "\t" + price + "\t" + amount + "\t" + money + "\t" + rank);
	}

}

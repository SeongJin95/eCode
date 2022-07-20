package ch04_13;

public class AccountTest {

	public static void main(String[] args) {
		
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance() + "입니다.");
		
		Account obj1 = new Account();
		obj1.setName("홍길동");
		obj1.setBalance(500000);
		System.out.println("이름은 " + obj1.getName() + " 통장 잔고는 " + obj1.getBalance() + "입니다.");
		

	}

}

package Practice;

import java.util.Scanner;

class Phone{
	private String name;
	private String pn;
	
	public Phone(String name, String pn) {
		this.name = name;
		this.pn = pn;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}
}

public class PhoneBook {
	
	

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int num = sc.nextInt();
		Phone phone[] = new Phone[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("이름과 번호(이름과 전화 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String pn = sc.next();
			phone[i] = new Phone(name, pn);
		}			
		System.out.println("저장되었습니다...");
		
		for(;;) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			
			if(name.equals("그만"))
				break;
			
			for(int i=0;i<num;i++) {
				if(name.equals(phone[i].getName()))
					System.out.println(phone[i].getName()+"의 번호는 " + phone[i].getPn() + "입니다.");
				if(i==num-1) {
					if(!name.equals(phone[i].getName()))
						System.out.println(name + " 이 없습니다.");
				}
			}			
		}
		sc.close();*/
		new PhoneBook().run();
		
		
	}
	
	
	 private Scanner scanner;
	 private Phone[] pArray;
	 public PhoneBook(){
	 	scanner = new Scanner(System.in);
	 }
	 void read(){
		 System.out.print("인원수>>");
		 int n = scanner.nextInt();
		 
		 pArray = new Phone[n];
		 for(int i=0;i<pArray.length;i++){
		 	System.out.print("이름과 번호(이름과 전화 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	String search(String name){
		for(int i=0;i<pArray.length;i++){
			if(pArray[i].getName().equals(name))
				return pArray[i].getPn();
		}
		return null;
	}
	 
	void run() {
		read();
		for(;;) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String tel = search(name);
			if(tel==null)
				System.out.println(name + " 이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel + "입니다.");
			
		}
		scanner.close();
	}
	
}

/*
황기태 777-7777
나명품 999-9999
최자바 333-1234*/


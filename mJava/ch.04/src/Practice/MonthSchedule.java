package Practice;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {this.work = work;}
	public String get() {return work;}
	public void show() {
		if(work==null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {

	public static void main(String[] args) {
		System.out.println("이번 달 스케쥴 관리 프로그램.");
		run();			
		
	}
	
	static void run() {
		Scanner sc = new Scanner(System.in);
		Day day[] = new Day[30];
		
		
		
		for(;;) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("날짜(1~30)?");
				num = sc.nextInt();
				day[num] = new Day(); 
				System.out.print("할일(빈칸 없이 입력)");
				day[num].set(sc.next());
			}else if(num == 2) {
				System.out.print("날짜(1~30)?");
				num = sc.nextInt();				
				System.out.println(num + "일의 할 일은 " + day[num].get() + "입니다.");
			}else if(num == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else
				System.out.println("다시 입력하세요.");
		}
		
	}

}

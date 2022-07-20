package prac12;
//예약 그룹별로 나누는 클래스
import java.util.Scanner;

public class Group {
	private char type;
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);
	
	public Group(char type, int num) { //그룹 타입과 예약가능한 수 설정
		this.type = type;
		seats = new Seat[num];
		for(int i=0;i<seats.length;i++)
			seats[i] = new Seat();
	}
	public boolean reserve() {	//예약 메서드
		int no;
		String name;
		show();
		System.out.print("이름>>");
		name = sc.next();
		System.out.print("번호>>");
		no = sc.nextInt();
		if(no<1||no>=seats.length) {
			System.out.println("잘못된 좌석번호입니다.");
			return false;
		}
		seats[no-1].reserve(name);
		return true;
	}
	public boolean cancel() { //예약 취소 메서드
		show();
		System.out.print("이름>>");
		String name = sc.next();
		if(name != null) {
			for(int i=0;i<seats.length;i++) {
				if(seats[i].match(name)) {
					seats[i].cancel();
					return true;
				}
			}
			System.out.println("예약자 이름을 찾을 수 없습니다.");
		}
		return false;
	}
	public void show() {	//그룹에서 예약한 자리를 보여주는 클래스
		System.out.print(type + ">> ");
		for(int i=0;i<seats.length;i++) {
			if(seats[i].isOccupied())
				System.out.print(seats[i].getName() + " ");
			else
				System.out.print("--- ");
		}
		System.out.println();
	}

}

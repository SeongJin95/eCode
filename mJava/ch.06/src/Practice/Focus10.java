package Practice;

import java.util.Scanner;
import java.util.Calendar;

public class Focus10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter>키>>");
				String s1 = sc.nextLine();
		Calendar cal1 = Calendar.getInstance();
		System.out.println("현재 초 시간 = " + cal1.get(Calendar.SECOND));
		
		System.out.print("10초 예상 후 <Enter>키>>");
		s1 = sc.nextLine();
		Calendar cal2 = Calendar.getInstance();
		System.out.println("현재 초 시간 = " + cal2.get(Calendar.SECOND));
		
		System.out.println("황기태의 결과 ");
		if((cal2.get(Calendar.SECOND)<cal1.get(Calendar.SECOND)))
			System.out.println(cal2.get(Calendar.SECOND)-cal1.get(Calendar.SECOND)+60);
		else
			System.out.println(cal2.get(Calendar.SECOND)-cal1.get(Calendar.SECOND));
	}

}

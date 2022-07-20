package Practice;

import java.util.*;

class Scholarship {
	private String title;
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Double> scoreMap = new HashMap<String, Double>();
		
	public Scholarship(String name) {
		this.title = name;
	}
	public void read() {
		System.out.println(title + "관리시스템입니다.");
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점>> ");
			String name = sc.next();
			double score = sc.nextDouble();
			scoreMap.put(name, score);
		}
	}
	public void select() {
		System.out.print("장학생 선발 기준 입력>>");
		double cutline = sc.nextDouble();
		
		System.out.print("장학생 명단 : ");
		Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();
		while(it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if(score>cutline)
				System.out.print(name + " ");
		}
		System.out.println();
	}
}
	
	

public class ScholarshipManager {

	public static void main(String[] args) {
		Scholarship sship = new Scholarship("미래장학금");
		sship.read();
		sship.select();
	}

}


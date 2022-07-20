package ch07_08;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");	//인덱스 1에 "APPLE"을 삽입
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("==============");
		
		list.set(2, "GRAPE");	//인덱스 2의 원소를 "GRAPE로 대체
		list.remove(3);	//인덱스 3의 원소를 삭제한다.
		
		for(String s : list)
			System.out.println(s);
				
	}

}

package ch07_09;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		String []fruits = {"사과", "포도", "바나나", "키위", "수박"};
		Stack<String> s = new Stack<>();
		for(String str : fruits) {
			s.push(str);
		}
		//s.isEmpty() 스택이 비어 있으면 true, 아니면 false
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}

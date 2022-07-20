package Practice;

import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	private String Stack[];
	private int top=0;
	
	public StringStack(int number) {
		Stack = new String[number];
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public int capacity() {
		return Stack.length;
	}

	@Override
	public String pop() {
		if(top==0)
			return "비어 있음";
		else {
			String stay = Stack[top-1];
			top--;
			return stay;
		}
	}
	
	@Override
	public boolean push(String val) {
		if(top==Stack.length) {
			return false;
		}
		else {
			Stack[top] = val;
			top++;
			return true;
		}
	}
}

public class StackApp{
	 public void run() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
	        int number = sc.nextInt();
	        StringStack ss = new StringStack(number);
	        
	        while(true) {
	            System.out.print("문자열 입력 >> ");
	            String text = sc.next();
	            
	            if(text.equals("그만")) {break;}
	            
	            boolean isCheck = ss.push(text);
	            
	            if(isCheck ==false) {System.out.println("스택이 꽉 차서 푸시 불가!");}
	        }
	        int textPop = ss.length();
	        for(int i=0;i<textPop;i++) {
	            System.out.print(ss.pop() +" ");
	        }
	    }
	public static void main(String[] args) {
		StackApp n = new StackApp();
        n.run();
		/*
		Scanner sc = new Scanner(System.in);
		int length = 0;
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int capacity = sc.nextInt();
		String stack[] = new String[capacity];
		for(;;) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			if(str.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 팝: ");
				for(int i=0;i<length;i++)
					System.out.print(stack[length] + " ");
				System.out.println();
				break;
			}
			else if(length > capacity-1) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
				continue;
			}
			else {
				stack[length] = str;
				length++;
			}			
		}*/
		
	}
}

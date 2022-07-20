import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[] = {0,10,20,30,40,50,60,70,80,90,100};
		int value, index = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오: ");
		value = sc.nextInt();
		
		for(int i=0;i<s.length;i++) {
			if(s[i] == value)
				index = i;
		}
		System.out.println(index);
		
		//if(index < s.length && index >= 0)
		//	index = s[]
		sc.close();	
	}

}

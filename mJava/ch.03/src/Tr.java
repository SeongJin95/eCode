import java.util.InputMismatchException;
import java.util.Scanner;

public class Tr {

	public static void main(String[] args) {
		/*	1.	(1)100 미만의 짝수의 합
 				(2)
			 		public class WhileTest {
	
						public static void main(String[] args) {
							int sum = 0, i=0;
							while(i<100){
							sum=sum+i;
							i+=2;
						}
						System.out.println(sum);
					}
				(3)
			 		public class ForTest {
	
						public static void main(String[] args) {
							int sum = 0, i=0;
							for(;i<100;i+=2){
							sum=sum+i;
						}
						System.out.println(sum);
					}
				(4)
		 		public class DowhileTest {

					public static void main(String[] args) {
						int sum = 0, i=0;
						do{
						sum=sum+i;
						i+=2;
						}while(i<100)
						System.out.println(sum);
					}
				}*/
		/* 2.	int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
				for(int i=0;i<n.length;i++) {
					for(int j=0;j<n[i].length;j++)
						System.out.print(n[i][j]+" ");
					System.out.println();
		}*/
		/* 3.	Scanner sc = new Scanner(System.in);
		  		int n = sc.nextInt();
		  		System.out.print("정수를 입력하시오>>");
		  		for(int i=n;i>0;i--) {
		  			for(int j=i;j>0;j--)
		  				System.out.print("*");
		  			System.out.println();
		  		}
		 */
		/*	4.	
		  		Scanner sc = new Scanner(System.in);
		  		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		  		char ch = sc.next().charAt(0);
		  		
		  		if(c<'a'||c>'z'){
		  			System.out.println("소문자 알파벳이 아닙니다.");
		  			sc.close();
		  			return;
		  		}
		  		
		  		
		  		for(char i=ch;i>='a';i--) {
		  			for(char j='a';j<=i;j++)
		  				System.out.print(j);
		  			System.out.println();
		  		}
		 */
		/*	5.	
				Scanner sc = new Scanner(System.in);
		  		System.out.print("양의 정수 10개를 입력하시오>>");
		  		int n[] = new int[10];
		  		int m[] = new int[10];
		  		int k=0;
		  		for(int i=0;i<n.length;i++) {
		  			n[i] = sc.nextInt();	
		  			if(n[i]%3==0){
		  				 m[k]=n[i];
		  				 k++;
		  			}
		  		}
		  		System.out.print("3의 배수는 ");
		  		for(int i=0;i<k;i++) {
		  			System.out.print(m[i] + " "); 			 		
		  		}
		  		*/
		/*	6.	
			 	int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
				Scanner sc = new Scanner(System.in);
		  		System.out.print("금액을 입력하시오>>");
		  		int money = sc.nextInt();
		  		
		  		for(int i=0;i<unit.length;i++) {
		  			int res = money/unit[i];
		  			
		  			if(res>0){
		  				System.out.println(unit[i] + "원 짜리: " + res + "개");
		  				money = money%unit[i];
		  			}
		  			
		  		
		  		}*/
		/*	7.
				int n[] = new int[10];
		  		
		  		for(int i=0;i<n.length;i++) {
		  			int r = (int)(Math.random()*10+1);
		  			n[i]=r;
		  		}
		  		int sum = 0;
		  		for(int i=0;i<n.length;i++) {
		  			sum += n[i];
		  		}
		  		
		  		System.out.print("랜덤한 정수들: "); 			
		  		for(int i=0;i<n.length;i++) {
		  			System.out.print(n[i]+" "); 			
		  		}
		  		System.out.println("\n평균은 " + (double)sum/n.length); 			
		 */
		
  		/*
		//lotto
  		int lotto[] = new int[6];
  		
  		for(int i=0;i<lotto.length;i++) {
  			lotto[i] = (int)(Math.random()*45+1);
  			for(int j=0;j<i;j++) {
  	  			if(lotto[i] == lotto[j]) {
  	  				i--;
  	  				break;
  	  			}
  	  		}
  			
  		}
  		System.out.print("로또 번호: "); 
  		for(int i=0;i<lotto.length;i++)
  			System.out.print(lotto[i] + " ");
  		*/
		/* 8.
		Scanner sc = new Scanner(System.in);
  		System.out.print("정수 몇개?"); 
		
		int n = sc.nextInt();
		int num[] = new int[n];
				
		
		for(int i=0;i<n;i++)
			num[i]=(int)(Math.random()*99+1);
		
		for(int i=0;i<n;i++) {
			if(i>1&&(i)%10==0)
				System.out.println();
			System.out.printf("%2d ", num[i]);
			
		}*/
		/*	9.
		int n[][] = new int[4][4];				
		
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				n[i][j]=(int)(Math.random()*10+1);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++)
				System.out.printf("%2d\t", n[i][j]);
			System.out.println();
		*/
		/*	10.
		int arr[][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		for(int count=0;count<10;) {
			int i=(int)(Math.random()*4);
			int j=(int)(Math.random()*4);
			if(arr[i][j]==0) {
				arr[i][j]=(int)(Math.random()*10+1);
				count++;
			}
		}
 
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		/*
		//	11.
		int avg=0;
		int sum=0;
		for(int i=0;i<args.length;i++)
			sum+=Integer.parseInt(args[i]);
		avg=sum/args.length;
		
		System.out.println(avg);*/
		/*
		//	12.
			int sum=0;
			for(int i=0;i<args.length;i++) {
				try {				
					Integer.parseInt(args[i]);
					sum+=Integer.parseInt(args[i]);
				}catch(NumberFormatException e){
					continue;
				}
			}
			
			System.out.println(sum);*/
		/*	13.
			for(int i=1;i<100;i++) {
				if((i%10 == 3 | i%10 == 6 | i%10 == 9 ) &&(i/10 == 3 | i/10 == 6 | i/10 == 9 ))
					System.out.println(i + " 박수 짝짝");
				else if((i/10 == 3 | i/10 == 6 | i/10 == 9 ))
					System.out.println(i+ " 박수 짝");
				else if((i%10 == 3 | i%10 == 6 | i%10 == 9 ))
					System.out.println(i + " 박수 짝");
				
			}*/
		/*
			//14.
			String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
			int score[] = {95, 88, 76, 62, 55};
			Scanner sc = new Scanner(System.in);
			for(;;) {
				System.out.print("과목이름>>");
				String s = sc.nextLine();
				for(int i=0;i<course.length;i++) {					
					if(s.equals(course[i])) {						
						System.out.println(course[i]+"의 점수는" + score[i]);
						break;
					}else {
						if(i==course.length-1)
							System.out.println("없는 과목입니다.");
						else
							continue;
						
					}
				}
			}*/
		
		
		/* 15
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			}catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
				continue;
			}
		}while(true);
		sc.close();*/
		/*	16.
		  Scanner sc = new Scanner(System.in);
		 
		String com[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true){
			System.out.print("가위 바위 보!!>>");
			String a = sc.nextLine();
			if(a.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int n = (int)(Math.random()*3);
			String b = com[n];
			System.out.print("사용자 = " + a + ", 컴퓨터 = " + b + ", ");
			if(a.equals("가위")) {
				if(b.equals("가위"))
					System.out.println("비겼습니다.");
				else if(b.equals("바위"))
					System.out.println("사용자가 졌습니다.");
				else if(b.equals("보"))
					System.out.println("사용자가 이겼습니다.");
			}
			else if(a.equals("바위")) {
				if(b.equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if(b.equals("바위"))
					System.out.println("비겼습니다.");
				else if(b.equals("보"))
					System.out.println("사용자가 졌습니다.");
					
			}
			else if(a.equals("보")) {
				if(b.equals("가위"))
					System.out.println("사용자가 졌습니다.");
				else if(b.equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else if(b.equals("보"))
					System.out.println("비겼습니다.");
			}else
				System.out.println("다시하세요.");
		}*/
			
				
	}

}

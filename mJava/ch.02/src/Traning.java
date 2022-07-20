import java.util.Scanner;

public class Traning {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
    	
    	
 
			 		
		
		/* 1.
		 	int kw;
		 	int ud;
		 	double rate = 1100.0;
		 	System.out.print("원화를 입력하세요(단위 원)>>");
		 	kw = sc.nextInt();
		 	ud = kw / rate;
		 	System.out.println(kw + "원은 $" + ud + "입니다");
		 */
	 	/* 2.
	 	 	int num;
	 	 	System.out.print("2자리수 정수 입력(10~99)>>");
	 	 	num = sc.nextInt();
	 	 	if(num/10==num%10)
	 	 		System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");	 	 	
	 	 */
	 	/* 3.
	 	  	int money;
	 	  	int _50000, _10000, _5000, _1000, _500, _100, _50, _10, _1;
	 	  	System.out.print("금액을 입력하시오>>");
	 	  	money = sc.nextInt();
	 	  	_50000 = money/50000;
	 	  	_10000 = (money%50000)/10000;
	 	  	_5000 = ((money%50000)%10000)/5000;
	 	  	_1000 = (((money%50000)%10000)%5000)/1000;
	 	  	_500 = ((((money%50000)%10000)%5000)%1000)/500;
	 	  	_100 = (((((money%50000)%10000)%5000)%1000)%500)/100;
	 	  	_50 = ((((((money%50000)%10000)%5000)%1000)%500)%100)/50;
	 	  	_10 = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)/10;
	 	  	_1 = money %10;	 	  	
	 	  	System.out.println("오만원권" + _50000 "매");
	 	  	System.out.println("만원권" + _10000 "매");
	 	  	System.out.println("오천원권" + _5000 "매");
	 	  	System.out.println("천원권" + _1000 "매");
	 	  	System.out.println("500원" + _500 "개");
	 	  	System.out.println("100원" + _100 "개");
	 	  	System.out.println("50원" + _50 "개");
	 	  	System.out.println("10원" + _10 "개");
	 	  	System.out.println("1원" + _1 "개");	 	
	 	 */
	 	/* 4.
	 	 	int a, b, c, mid
	 	 	System.out.print("정수 3개 입력>>");
	 	 	a=sc.nextInt();
	 	 	b=sc.nextInt();
	 	 	c=sc.nextInt();
	 	 	if(a>b&&a<c)
	 	 		mid = a;
	 	 	else if(b>a&&b<c)
	 	 		mid = b;
	 	 	else if(c>b&&c<a)
	 	 		mid = c;
	 	 	System.out.print("중간 값은 " + mid);
	 	 */
	 	/* 5.
	 	 	int a, b, c;
	 	 	a=sc.nextInt();
	 	 	b=sc.nextInt();
	 	 	c=sc.nextInt();
	 	 	if(a>b&&a>c)
	 	 		if(a<b+c)
	 	 			System.out.print("삼각형이 됩니다.");
	 	 	if(b>a&&b>c)
	 	 		if(b<a+c)
	 	 			System.out.print("삼각형이 됩니다.");
	 	 	if(c>a&&a>b)
	 	 		if(c<a+b)
	 	 			System.out.print("삼각형이 됩니다.");
	 	 */
 	 	/* 6.
 	 	 	int num, num10, num1;
 	 	 	int count=0;
 	 	 	System.out.print("1~99사이의 정수를 입력하시오>>");
 	 	 	num=sc.nextInt();
 	 	 	num10 = num/10;
 	 	 	num1 = num%10;
 	 	 	if(num10%3==0)
 	 	 		count++;
 	 	 	if(num1%3==0)
 	 	 		count++;
 	 	 	if(count == 2)
 	 	 		System.out.println("박수짝짝");
 	 	 	if(count == 1)
 	 	 		System.out.println("박수짝");
 	 	  
 	 	 */
	 	 /* 7.
	 	  	int x,y;
	 	  	System.out.println("점 (x,y)의 좌표를 입력하시오>>");
	 	  	x=sc.nextInt();
	 	  	y=sc.nextInt();
	 	  	if(((x>100) && (x<200)) && ((y>100) && (y<200)))
	 	  	System.out.println("("+ x +","+ y +")는 사각형 안에 있습니다.");
	 	  	
	 	  */
	 	/* 8.
	 	 	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
	 	 		if((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2))
	 	 			return true;
	 	 		else return false;
	 	 	}
	 		Scanner sc = new Scanner(System.in);
		int x,y;
		int xa=100, ya=100, xb=200, yb=200;
 		int x1,y1,x2,y2;
 		x1=sc.nextInt();
 		y1=sc.nextInt();
 		x2=sc.nextInt();
 		y2=sc.nextInt();
 		x= xa; y = ya;
 		while(x<=xb) {
 			while(y<=yb) {
 				if(inRect(x,y,x1,y1,x2,y2)) {
 					System.out.println("점 " + x +"," + y + "에서 충돌합니다");
 					break;
 				}
 				y++;
 			}
 			y = ya;
 			x++;
 		}
 		System.out.println();
	 		
	 	 */
 		
 		/* 
 			9.
 			double rx,ry, r,r2;
		double dx,dy;
		System.out.print("원의 중심과 반지름 입력>>");
		rx=sc.nextDouble();
		ry=sc.nextDouble();
		r=sc.nextDouble();
		System.out.print("점 입력>>");
		dx=sc.nextDouble();
		dy=sc.nextDouble();
		
		r2 = (dx-rx)*(dx-rx) + (dy-ry)*(dy-ry);
				
		if(Math.sqrt(r2)<=r)
			System.out.println("점 (" + dx + ", " + dy + ")는 원 안에 있다.");
		else 
			System.out.println("점 (" + dx + ", " + dy + ")는 원 안에 없다.");
 		 */
		/* 10.
			double rx,ry, r1;
			double dx,dy, r2;
			double d;
			
			System.out.print("첫번째 원의 중심과 반지름 입력>>");
			rx=sc.nextDouble();
			ry=sc.nextDouble();
			r1=sc.nextDouble();
			System.out.print("두번째 원의 중심과 반지름 입력>>");
			dx=sc.nextDouble();
			dy=sc.nextDouble();
			r2=sc.nextDouble();
			
			d = (dx-rx)*(dx-rx) + (dy-ry)*(dy-ry);
			if(Math.sqrt(d1)<= (r1+r2))
				System.out.println("두 원은 서로 곂친다.");
			else 
				System.out.println("두 원은 서로 곂치지 않는다.");
		 */
		/* 11.
		    int month;
	 		System.out.print("달을 입력하세요(1~12)>>");
		    if((month||12)||(month||1)||(month||2))
		    	System.out.println("겨울");
		    else if((month||3)||(month||4)||(month||5))
		    	System.out.println("봄");
		    else if((month||6)||(month||7)||(month||8))
		    	System.out.println("여름");
		    else if((month||9)||(month||10)||(month||11))
		    	System.out.println("가을");
		    else
		    	System.out.println("잘못입력");
		    
		    
		 //   
		 	int month;
	 	System.out.print("달을 입력하세요(1~12)>>");
	 	month = sc.nextInt();
	 	switch(month){
	 	case 12: case 1: case 2:
	 		System.out.println("겨울");
	 		break;
	 	case 3: case 4: case 5:
	 		System.out.println("봄");
	 		break;
	 	case 6: case 7: case 8:
	 		System.out.println("여름");
	 		break;
	 	case 9: case 10: case 11:
	 	 	System.out.println("가을");
	 		break;
	 	default:
	 		System.out.println("잘못입력");
	 	}	
		 */
	    	
	    /*  12.
	     	String a, b, ans;
     	String c;
     	
     	System.out.print("연산>>");
    	a = sc.nextDouble();
    	c =  sc.next();
    	b = sc.nextDouble();
    	
    	if(c.equals("+")) {
    		ans = a+b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
    	}else if(c.equals("-")) {
    		ans = a-b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
    	}else if(c.equals("*")) {
    		ans = a*b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
		}else if(c.equals("/")){
    		if(b==0)
    			System.out.println("0으로 나눌 수 없습니다.");
    		ans =  a/b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
		}else
    		System.out.println("올바른 기호를 사용하세요.");
    	
    	switch(c) {
    	case "+":
    		ans = a+b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
    		break;
    	case "-":
    		ans = a-b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
    		break;
    	case "*":
    		ans = a*b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
    		break;
    	case "/":
    		if(b==0) {
    			System.out.println("0으로 나눌 수 없습니다.");
    			break;
    		}
    		ans =  a/b;
    		System.out.println(a+c+b+"의 계산 결과는" + ans);
    		break;    		
    	default:
    		System.out.println("올바른 기호를 사용하세요.");
    	}
	    	
	     */
		sc.close();
	}

}

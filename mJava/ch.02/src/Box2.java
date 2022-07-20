import java.util.Scanner;

public class Box2 {

	public static void main(String[] args) {
		double w1,w2,h,area;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사다리꼴의 윗변의 길이: ");
		w1=input.nextDouble();
		System.out.print("사다리꼴의 아랫변의 길이: ");
		w2=input.nextDouble();
		System.out.print("사다리꼴의 높이: ");
		h=input.nextDouble();
		area = (w1+w2)*h/2;		
		
		System.out.println("사다리꼴의 넓이는 " + area);
		
		input.close();
	}

}

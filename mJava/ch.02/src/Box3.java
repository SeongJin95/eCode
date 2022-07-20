import java.util.Scanner;

public class Box3 {

	public static void main(String[] args) {
		double w,h,area;		
		Scanner input = new Scanner(System.in);
		
		System.out.print("삼각형의 밑변의 길이: ");
		w=input.nextDouble();
		System.out.print("삼각형의 높이: ");
		h=input.nextDouble();
		area = w*h/2;		
		
		System.out.println("삼각형의 넓이는 " + area);
		
		input.close();
	}

}

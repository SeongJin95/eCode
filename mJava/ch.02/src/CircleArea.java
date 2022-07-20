import java.io.*;
//import java.util.*;

public class CircleArea {

	public static void main(String[] args) throws IOException {
		final double PI = 3.14; //원주율을 상수로 선언
				
		double radius = 10.0; //원의 반지름
		double circleArea = radius*radius*PI; //원의 면적 계산
		
		/*
		Scanner scanner = new Scanner(System.in);
		int ra = Integer.parseInt(scanner.nextLine());		
		double circleArea = ra*ra*PI;
		*/		
		//원의 면적을 화면에 출력한
		System.out.println("원의 면적 = " + circleArea);
	}

}

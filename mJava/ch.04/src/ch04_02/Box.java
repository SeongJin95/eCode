package ch04_02;

import java.util.Scanner;

public class Box {

	int width;
	int height;
	int length;
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); 
		Scanner sc = new Scanner(System.in);
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
	}

}

package Practice;

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")" + radius);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, , radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		//for(int i=0;i<c.length;i++)
		//	c[i].show();
		Circle circle = c[0];
		for(int i=0;i<c.length;i++) {
			if(circle.getRadius()<c[i].getRadius())
				circle = c[i];
		}
		
		System.out.println("가장 면적이 큰 원은 ("+ circle.getX()+","+circle.getY()+")" + circle.getRadius());	
		
		sc.close();	
		/*
		 	3.0 3.0 5
			2.5 2.7 6
			5.0 2.0 4
		 */

	}

}

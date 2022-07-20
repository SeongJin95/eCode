package Exercise;
/*
11.
public class Shape {
	public void draw() {System.out.println("Shape");}
}
class Circle extends Shape{
	public void paint() {
		
	}
	public void draw() {
		System.out.println("Circle");
	}
}
// 1) Circle 2) draw(); 3) super.draw();
 */
 

abstract class Shape {
	public void paint() {
		draw();
	}
	abstract public void draw();
	
}
class Circle extends Shape{
	private int radius;
	public Circle(int radius) {this.radius = radius;}
	double getArea() {
		return 3.14*radius*radius;
	}
	public void draw() {
		System.out.println("반지름: " + radius);
	}
}

public class ShapeTest{
	public static void main(String args[]) {

	Shape s;
	//Shape s = new Shape();
	Circle c = new Circle(10);
	c.paint();
	}
}

//14. 4)
//15. 2)

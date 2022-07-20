package Practice;
// 5, 6, 7, 8
class Point{
	private int x, y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x;this.y=y;}
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(0,0);
		color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
		color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {return color;}
	public String toString(){
		return getColor() + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}

class Point3D extends Point{
	private int z;	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {return z;}
	public void moveUp() {
		this.z = z+1;
	}
	public void moveDown() {
		this.z = z-1;
	}
	protected void move(int x, int y, int z) {
		move(x,y);
		this.z=z;
	}
	public String toString(){
		return "(" + getX() + "," + getY() + "," + getZ() + ")의 점";
	}
}

class PositivePoint extends Point{
	public PositivePoint() {
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(0,0);
		move(x,y);
	}

	@Override
	public void move(int x, int y) {
		if(x>0 && y>0)
			super.move(x,y);				
	}

	public String toString(){
		return "(" + getX() + "," + getY() + ")의 점";
	}
}

public class PointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp2 = new ColorPoint(10,10);
		cp2.setXY(5,5);
		cp2.setColor("RED");
		System.out.println(cp2.toString()+"입니다.");
		
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint();
		p2.move(10,10);
		System.out.println(p2.toString() + "입니다.");
		
		p2.move(-5,5);
		System.out.println(p2.toString() + "입니다.");
		
		PositivePoint p3 = new PositivePoint(-10, -10);
		System.out.println(p3.toString() + "입니다.");
	}

}

package ch06_04;

class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {	//equals() 오버라이딩
		Rect p = (Rect)obj;	// obj를 Point 타입으로 다운 캐스팅
		if(width*height == p.width*p.height) return true;
		else return false;
	}
	
}

public class RectEqualsEx {

	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b))	System.out.println("a is equals to b");
		if(a.equals(c))	System.out.println("a is equals to c");
		if(b.equals(c))	System.out.println("b is equals to c");
	}

}

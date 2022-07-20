package ch04_09;

public class BoxTest2 {

	public static void main(String[] args) {
		Box2 obj1 = new Box2(10, 20, 50);
		Box2 obj2 = new Box2(10, 30, 30);
		
		Box2 largest = obj1.whosLargest(obj1, obj2);
		System.out.println("(" + largest.width + "," + largest.length + "," + largest.height + ")");
	}

}

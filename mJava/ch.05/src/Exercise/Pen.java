package Exercise;

public class Pen {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class SharpPencil extends Pen{
	private int width;
}

class BallPen extends Pen{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}

class FountainPen extends BallPen{
	public void refill(int n) {
		setAmount(n);
	}
}
//4. 서브 클래스, extends, super, instanceof, interface
//5. 2)슈퍼 클래스의 디폴트 멤버는 다른 패키지에 있는 서브클래스에서도 접근 가능
//6. extends, super(size);
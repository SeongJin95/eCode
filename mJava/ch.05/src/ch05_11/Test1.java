package ch05_11;

public class Test1 {
	private int a;
	private int b;
	protected int c;
	
	public int getA() {
		return a;	
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test1 [a="+a+", b="+b+", getA()="+getA()+", getB="+getB() +"]";
	}
}

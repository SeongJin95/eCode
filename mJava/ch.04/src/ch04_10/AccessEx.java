package ch04_10;

class Sample{
	public int a;
	private int b;
	int c;//디폴트
	public void setb(int a) {
		this.b = a;
	}
}

public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;
		sample.setb(10);
		sample.c = 10;
		
	}

}

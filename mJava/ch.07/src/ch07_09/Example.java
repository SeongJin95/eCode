package ch07_09;

class JGeneric<W>{
	private W x, y;
	
	public JGeneric(W x, W y) {
		this.x = x;
		this.y = y;
	}
	
	public W first() {
		return x;
	}
	public W second() {
		return y;
	}
	public boolean equal() {
		return x.equals(y);
	}
}

public class Example {

	public static void main(String[] args) {
		JGeneric<String> js = new JGeneric<String>("hello", "hellu");
		System.out.println(js.first());
		System.out.println(js.second());
		System.out.println(js.equal());
	}

}

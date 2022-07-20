package Practice;

class TV {
	private String name;
	private int year;
	private int length;
	
	public TV(String name, int year, int length){
		this.name = name;
		this.year = year;
		this.length = length;
	}
	
	public void show() {
		System.out.println(this.name + "에서 만든 " + this.year +"년형 " + this.length + "인치 TV");
	}
}

public class tr01 {

	public static void main(String[] args) {
			TV myTv = new TV("LG", 2017, 32);
			myTv.show();
	}

}


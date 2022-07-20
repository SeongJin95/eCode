package Practice;
// 3, 4
import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;	//비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
	}
}

class Won2Dollar extends Converter{
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	@Override
	public double convert(double src) {
		return src/ratio;		
	}
	@Override
	public String getSrcString() {
		return "원";	
	}
	@Override
	public String getDestString() {
		return "달러";
	}
}

class Km2Mile extends Converter{
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	@Override
	public double convert(double src) {
		return src/ratio;		
	}
	@Override
	public String getSrcString() {
		return "Km";	
	}
	@Override
	public String getDestString() {
		return "mile";
	}
}

public class ConverterTest {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
		Km2Mile km2Mile = new Km2Mile(1.6);
		km2Mile.run();
	}

}

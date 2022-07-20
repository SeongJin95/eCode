
//국영수 점수 값을 입력 받아서 총점과 평균 계산
import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sum, avg;
		int kor, eng, mat;

		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		mat = sc.nextInt();

		sum = (kor + eng + mat);
		avg = sum / 3.0;
		

		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.printf("평균: %5.3f", avg);

		sc.close();
	}

}

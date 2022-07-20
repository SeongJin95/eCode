package ch04_06;

class Circle {
	int radius;							//원의 반지름 필드
	String name;						//원의 이름 필드
		
	public Circle(int radius) {	//매개 변수를 가진 생성자
		this.radius = radius;		//매개 변수로 필드 초기화
	}
	public double getArea() {			//원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
}
public class CircleArray {

	public static void main(String[] args) {
		Circle[] c;	//Circle 배열에 대한 레퍼런스 c 선언
		c = new Circle[5];	//5개의 레퍼런스 배열 생성

		for(int i=0;i<c.length;i++)		//배열의 개수 만큼
			c[i] = new Circle(i);		//i 번째 원소 객체 생성
		
		
		for(int i=0;i<c.length;i++)
			System.out.println((int)(c[i].getArea())+" ");
		

	}
	
}

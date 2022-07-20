package ch05_08;

public class SamsungPhone implements PhoneInterface {	//인터페이스 구현
	//모든 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}

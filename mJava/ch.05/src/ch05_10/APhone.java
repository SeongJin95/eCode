package ch05_10;

public class APhone implements IFunction{

	@Override
	public void callSenderReceive() {
		System.out.println("가능 합니다");
	}

	@Override
	public void canLTE() {
		System.out.println("불가능 합니다. 3G 입니다.");
	}

	@Override
	public void tvRemoteController() {
		System.out.println("미탑재 되어 있습니다.");
	}
	
}

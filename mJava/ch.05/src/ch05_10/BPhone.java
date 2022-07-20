package ch05_10;

public class BPhone implements IFunction{

	@Override
	public void callSenderReceive() {
		System.out.println("가능 합니다");
	}

	@Override
	public void canLTE() {
		System.out.println("가능 합니다. 4G 입니다.");
	}

	@Override
	public void tvRemoteController() {
		System.out.println("탑재 되어 있습니다.");
	}
	
}

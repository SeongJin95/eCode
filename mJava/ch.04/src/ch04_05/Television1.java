package ch04_05;

public class Television1 {
	int channel;
	int volume;
	boolean onOff;	
	
	public static void main(String[] args) {
		Television1 myTv = new Television1();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		
		Television1 yourTv = new Television1();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔리비전의 채널은" + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
		System.out.println("나의 텔리비전의 채널은" + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
	}

}

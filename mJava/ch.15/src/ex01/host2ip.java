package ex01;

import java.io.IOException;
import java.net.*;

public class host2ip {

	public static void main(String[] args) throws IOException {
		String hostname = "www.daum.net";
		
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP 주소: " + address.getHostAddress());
		}catch(UnknownHostException e) {
			System.out.println(hostname + "의 주소를 찾을 수 없습니다.");
		}
	}
}

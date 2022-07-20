package ex01;

import java.net.*;

public class ParseURL {

	public static void main(String[] args) {
		URL homePage = null;
		try {
			homePage = new URL("http://www.mrhi.or.kr:80/sub/?ctld=1");
		}catch(MalformedURLException e) {
			System.out.println("잘못된 URL입니다");
		}
		System.out.println("protocol="+homePage.getProtocol());
		System.out.println("host="+homePage.getHost());
		System.out.println("port="+homePage.getPort());
		System.out.println("path="+homePage.getPath());
		System.out.println("filename="+homePage.getFile());
		
	}

}

package ch06_09;

import java.util.StringTokenizer;

public class StrToken {

	public static void main(String[] args) {
		String str = "apple,banana,grape,melon";
		String[] items = str.split(",");
		//for(개별변수:배열)
		for(String s : items) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str,",");
		int cnt = st.countTokens();
		System.out.println("토큰의 갯수:" + cnt);
		while(st.hasMoreElements()) {	//다음요소가 있으면 다음 요소로 이동
			System.out.println(st.nextToken());
		}
	}

}

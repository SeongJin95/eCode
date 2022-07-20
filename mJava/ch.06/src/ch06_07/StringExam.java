package ch06_07;

public class StringExam {

	public static void main(String[] args) {
		String str = "hello";
		String str2 = "hello";
		//A=B대입, A==B비교
		System.out.println(str==str2);
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3==str4);//주소값 비교
		//A.equals(B)
		System.out.println(str3.equals(str4));//내용 비교
		System.out.println(str4.equals(str3));
	}

}

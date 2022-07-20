package ch06_12;

public class StringEx5 {

	public static void main(String[] args) {
		String jumin = "911231-1234567";
		//문자열.substring(start, end-1)
		int year = 1900+Integer.parseInt(jumin.substring(0,2));
		System.out.println("출생년도: " + year);
		String gender = jumin.substring(7,8);
		System.out.println(gender);
		//A==B 주소값 비교, A.equals(B) 내용 비교
		if(gender.equals("1")||gender.equals("3")) {
			 System.out.println("남성");
		}else if (gender.equals("2")||gender.equals("4")) {
			System.out.println("여성");
		}
		
	}

}

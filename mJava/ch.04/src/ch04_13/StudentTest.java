package ch04_13;

public class StudentTest {

	public static void main(String[] args) {
		Student obj1 = new Student();
		System.out.println(obj1);
		
		Student obj2 = new Student(111, "Kim", 25);
		System.out.println(obj2);
		
		Student obj3 = new Student(123, "Lee");
		System.out.println(obj3);
	}

}

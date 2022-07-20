package ch07_09;

public class OrderedPairTest {

	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = new OrderedPair<>("mykey", 12345678);
		OrderedPair<String, String> p2 = new OrderedPair<>("java", "a programming");
		OrderedPair<Integer, Integer> p3 = new OrderedPair<>(10, 20);
		
		System.out.println(p1.getKey() + " " + p1.getValue());
		System.out.println(p2.getKey() + " " + p2.getValue());
		System.out.println(p3.getKey() + " " + p3.getValue());

	}

}

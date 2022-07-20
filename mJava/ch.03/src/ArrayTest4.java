
public class ArrayTest4 {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30, 40, 50};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
			System.out.print(scores[i] + " ");
		}
		System.out.print("합: " + sum);
	}

}

package Exercise;

import java.util.StringTokenizer;

public class Example {

	public static void main(String[] args) {		
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6",",=");
		int sum = 0;
		int n = 1;
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			if(n%2==0)
				sum += Integer.parseInt(token);
			n++;
			
			/*try {
				sum += Integer.parseInt(token);
				System.out.println(token);
			}
			catch(NumberFormatException e) {
				System.out.println(token);
			}*/
		}
		System.out.println("합은 " + sum);
	}

}

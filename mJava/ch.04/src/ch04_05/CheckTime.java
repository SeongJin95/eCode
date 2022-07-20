package ch04_05;

public class CheckTime {
	void getSum(double check[]) {
		double sum = 0;
		for(int i=0;i<check.length;i++)
			sum += check[i];
		System.out.println("배열의 합은 " + sum);
	}
	
	static void main(String[] args) {
		
		CheckTime ct = new CheckTime();
		double Check[] = {1,2,3,4,5,6,7,8,9,10};
		ct.getSum(Check);
		System.out.println("배열의 합은 " );
	}

}

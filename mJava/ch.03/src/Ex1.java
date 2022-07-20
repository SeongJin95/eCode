
public class Ex1 {

	public static void main(String[] args) {
		/*for(int i=0;i<10;i+=2)
			System.out.print(i+" ");
		2. 3
		3. continue;
		4. i>50
		5. 4
		6. 4
		7. char[] ch = new char[10];
		   int[] n = {1,2,3,4,5};
		   char[] day = {'일','월','화','수','목','금','토'};
		8. boolean[] b = new boolean[4];	b[1] = {true, false, false, true};
		   double d[][] = new double[5][4];
		   int val[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12};
		9. int myArray[] = new int[2];
			myArray[0] = 1;
			myArray[1] = myArray[0]+1;
		10. (1) (int i=0; i<alpha.length;i++) (2) for (char c : alpha)
		11. 1 3 1 4 2
		12. double[][] n = {{1.1,1.2,1.2,1.4},{2.1,2.2},{3.1,3.2,1.2},{4.1}};
		13. 1
		14. JVM, 예외, 바로 종료, try, catch, finally 
			*/
		int sum = 0, i=1;
		while(true) {
			if(i>50) break;
			sum+=i;
			i++;
		}
		System.out.print(sum);
		
	}

}

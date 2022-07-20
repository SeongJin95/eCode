
public class Star5DoWhile {

	public static void main(String[] args) {
		int i=5;
		 do{
			int j=0;
			while(j++<i)
				System.out.print("*");
			System.out.println();
			i--;
		}while(i>0);
	}

}

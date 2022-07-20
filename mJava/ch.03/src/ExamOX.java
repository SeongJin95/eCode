
public class ExamOX {

	public static void main(String[] args) {
			int n=5;
			for(int i= 0;i<n;i++) {
				for(int j=i;j<5+i;j++) {
					if(j%2==0)
						System.out.print("O");
					else
						System.out.print("X");								
				}
				System.out.println();	
			}
		

	}

}

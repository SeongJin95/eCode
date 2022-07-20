
public class Star8 {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=(i*2);k++) {
				System.out.print("*");
			} 
			System.out.println();
		}
			

	}

}

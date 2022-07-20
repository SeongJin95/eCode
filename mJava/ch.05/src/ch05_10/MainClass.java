package ch05_10;

public class MainClass {
	public static void main(String[] args) {
		APhone aPhone = new APhone();
		BPhone bPhone = new BPhone();
		CPhone cPhone = new CPhone();
		DPhone dPhone = new DPhone();
		
		IFunction[] iFunctions = {aPhone, bPhone, cPhone,dPhone};
		
		for(int i=0;i<iFunctions.length;i++) {
			System.out.println(iFunctions[i].getClass());
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLTE();
			iFunctions[i].tvRemoteController();
			System.out.println("=================================");
		}
	}	
}

package Ex;

public class Ex {
	// 1. 	4 필드는 클래스 내에서 public 보다 private으로 선언하는 것이 바람직하다.
	// 2. 	3 this()는 클래서 내에서 다른 생성자를 호출하는 코드이다
	// 3. 	3 
	// 4. 	2 Book의 레퍼런스 10개
	// 5. 	1 메소드 이름과 매개변수 타입밑 갯수가 같다
	// 6. 	(1) TV(){TV(32,"LG")} TV(String manufacturer){TV(32,manufacturer)}
	//		(2) 32인치 LG, 32인치 삼성
	//		(3) TV(65,"삼성")
	//		(4) 생성자 작성 간결
	// 7.	Person 내부에 age값에 접근하는 메소드를 만든다
	// 8.	 
	/*		class Power{
	 			private int kick;
	 			private int punch;
	 			public Power(int kick, int punch){
		 			this.kick = kick; 
		 			this.punch = punch;
	 			}
	 			public void setRobot(int kick, int punch){
	 				this.kick = kick;
	 				this.punch = punch;
	 			}
	 		}
	 		public class Example{
	 			(1)Power robot = new Power(10,20);
	 			(2)Power robot = new Power();
	 			setRobot(10,20);
	 		}	 			
	 */
	// 9.	소멸시킬, 다행한, 가비지, 가비지 컬렉션, System.gc()
	// 10. 	n=1부터 9까지 변할때 이전에 생성한 Hello+n이 가비지가 된다, 생성했던 aa를 c가 가르키고 있기에 가비지가 발생하지 않는다
	// 11. 	4 static은 non-static을 사용할 수 없다.
	// 12.	non-static인 x는 객체 생성 없이 직접 접근이 불가능하다
	// 13.	메소드 f를 static으로 수정해야 한다.
	// 14.	x가 final이므로 메소드 f()에서 x값의 변화는 불가능, 
	// 15. 	가비지가 차지하는 메모리를 회수 하여 가용 메모리 증가, 수행되는 시점을 알 수 없고 오버헤드를 일으켜 성능저하
	// 16. 	O X O X X X
	
	
}

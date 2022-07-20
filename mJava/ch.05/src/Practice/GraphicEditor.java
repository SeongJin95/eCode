package Practice;

import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}	//링크 연결
	public Shape getNext() {return next;}
	public abstract void draw();
	
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
	
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
	
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}

class Editor{
   
   private Shape head;
   private Shape tail;
   
   public Editor(){
       this.head = null;
       this.tail = null;
   }
   
   public void Insert(int insert) {
       Shape obj = null;
       switch(insert) {
       case 1:
           obj = new Line();
           break;
       case 2:
           obj = new Rect();
           break;
       case 3:
           obj = new Circle();
           break;
       default:
           System.out.println("잘못 된 값을 입력하셨습니다.");
           break;
       }
       if (head==null) {
           head = obj;
           tail = obj;
       }
       else {
           tail.setNext(obj);
           tail = obj;
       }
   }

   public void Delete(int del) {
       Shape objHead = head;
       Shape objTail = tail;
       Shape objReverse = head;
       
       try {
           if(objHead==null) {
               System.out.println("삭제할 수 없습니다.");
               return;
           }
           
           if (del<1) {
               System.out.println("잘못된 값을 입력하셨습니다.");
               return;
           }else if(del==1) {
               if(head==tail){
                   objHead = null;
                   objTail = null;
                   }
               else {
                   head=head.getNext();
                   return;
                   }
           }
           
           if(del>1) {
               if(objHead!=null) {
                   for(int i=1;i<del;i++){
                       objReverse = objHead;
                       objHead = objHead.getNext();
                   }
               }
               if(objHead==objTail) {
                   tail=objReverse;
                   tail.setNext(null);
               }else {
                   objReverse.setNext(objHead.getNext());
               }    
           }
       }catch(NullPointerException e){
           System.out.println("삭제할 수 없습니다.");
       }
   }

   public void printAll() {
       Shape obj = head;
       while(obj != null){
           obj.draw();
           obj = obj.getNext();
       }
   }
}

public class GraphicEditor {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		for(;;) {
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
		int n = sc.nextInt();
		
		if(n==1) {
			System.out.print("Line(1), Rect(2), Circle(3)>>");
			n = sc.nextInt();
			if(n==1);
			else if(n==2);
			else if(n==3);
			else;
		}		
		else if(n==2) {
			System.out.print("삭제할 도형의 위치>>");
			System.out.println("삭제할 수 없습니다.");
		}		
		else if(n==3) {
			System.out.print("삭제할 도형의 위치>>");
			System.out.println("삭제할 수 없습니다.");
		}		
		else if(n==4) {
			System.out.println("beauty을 종료합니다.");
			sc.close();
			break;
		}		
		else
			System.out.println("1~4중에서 입력하세요.");;
		}
			
	}

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		ge.run();
	}

}

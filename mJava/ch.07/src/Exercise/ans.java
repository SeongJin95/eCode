package Exercise;

import java.util.ArrayList;

public class ans {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(10);
	 	 a.add("Java");
	 	 a.add(0, "C++");
	 	 System.out.println(a.size());
	 	 a.remove(a.size()-1);
	}
}

//1. 3 wrapper사용하면 가능
//2. 일반화, 제네릭, 타입 매개변수, 구체화, 템플릿
//3. 2 초기값이 30이지만 유동적으로 변함
/*4. (1) Vector<String> sv = new Vector<String>();
	 (2) HashMap<String, Double> h = new HashMap<String, Double>();
	 (3) ArrayList<Person> pa = new ArrayList<Person>(10);
	 (4) HashMap<String, Integer> pop = new HashMap<String, Integer>();
*/
//5. 1
//6. v.add(3.14); double d = v.get(0);
//7. 3 > 12 2배씩 늘린다
/*8. new ArrayList<String>(10);
 	 a.add("Java");
 	 a.add(0, "C++");
 	 System.out.println(a.size());
 	 a.remove(a.size()-1);
*/
/*9. Iterator<Integer> iterator = v.iterator();
	 while(iterator.hasNext()){
	 	System.out.print(iterator.next() + " ");
	 }
	 
*/
/*10. public static int func(HashMap<String, Integer> map){
 		return map.size();
 	  }
	
*/
/*11. (1)1개 W
      (2)JGeneric<String> js = new JGeneric<String>("hello", "hellw");
      (3)public String first(){return x;}
      (4)public String first(){return y;}
      (5)public boolean equal(){return x.equals(y)}
      (6)System.out.println(js.first());
  		
  
*/
//12

class Foo1 {

public int a = 3;

public void addFive() {

a += 5;

System.out.print("Foo1 : "+ a + " " );

}

}

 

class Bar extends Foo1 {

public int a = 8;

public void addFive() {

this.a += 5;

System.out.print("Bar : "+ a + " " );

}

}

 

public class MeInTest1 {

public static void main(String [] args) {

Foo1 f = new Bar();

f.addFive();

System.out.print(f.a + " " );

Bar b = (Bar) f;

System.out.println(b.a);

}

}
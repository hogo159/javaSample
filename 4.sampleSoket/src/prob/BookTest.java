package prob;
class A{}
class B extends A{}
class C extends B{}

public class BookTest {
	public static void main(String[] args) {
		A oa =new B();
		A oc =new C();
		
		
		
		if(oa instanceof A) System.out.println( "A");
		if(oc instanceof B) System.out.println( "B");
		if(oa instanceof C) System.out.println( "C");
	}

}

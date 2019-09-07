package Java.OOPS;

public class C4 extends C2 {
	void m1()
	{
		System.out.println("m1 executed");
	}
	
	public static void main(String[] args) {
		C2 obj1 = new C2(); // we can use add,sub methods
		C3 obj2 = new C3(); // we can use add, sub, mul,div methods
		C4 obj3 = new C4(); // we can use add,sub,mul,div and m1 methods
		
		C3 obj4 = new C2(); // we can call only C1 methods
		//C2 obj5 = new C3(); not accepted
	}
}

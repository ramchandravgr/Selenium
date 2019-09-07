package Java.OOPS;

public class StaticVariables {

	int a=1;
	static int b=1;
	
	
	
	public int add() {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		StaticVariables obj1 = new StaticVariables();
		System.out.println(obj1.a);
		System.out.println(b);
		System.out.println(obj1.add());
		
		obj1.a = 20;
		StaticVariables.b = 30;
		System.out.println(obj1.a);
		System.out.println(b);
		System.out.println(obj1.add());
		
		StaticVariables obj2 = new StaticVariables();
		System.out.println(obj2.a);
		System.out.println(b);
		System.out.println(obj2.add());
	}

}

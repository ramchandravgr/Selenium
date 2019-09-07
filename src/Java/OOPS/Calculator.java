package Java.OOPS;

public class Calculator {

	int a;
	int b;
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void sub()
	{
		System.out.println(a-b);
	}
	
	void mul()
	{
		System.out.println(a*b);
	}
	
	
	public static void main(String args[]) {
		
		Calculator obj1 = new Calculator();
		obj1.a = 10;
		obj1.b = 20;
		obj1.add();
		
		Calculator obj2 = new Calculator();
		obj2.add();
		
	}
	
}

package Java_FinalConcepts;

public class ExceptionsEx1 {

	
	static int x = 1;
	static int y = 0;
	
	static void TC01_Add() {
		System.out.println("Add : "+(x+y));
	}
	
	static void TC02_mul() {
		System.out.println("Mul : "+(x*y));
	}
	
	static void TC03_div() {
		try {
			if(y==0)
				throw new ArithmeticException("cant divide by zero");
			else
			System.out.println("Div : "+(x/y));
		}
		catch(Exception e) {
			System.out.println("Cannot divide by 0");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)  {
		TC01_Add();
		
		TC03_div();
		
		TC02_mul();
		
	}
	
}

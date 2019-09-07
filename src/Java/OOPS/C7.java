package Java.OOPS;

public class C7 extends C6 {

	
	public void add(int x,int y)
	{
		System.out.println("Addition in C7 : "+(x+y));
	}
	
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	
	public void m1() {
		add(10,5); // current/derived class method
		super.add(10,15); //parent class method
		sub(10,5); //it will call parent class method as child class doesnt have sub
	}
	public static void main(String[] args) {
		
		C7 obj = new C7();
		//obj.add(20,10) ; //it will call child class method as derived class method is overriding parent class
		obj.m1();

	}

}

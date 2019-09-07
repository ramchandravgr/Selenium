package Java.OOPS;

public class ConstructorEx1 {

	public int x;
	public int y;
	
	ConstructorEx1(){
		System.out.println("Constructor execution");
	}
	
	ConstructorEx1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void add()
	{
		System.out.println(x+y);
	}
	public void sub() {
		System.out.println(x-y);
	}
	
	public void mul()
	{
		System.out.println(x*y);
	}
	public void div()
	{
		System.out.println(x/y);
	}
	
	
	public static void main(String[] args) {
				
		ConstructorEx1 obj1 = new ConstructorEx1();
		obj1.add();
		ConstructorEx1 obj2 = new ConstructorEx1(30,50);
		obj2.add();
	}

}

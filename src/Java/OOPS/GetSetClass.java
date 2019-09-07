package Java.OOPS;

public class GetSetClass {

		private int a;
		private int b;
		
		public void setval(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
		
		public int getval()
		{
			return a+b;
		}
		
		public static void main(String[] args)
		{
			GetSetClass obj = new GetSetClass();
			obj.setval(20, 30);
			int retval = obj.getval();
			System.out.println(retval);
		}
}


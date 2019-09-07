package JavaBasics;

public class PrimeNumListEx {

	public static void main(String[] args) {
		
		
		for(int n=1;n<=50;n++)
		{
		int counter=0;
		
		for(int i=2;i<=n/2;i++)
		{
			if (n % i == 0)
			{
				counter++;
			}
		}
		if(counter == 0)
			System.out.println(n+" is a prime number");
		}
	}

}

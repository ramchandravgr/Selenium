package JavaBasics;

import java.util.Scanner;



public class PrimeNumEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int counter=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0)
			{
				counter=counter+1;
				break;
			}
		}
		
		if(counter == 0)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");

	}

}

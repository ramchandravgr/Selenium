package JavaBasics;

import java.util.Scanner;

public class MathsTableEx {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		for(int i=1;i<=20;i++)
		{
			System.out.println(n+" X "+i+" = "+ (n*i));
		}

	}

}

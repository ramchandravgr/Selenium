package JavaBasics;

import java.util.Scanner;

public class ArraysExCity2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of cities : ");
		
		int n = sc.nextInt();
		
		String[] city = new String[n];
		
		System.out.println("Enter City names : ");
		for(int i=0;i<n;i++)
			{
			city[i] = sc.next();
			}
		
		for( int i=0; i<n ; i++ )
		{
			System.out.println("Given cities are :" + city[i]);
		}
		
		
		
		

	}

}

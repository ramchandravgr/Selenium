package JavaBasics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		//int num = 11;
		
		Scanner sc = new Scanner(System.in); // Scanner is a Predefined Class used to read the input from the keyboard while execution
		
		System.out.println("Enter number :");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0)
					System.out.println(num + " is even number");
			else
					System.out.println(num + " is odd number");
		//If there is only one line under if statement then we need no use { } braces
	}

}

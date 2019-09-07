package JavaBasics;

public class HighestNumEx {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 100;
		int c = 100;
		
		if ((a > b) && (a > c)) 
			System.out.println("a is greater");
		else if ((b > a) && (b > c))
			System.out.println("b is greater");
		else if ((c > a) && (c > b))
			System.out.println("c is greater");
		else
			System.out.println("Two or more values are same");
	}

}

package Java.OOPS;

public class I10_Sports extends I10_Era {

	public void audio() {
		
	}
	

	public void bluetooth() {
	}
	
	
	
	public static void main(String[] args) {

		// Car obj1 = new Car(); //can't instantiate interface
		// I10_Era obj2 = new I10_Era(); //can't instantiate abstarct class
		
		I10_Sports obj3 = new I10_Sports(); //we can call all methods
		Car obj4 = new I10_Sports(); //we can call all methods except bluetooth and abc methods
		I10_Era obj2 = new I10_Sports(); //we can call all methods except abc methods 
	}

	

}

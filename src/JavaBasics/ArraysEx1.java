package JavaBasics;

public class ArraysEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int n = a.length; //to get the length of the array
		
		for(int i=0; i<n ; i++) 
			System.out.println(a[i]);
		
		int[] ages = {40,55,90,800};
		
		for(int age : ages)
			System.out.println(age);
		
		

	}

}

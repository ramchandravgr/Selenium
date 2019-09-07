package JavaBasics;

public class ArraysEx2 {

	public static void main(String[] args) {

		int [][] a = new int [2][2];
		
		a[0][0] = 5;
		a[0][1] = 4;
		a[1][0] = 3;
		a[1][1]	= 2;
		
		for(int i=0 ; i<2 ; i++)
			for(int j=0 ; j<2 ; j++)
				System.out.println(a[i][j] +"\n");
		
		int [][] B = {{3,6,3},
						{9,3,5}};
		
		for(int i=0 ; i<2 ; i++)
			for(int j=0 ; j<3 ; j++)
				System.out.println(B[i][j]);
		
	}

}

package Java_FinalConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		boolean bTag = false;
		try {
		File file = new File("D:/f10.txt");
		fr = new FileReader(file);
		bTag = true;
		char[] arr = new char[50];
		
		fr.read(arr); //read the content to an array
		
				
		for(int i =0; i<50; i++) {
			System.out.println(arr[i]); //print characters one by one
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found in given path");
		}
		
		catch(IOException e) {
			System.out.println("unable to read/write into the text file");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("length of array being retrived is more");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			if(bTag) {
				fr.close();
			}
		}
	}
}

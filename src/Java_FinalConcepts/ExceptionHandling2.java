package Java_FinalConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling2 {

	static void readtext() throws InterruptedException, IOException 
	{
	File file = new File("D:/f10.txt");
	FileReader fr = new FileReader(file);
	char[] arr = new char[50];
	
	fr.read(arr); //read the content to an array
	
	Thread.sleep(2000);
	
	for(char c : arr) {
		System.out.println(c); //print characters one by one
	}
	
	}
	
	
	public static void main(String[] args) {

	try {
		readtext();
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}
	
	catch (FileNotFoundException ex) {
		// TODO Auto-generated catch block
		System.out.println(ex);
		ex.printStackTrace();
	}
	
	catch (IOException ex) {
		// TODO Auto-generated catch block
		System.out.println(ex);
		ex.printStackTrace();
	}
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}
		
		
	}

}

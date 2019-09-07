package JavaBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpEx2 {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		String Maintxt = "I want to extract the PAN Number as BBEPV5873N, AHSJ3992KJ, DFJKL3829N";
		
		String pattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern ptrn = Pattern.compile(pattern);
		Matcher matches = ptrn.matcher(Maintxt);
		
		int i=0;
		
		while(matches.find())
		{
			System.out.println(matches.group());
			flag = true ;
			i++;
			
		}
		
		if(flag==false)
		{
			System.out.println("PAN not found");
		}
		

	}

}

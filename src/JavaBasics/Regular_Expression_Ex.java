package JavaBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression_Ex {

	public static void main(String[] args) {
		
		String Maintxt = "My Email ids are abc.ujk@jkc.com, ram.123@kkk.com,ikn.ram@tcs.com";
		
		String pattern = "[^abc]{3}\\.[a-z]{3}\\@tcs\\.com";
		
		boolean retval = validateRegEx(Maintxt, pattern);
		if(retval)
			System.out.println("Email ids matched");
		else
			System.out.println("no email id matched");

	}
	
	public static boolean validateRegEx(String Maintxt, String pattern)
	{
		boolean flag = false ;
		Pattern ptrn = Pattern.compile(pattern);
		Matcher matches = ptrn.matcher(Maintxt);
		
		while(matches.find())
		{
			System.out.println(matches.group());
			flag = true ;
		}
		
		return flag;
	}

}

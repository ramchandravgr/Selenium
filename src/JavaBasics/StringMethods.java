package JavaBasics;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Testing Masters";
		int n = str.length();
		System.out.println(n); //output : 15
		
		String str1 = "Testing Masters Technologies";
		str1 = str1.replace("Testing", "QA");
		System.out.println(str1); //output : QA Masters Technologies
		
		String str2 = "Testing Masters Technologies";
		String[] arr = str2.split(" ");
		for (String s : arr )
			System.out.println(s); //output : 	  Testing
												//Masters
												//Technologies
		
		
		if (str.contains("Test"))
			System.out.println("exist");
		else
			System.out.println("not exist");
		
		
		String str3 = "Testing Masters Technologies";
		String s = str3.substring(8,15);
		System.out.println(s);
		
		////////////////////////////////////////////
		
		System.out.println("\nCompare To");
		
		String str4 = "Dummy";
		String str5 = "dummy";
		
		if(str4.compareTo(str5) == 0) // str 4.equals(str5) //str4.contentEquals(str5) // str4.equalIgnoreCase(str5)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		
		System.out.println("\ncharAt");
		
		String str6 = "Bunny";
		
		System.out.println(str6.charAt(4));
		
		for(int i=0 ; i<str6.length(); i++)
		{
			char c = str6.charAt(i);
					System.out.println(c);
		}
		/////////////////////////////////////////////////////////
		System.out.println("\nindexOf");
		
		String str7 = "ohmygod";
		int indx = str7.indexOf('u');
		System.out.println(indx);
		////////////////////////////////////////////////////////////
		System.out.println("\ntoLower and to Uppercase");
		
		String city = "HyderaBAD";
				System.out.println(city.toLowerCase());
				System.out.println(city.toUpperCase());
		//////////////////////////////////////////////////////////
		System.out.println("\nTrim");
		
		String str8 = " Testing masters technologies ";
		System.out.println("before trim - "+str8.length());
		str8 = str8.trim();
		System.out.println("after trim - "+str8.length());
		
		////////////////////////////////////////////////////////////
		System.out.println("\nisEmpty");
		
		String str9 = "";
		System.out.println(str9.isEmpty());
		///////////////////////////////////////////////////////////
		System.out.println("\nconcat");
		
		String str10 = "Drama";
		String str11 = "Juniors";
		
		System.out.println(str10.concat(str11));
		/////////////////////////////////////////////////////////
		
		System.out.println("\njoin");
		String joinstring1 = String.join(" ", "I","want to","go out","from here");
				System.out.println(joinstring1);
		
		
		
		 
		
	
	}

}

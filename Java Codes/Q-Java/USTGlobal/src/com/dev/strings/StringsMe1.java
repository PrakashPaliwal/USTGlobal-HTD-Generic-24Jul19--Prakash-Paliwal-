package com.dev.strings;

public class StringsMe1 {

	public static void main(String[] args) {

		String str = "Prakash Paliwal";
		String str1 = "PrAkASh pALiwAl";
		
		int length = str.length();										// Length() method will return the length of the String
		System.out.println("The length of the String is : "+length);
		
		char[] ch = str.toCharArray();									//toCharArray() will convert the String to Array of same length
		System.out.print("The character array is  : ");
		System.out.println(ch[0]);
		
		char c = str.charAt(10);											//charAt() will take int parameter and returns the character at that index position
		System.out.println("The character at index 10 is : " +c);
		
		boolean b = str.equals(str1);									// return true if the Strings are equal ( it checks/considers for cases ie., 'A' is not same as 'a' )
		System.out.println("Is the Strings equal : "+b);
		
		boolean b1 = str.equalsIgnoreCase(str1);						// returns true if Strings are equal ( Ignores the cases ie., 'A' is same as 'a' )
		System.out.println("Is the strings equal ignoring cases : "+b1);
		
	}

}

package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Some_String";
		String str1 = "SoMe_stRIng";
		
		int length = str.length();										// Length() method will return the length of the String
		System.out.println("The length of the String is : "+length);
		
		char[] ch = str.toCharArray();									//toCharArray() will convert the String to Array of same length
		System.out.print("The character array is : ");
		System.out.println(ch);
		
		char c = str.charAt(3);											//charAt() will take int parameter and returns the character at that index position
		System.out.println("The character at index 4 is : " +c);
		
		boolean b = str.equals(str1);									// return true if the Strings are equal ( it checks/considers for cases ie., 'A' is not same as 'a' )
		System.out.println("Is the Strings equal : "+b);
		
		boolean b1 = str.equalsIgnoreCase(str1);						// returns true if Strings are equal ( Ignores the cases ie., 'A' is same as 'a' )
		System.out.println("Is the strings equal ignoring cases : "+b1);
		
		boolean v = str.contains("Stri");								// takes a String and returns true if the given String is the part of main String
		System.out.println("Output of contains() : "+v);
		
		String g = str.replace('S', 'A');								// case sensitive it replaces the first character with second
		System.out.println("Output of replace() is : "+g);
		
		int f = str.indexOf('S');										// returns the first occurrence of the given character
		System.out.println("The index of 'S' is : "+f);
		
		String s = str.toUpperCase();										// converts String to upper case String
		System.out.println("The upper case version of str String is : "+s);
		
		String h = str.toLowerCase();										// converts String to lower case String
		System.out.println("The lower case version of str String is : "+h);
		
		String a = str.substring(3);											// Returns the sub-String of the ie., from given index till end
		System.out.println("Output of substring(3) : "+a);
		
		String m = str.substring(3,7);											// Returns sub-string from starting index till ending index but element at ending index is not included ie., from 3 till 6
		System.out.println("Output of substring(3,7)"+m);
	}

}

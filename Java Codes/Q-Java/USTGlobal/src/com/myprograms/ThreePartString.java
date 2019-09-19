package com.myprograms;

public class ThreePartString {
	
	public static int x = -1;
	
	public static String part(String str) {
		int l = str.length();  System.out.println(l);
		int st = l/3; System.out.println("st : "+st);
		String p1;
		String p2;
		String p3;
		if(l%3==0) {
			 p1 = str.substring(0, st);  System.out.println("p1 :"+p1);
			 p2 = str.substring(st, 2*st);System.out.println("p2 :"+p2);
			 p3 = str.substring(2*st, l);System.out.println("p3 :"+p3);
			 x++; return rr(p1,p2,p3);
		}
		else if(l%3==1) {
			 p1 = str.substring(0, st); System.out.println("p1 :"+p1);
			 p2 = str.substring(st, (2*st)+1);System.out.println("p2 :"+p2);
			 p3 = str.substring((2*st)+1, l);System.out.println("p3 :"+p3);
			 x++; return rr(p1,p2,p3);
		}
		else if(l%3==2) {
			 p1 = str.substring(0, (st+1)); System.out.println("p1 :"+p1);
			 p2 = str.substring((st+1), (2*st)+1);System.out.println("p2 :"+p2);
			 p3 = str.substring((2*st)+1, l);System.out.println("p3 :"+p3);
			 x++; return rr(p1,p2,p3);
		}
		
		return "YoYo";
		
	}
	
	public static String rr(String s1, String s2, String s3) {
		if(x==0) {
			return s1;
		}
		else if(x==1) {
			return s2;
		}
		else {
			return s3;
		}
	}
	
	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		String s2 = "EFGHI";
		String str1 = part(s1);
		String str2 = part(s2);
		String str3 = part(s1);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}

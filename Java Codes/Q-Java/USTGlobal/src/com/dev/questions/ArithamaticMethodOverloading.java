package com.dev.questions;

public class ArithamaticMethodOverloading {

	
	public int sub(int a, int b) {
		return a-b;
	}
	public int sub(int a, int b, int c) {
		return a-b-c;
	}
	public int sub(int a, int b, int c, int d) {
		return a-b-c-d;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}
	public int mul(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	public int div(int a, int b, int c) {
		return (a/b)/c;
	}
	public int div(int a, int b, int c, int d) {
		return ((a/b)/c)/d;
	}
	
		public static void main(String[] args) {

		ArithamaticMethodOverloading amo = new ArithamaticMethodOverloading();

		int result = amo.div(100,5);
		System.out.println("The result is : "+result);		
	}

}

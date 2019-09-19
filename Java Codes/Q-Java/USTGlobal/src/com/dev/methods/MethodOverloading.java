package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo = new MethodOverloading();

	public void print() {
		System.out.println("This is from no-arg");
	}

	//	public int print() {
	//		System.out.println("This is from no-arg");                it is not possible to overload method just by changing the return type
	//		return 1;
	//	}

	final void print(int a) {
		System.out.println("This is from no-arg");
	}

	private String print(String a) {
		System.out.println("This is from no-arg");
		return "Hello";
	}

	static void print(int a, String b) {
		System.out.println("This is from no-arg");
	}

	final int print(String a, int b) {
		System.out.println("This is from no-arg");
		return 13;
	}
	
	public static void main(String[] args) {
		
		mo.print();
		
	}
}

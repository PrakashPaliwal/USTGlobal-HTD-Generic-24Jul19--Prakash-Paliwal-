package com.dev.constructor;

public class MeExample1 {
	
	public MeExample1(int i) {									// Parameterized constructor
		System.out.println("constructor with arguments");
	}

	public MeExample1() {										// non - parameterized constructor
		System.out.println("constructor with no arguments");
	}

	public MeExample1(int a, int b) {										//Parameterized constructor
		System.out.println("constructor with 2 arguments");
	}
	
	public MeExample1(String a) {										//Parameterized constructor
		System.out.println("constructor with String arguments ");
	}
	
	public MeExample1(String a, int b) {										//Parameterized constructor
		System.out.println("constructor with String and Int arguments ");
	}
	
	public MeExample1(int b, String a) {										//Parameterized constructor
		System.out.println("constructor with Int and String arguments ");
	}
	
	public static void main(String[] args) {
		
		MeExample1 m1 = new MeExample1();
		System.out.println("The Object is : "+m1);
		MeExample1 m2 = new MeExample1(1);
		MeExample1 m3 = new MeExample1(30,40);
		MeExample1 m4 = new MeExample1("P");
		MeExample1 m5 = new MeExample1("p",2);
		MeExample1 m6 = new MeExample1(2,"p");
		
		

	}
}

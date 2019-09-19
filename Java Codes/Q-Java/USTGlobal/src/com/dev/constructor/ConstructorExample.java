package com.dev.constructor;

public class ConstructorExample {
	
	public ConstructorExample(int i) {									// Parameterized constructor
		System.out.println("This is a constructor with arguments");
	}

	public ConstructorExample() {										// non - parameterized constructor
		System.out.println("This is a constructor with no arguments");
	}

	public ConstructorExample(int a, int b) {										//Parameterized constructor
		System.out.println("This is a constructor with 2 arguments");
	}
	
	public ConstructorExample(String a) {										//Parameterized constructor
		System.out.println("This is a constructor with String arguments ");
	}
	
	public ConstructorExample(String a, int b) {										//Parameterized constructor
		System.out.println("This is a constructor with String and Int arguments ");
	}
	
	public ConstructorExample(int b, String a) {										//Parameterized constructor
		System.out.println("This is a constructor with Int and String arguments ");
	}
	
	public static void main(String[] args) {
		
		ConstructorExample ce = new ConstructorExample();					// constructor is invoked when object is created
		ConstructorExample ce1 = new ConstructorExample(1);
		ConstructorExample ce2 = new ConstructorExample(2,3);				// Constructor Overloading
		ConstructorExample ce3 = new ConstructorExample("Prakash");
		ConstructorExample ce4 = new ConstructorExample("Prakash",1);
		ConstructorExample ce5 = new ConstructorExample(1,"Prakash");
		

	}
}

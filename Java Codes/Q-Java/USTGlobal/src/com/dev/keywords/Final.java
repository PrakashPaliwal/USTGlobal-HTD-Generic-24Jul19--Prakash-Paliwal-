package com.dev.keywords;

public class Final {
	
	final static int I = 10;		// we use UpperCase for the variable only if it is final (Optional but good Habit)
	
	final static void print() {
		System.out.println("Final Method");
	}
	
	public static void main(String[] args) {
		System.out.println(I);
		// the final can't be re-initialized
		//I = 10;
	}

}

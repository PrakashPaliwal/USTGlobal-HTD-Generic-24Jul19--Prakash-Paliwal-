package com.dev.Interface;

public interface Abs {
	
//	public Abs() {                        interface can't have constructors
//		
//	}
	
	
	public void display();
	
	public static void print() {
		System.out.println("Static method in an interface");
	}
	
	default void show() {
		System.out.println("default method in an interface");
	}

}

package com.dev.abstrsction;

public class Abstraction extends AbstractExample {
	
	// AbstractionExample ae = new AbstractExample();
	// we can't create object for abstract class ie., AbstractionExample is a abstract class
	
	public Abstraction() {
		// implicit super() statement present
		System.out.println("Constructor of Abstraction class");
	}

	@Override
	void display() {
		System.out.println("This is the implimented abstract methods");
		
	}
	
	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.display();
	}

}

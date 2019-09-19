package com.dev.objectmethod;

public class ObjectMethod {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		System.out.println(d1.getClass());		// returns the Fully Qualified name of the class of the acting object
		System.out.println(d2.getClass());
		
		System.out.println(d2.toString());
		
		Dog d3 = d1;							// d1 is copied to d3
		
		System.out.println(d1.equals(d2));		// if we didn't override hashCode() and equals(), it will just compare the reference ie., memory address 
												// insteard of the contacts of the objects
		
	}

}

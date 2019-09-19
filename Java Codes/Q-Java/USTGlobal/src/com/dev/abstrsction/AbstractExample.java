package com.dev.abstrsction;

public abstract class AbstractExample {
	
	public AbstractExample() {
		System.out.println("Contructor of AbstractExample class");
	}

	abstract void display();									// abstract method

	public void show() {										// concrete method
		System.out.println("Concrete method of abstract class");
	}
}

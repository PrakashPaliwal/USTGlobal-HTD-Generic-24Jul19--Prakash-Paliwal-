package com.dev.polymorphism;

public class ComplieTimePolymerphism {
	
	public void display() {
		System.out.println("Display method 1");
	}

	public void display(int a) {
		System.out.println("Display method 2");
	}

	public void display(int b, int a) {
		System.out.println("Display method 3");
	}

	public void display(String a) {
		System.out.println("Display method 4");
	}

	public static void main(String[] args) {
		ComplieTimePolymerphism c = new ComplieTimePolymerphism();
		c.display();
	}
}

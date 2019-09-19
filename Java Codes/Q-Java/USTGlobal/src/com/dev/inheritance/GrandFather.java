package com.dev.inheritance;

public class GrandFather {

	static GrandFather g = new GrandFather();		

	String lastName = "Stark";
	String name = "Torrhen";
	
	public static void main(String[] args) {
		
		g.printName();
	}

	protected void printName() {
		
		System.out.println(name+" "+g.lastName);
	}
	
	public static void pra() {
		System.out.println("Static Method");
	}

}

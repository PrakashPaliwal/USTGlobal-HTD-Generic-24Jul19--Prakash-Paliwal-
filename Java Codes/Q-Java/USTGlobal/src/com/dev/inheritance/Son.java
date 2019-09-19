package com.dev.inheritance;

public class Son extends Father {
	static Son s = new Son();
	
	@Override
	public void printName() {
		String name = "Robb";
		super.printName();
		System.out.println(name+" "+super.name+" "+s.lastName);
	}
	
	public static void main(String[] args) {
		s.printName();
		
	}


}

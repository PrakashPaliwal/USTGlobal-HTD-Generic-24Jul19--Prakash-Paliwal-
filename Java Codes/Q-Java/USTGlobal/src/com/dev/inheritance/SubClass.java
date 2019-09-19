package com.dev.inheritance;

public class SubClass extends SuperClass {
	
	public SubClass() {
		System.out.println("In SubClass");
	}
	@Override													// this is optional
	public void useLess(int a) {
		System.out.println("Overriden in child or sub class");
	}
	
	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		s.useLess(1);
		
	}

}

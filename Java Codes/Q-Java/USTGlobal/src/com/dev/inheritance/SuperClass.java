package com.dev.inheritance;

public class SuperClass {
	
	public SuperClass() {
		System.out.println("Constructor with no args of SuperClass");
	}
	
	public SuperClass(int a) {
		System.out.println("Constructor with int args of SuperClass");
	}
	
	public SuperClass(int a, String b) {
		System.out.println("Constructor with int and String args of SuperClass");
	}
	
	public SuperClass(String b, int a) {
		System.out.println("Constructor with String and int args of SuperClass");
	}
	
	public SuperClass(String b) {
		System.out.println("Constructor with String args of SuperClass");
	}
	
	
	public void useLess(int a) {
		System.out.println("Parent Class method");
	}

}

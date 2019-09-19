package com.dev.inheritance;

public class Father extends GrandFather {
	
	//  static GrandFather gf = new GrandFather();
	static Father f = new Father();
	String name = "Eddard";
	@Override
	public void printName() {
		
		System.out.println(name+" "+super.name+" "+f.lastName);
	}
	
	public static void main(String[] args) {
		
		f.printName();
	//	gf.printName();
		Father.pra();		//Static method in GrandFather
	}
}

package com.dev.polymorphism;

public class ChildRunTime extends RunTimePloymorphism {

	@Override
	public void display() {
		System.out.println("Display method in ChildRumTime Class which extends RunTimePolymorphism Class");
	}
	
	public static void main(String[] args) {
		
		ChildRunTime c = new ChildRunTime();
		c.display();

	}

}

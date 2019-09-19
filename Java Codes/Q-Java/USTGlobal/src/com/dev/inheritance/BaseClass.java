package com.dev.inheritance;

import javax.sound.midi.SysexMessage;

public class BaseClass extends SubClass {

	public BaseClass() {
																	// implicit  super() ie., no-args is invoked
		System.out.println("Cont with no args of BaseClass");
	}

//	public BaseClass(int a) {
//		super(1);
//		System.out.println("Cont with int args of BaseClass");
//	}
//
//	public BaseClass(String a) {
//		super("A");
//		System.out.println("Cont with String args of BaseClass");
//	}
//
//	public BaseClass(int a, String b) {
//		super(1,"A");
//		System.out.println("Cont with int and String args of BaseClass");
//	}
//
//	public BaseClass(String b, int a) {
//		super("A",1);
//		System.out.println("Cont with String and int args of BaseClass");
//	}


	public static void main(String[] args) {
		BaseClass b = new BaseClass();
//		BaseClass b1 = new BaseClass(1);
//		BaseClass b2 = new BaseClass("A");
//		BaseClass b3 = new BaseClass("a",1);
//		BaseClass b4 = new BaseClass(1,"P");
	}
}

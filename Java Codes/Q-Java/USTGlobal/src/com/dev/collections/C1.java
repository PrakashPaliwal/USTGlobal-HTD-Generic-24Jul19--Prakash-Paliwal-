package com.dev.collections;

import java.util.HashSet;

import com.dev.encapsulation.Dog;

public class C1 {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet();
		Dog d = new Dog();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d.setAge(1);
		d.setBreed("D M");
		d.setName("Shiro");
		d.setColor("Black");

		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setName("Ronnie");
		d1.setColor("Black&White");


		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setName("Hunter");
		d2.setColor("Black");
		
		d.setAge(2);
		d1.setAge(3);
		d2.setAge(5);
		

		
		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b3 = hs.add(d2);
		
		System.out.println("Output of add() : "+b+" "+b1+" "+b3);
		System.out.println(hs);							//[com.dev.encapsulation.Dog@15db9742] is the output if we didn't override toString() in the Dog Class
		//[Dog [age=1, name=Shiro, color=Black, breed=D M]]  After overriding 
		System.out.println("Size of HashSet hs : "+hs.size());
		boolean b2 = hs.remove(d);
		System.out.println("Output of remove() : "+b2);
		System.out.println(hs);
		
		System.out.println("Output of contains() : "+hs.contains(d));
		
		System.out.println("Size of HashSet hs after remove(): "+hs.size());
		
		hs.clear();								// it will clear all the contains
		
		System.out.println("Size of HashSet hs after clear() : "+hs.size());

	}
}

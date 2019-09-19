package com.dev.collections;

import java.util.TreeSet;

import com.dev.encapsulation.Dog;

public class DogTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Dog> ts = new TreeSet<Dog>();
		
		Dog d = new Dog();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d.setAge(1);
		d.setBreed("D M");
		d.setName("Shiro");
		d.setColor("Black");

		d1.setAge(3);
		d1.setBreed("Dalmation");
		d1.setName("Ronnie");
		d1.setColor("Black&White");


		d2.setAge(2);
		d2.setBreed("Dalmation");
		d2.setName("Hunter");
		d2.setColor("Black");
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		
		System.out.println(ts);

	}

}

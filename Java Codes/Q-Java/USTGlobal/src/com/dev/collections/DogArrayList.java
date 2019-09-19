package com.dev.collections;

import java.util.ArrayList;

import com.dev.encapsulation.Dog;

public class DogArrayList {

	public static void main(String[] args) {
		
		ArrayList arl = new ArrayList<Dog>(2);
		
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
		
		arl.add(d);
		arl.add(d1);
		arl.add(d2);
		
		System.out.println(arl);
		
		
		arl.trimToSize();
		
		System.out.println("After trimToSize() : "+arl.size());
		


	}

}

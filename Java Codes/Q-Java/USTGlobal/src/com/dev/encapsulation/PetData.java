package com.dev.encapsulation;

public class PetData {

	public static void main(String[] args) {
		
		Pets p1 = new Pets();
		Pets p2 = new Pets();
		Pets p3 = new Pets();
		Pets p4 = new Pets();
		
		p1.setAge(2);
		p1.setType("Cat");
		p1.setName("Pinky");
		p1.setOwner("Petter");
		

		p2.setAge(7);
		p2.setType("Tiger");
		p2.setName("Tommy");
		p2.setOwner("Ruby");
		

		p3.setAge(8);
		p3.setType("Lion");
		p3.setName("Slayer");
		p3.setOwner("Crocus");
		

		p4.setAge(1);
		p4.setType("Parrot");
		p4.setName("Hunter");
		p4.setOwner("Sumanth");
		
		Pets[] pet = {p1, p2, p3, p4};
		
		for(int i=0; i<pet.length; i++) {
			System.out.println("Name : "+pet[i].getName());
			System.out.println("Age : "+pet[i].getAge());
			System.out.println("Type of Pet : "+pet[i].getType());
			System.out.println("Owner of the Pet : "+pet[i].getOwner());
			System.out.println("******************************");
		}
		
	}
}

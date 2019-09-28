package com.contactsjava;

import java.util.HashMap;
import java.util.Scanner;

public class ContactsApp {
	
	static Scanner sc = new Scanner(System.in);

	static HashMap<String, Contact> hm = new HashMap<String, Contact>();
	
	public static void display() {
		System.out.println("Press 1 to show all contacts");
		System.out.println("Press 2 to search for contact(Using name)");
		System.out.println("Press 3 to operate on contact");
		
		int value = sc.nextInt();
		
		processValue(value);
	}
	
	static void processValue(int val) {
		if(val == 1) {
			Operations.showContacts(hm);
		}
		else if(val == 2) {
			System.out.println("Enter the Vaild name");
			String entName = sc.next();
			Operations.search(entName,hm);
		}
		else if(val == 3) {
			
			Operations.operations();
		}
		else {
			System.out.println("Invalid Input");
			display();
		}
	}

	public static void main(String[] args) {
		
		Contact c1 = new Contact();
		Contact c2 = new Contact();
		Contact c3 = new Contact();
		Contact c4 = new Contact();
		
		c1.setName("Prakash");
		c1.setNumber(9844845);
		c1.setGroup("Friend");
		
		c2.setName("Ragu");
		c2.setNumber(8754845);
		c2.setGroup("Friend");
		
		c3.setName("Pooja");
		c3.setNumber(7787845);
		c3.setGroup("Friend");
		
		c4.setName("Nikil");
		c4.setNumber(5768845);
		c4.setGroup("Friend");
		
		hm.put(c1.getName(), c1);
		hm.put(c2.getName(), c2);
		hm.put(c3.getName(), c3);
		hm.put(c4.getName(), c4);
	
		display();

	}

}

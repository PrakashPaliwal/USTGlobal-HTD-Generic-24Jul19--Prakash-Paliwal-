package com.contactsjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Operations extends ContactsApp{

	static Scanner s = new Scanner(System.in);
	
	static public void showContacts(HashMap<String, Contact> hm) {
			
			System.out.println(hm);
			ContactsApp.display();
	}

	static public void search(String name, HashMap<String, Contact> hm) {
				Contact c = hm.get(name);
				if(c == null) {
					System.out.println("Invalid Username...!");
					ContactsApp.display();
				}else {
					System.out.println("The user is : "+c);
					System.out.println("Press 1 to call");
					System.out.println("Press 2 to message");
					System.out.println("press 3 to go back to main menu");
					int valu = s.nextInt();
					process(valu);
				}
	}
	
	private static void process(int val) {
		if(val == 1) {
			call();
		}
		else if(val == 2) {
			message();
		}else {
			ContactsApp.display();
		}
		
	}

	private static void message() {
		System.out.println("Enter the Message : ");
		String msg = s.nextLine();
		System.out.println("Message is Sending.....!");
		ContactsApp.display();
		
	}

	private static void call() {
		System.out.println("Calling....");
		System.out.println("End Call 0 ");
		int v = s.nextInt();
		if(v == 0) {
			ContactsApp.display();
		}else {
			System.out.println("Invalid...!");
			ContactsApp.display();
		}
	}

	static public void operations() {
		System.out.println("Press 1 to add contact");
		System.out.println("Press 2 to Delete contact");
		System.out.println("Press 3 to edit Contact Number");
		System.out.println("Press 4 to go back");
		int val = s.nextInt();
		processOperation(val);
		}

	private static void processOperation(int val) {

		if(val == 1) {
			addContact();
		}
		else if(val == 2) {
			delectContact();
		}
		else if(val == 3) {
			editContact();
		}else {
			System.out.println("Invalid Input...");
			ContactsApp.display();
		}
	}

	private static void editContact() {
		System.out.println("Enter the name of the contact you want to Edit : ");
		String name = s.next();
		Contact c = hm.get(name);
		System.out.println("Enter New Number");
		long num = s.nextLong();
		c.setNumber(num);
		System.out.println("The contact is updated...");
		Operations.operations();
	}

	private static void delectContact() {
		System.out.println("Enter the name of the contact you want to delete : ");
		String name = s.next();
		Contact c = hm.remove(name);
		System.out.println(c);
		System.out.println("Is Removed");
		Operations.operations();
	}

	private static void addContact() {
		System.out.println("Enter Username to be added : ");
		String name = s.next();
		System.out.println("Enter Number : ");
		long num = s.nextInt();
		System.out.println("Enter Group : ");
		String group = s.next();
		
		Contact c = Contact.objectCreation();
		c.setName(name);
		c.setNumber(num);
		c.setGroup(group);
		hm.put(c.getName(), c);
		
		System.out.println("Added Successfully...!");
		
		Operations.operations();
		
		
	}
}

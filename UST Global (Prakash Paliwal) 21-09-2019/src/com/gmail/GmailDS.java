package com.gmail;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Scanner;

public class GmailDS {

	static HashMap<String, Account> hm = new HashMap<String, Account>();

	static Scanner s = new Scanner(System.in);

	static public void registerPage() {
		System.out.println("Enter your User Name : ");
		String userName = s.next();
		System.out.println("Enter Password : ");
		String password = s.next();
		System.out.println("Enter new E-mail : ");
		String email = s.next();

		Account a = Account.createObject();
		Inbox i = Inbox.createObj();

		a.setUserName(userName);
		a.setPassword(password);
		a.setEmail(email);
		a.setUser_id();
		a.setI(i);

		hm.put(a.getEmail(), a);

		System.out.println("The data is : " + hm);

		GmailData.display();

	}

	static public void loginPage() {
		System.out.println("Enter Valid Email : ");
		String usr = s.next();
		System.out.println("Enter Password : ");
		String pwd = s.next();

		Account acc = hm.get(usr);
		System.out.println(acc);

		if (acc != null) {
			if (acc.getEmail().equals(usr)) {

				if (acc.getPassword().equals(pwd)) {
					System.out.println("Valid Account !!");
					GmailData.loginDisplay(acc);
				} else {
					System.out.println("Invalid Password or user name");
					loginPage();
				}

			}
		} else {
			loginPage();
		}
	}

	static public void inbox(Account a) {
		Inbox ib = a.getI();

		System.out.println("The messages in Inbox are : ");
		String msg[] = ib.getMessage();
		for(int i=0; i<msg.length;i++) {
			System.out.println(msg[i]+" ");
		}
		GmailData.loginDisplay(a);

	}

	static public void compose(Account a) {

		System.out.println("Enter the valid E-mail : ");
		String email = s.next();
		System.out.println("Enter the Message");
		String message = s.next();
		
		Account c = hm.get(email);
		Inbox i = c.getI();
		i.setMessage(message);

		GmailData.loginDisplay(a);
	}

}

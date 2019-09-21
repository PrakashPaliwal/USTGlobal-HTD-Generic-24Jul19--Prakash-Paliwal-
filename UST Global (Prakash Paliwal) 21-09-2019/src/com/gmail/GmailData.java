package com.gmail;

import java.util.Scanner;

public class GmailData {
	
	static Scanner s = new Scanner(System.in);
	
	static public void enterValueProcess(int value) {
		if(value == 1) {
			GmailDS.loginPage();
		}
		else if(value == 2) {
			GmailDS.registerPage();
		}
	}
	
	static public void display() {
		System.out.println("Press 1 to login");
		System.out.println("Press 2 to Register");
		int enterValue = s.nextInt();
		enterValueProcess(enterValue);
	}
	
	static public void loginDisplay(Account a) {
		String p = "A";
		String b = "B";
		String c = "C";
		
		System.out.println("Enter A to compose");
		System.out.println("Enter B to Inbox");
		System.out.println("Enter C to Logout");
		String enterVal = s.next();
		if(enterVal.equals(p)) {
			GmailDS.compose(a);
		}else if(enterVal.equals(b)) {
			GmailDS.inbox(a);
		}else if (enterVal.equals(c)) {
			display();
		}
	}
	

	public static void main(String[] args) {
		
		display();
		
		
	}
}

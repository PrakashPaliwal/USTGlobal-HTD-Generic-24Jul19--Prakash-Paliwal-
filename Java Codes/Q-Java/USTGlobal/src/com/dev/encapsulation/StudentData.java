package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setRegno(2019007);
		s.setName("Kira");
		s.setEmail("Kira@email.com");
		s.setPassword("12345");
		
		System.out.println("Registeration Number : "+s.getRegno());
		System.out.println("Name is : "+s.getName());
		System.out.println("The E-mail is : "+s.getEmail());

	}

}

package com.dev.collections;

import java.util.HashSet;

public class EmployeeHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setId(101);
		e1.setName("Raju");
		e1.setEmail("raju123@gmail.com");
		e1.setPassword("******");

		e2.setId(102);
		e2.setName("Pooja");
		e2.setEmail("pooja435@gmail.com");
		e2.setPassword("******");

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);

		e3.setId(103);
		e3.setName("Surandra");
		e3.setEmail("surandra783@gmail.com");
		e3.setPassword("******");
		System.out.println(hs);

		e1.setEmail("raju.r@qspider.com");
		e2.setEmail("poojaraj@google.com");
		e3.setEmail("surandra@ust.com");

		System.out.println(hs);
		System.out.println("The Size before remove : " +hs.size());
		hs.remove(e1);
		System.out.println(hs);
		System.out.println("The Size after remove : " +hs.size());
	

	}

}

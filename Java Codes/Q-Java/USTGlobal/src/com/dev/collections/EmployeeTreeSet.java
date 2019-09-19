package com.dev.collections;

import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setId(101);
		e1.setName("Raju");
		e1.setEmail("raju123@gmail.com");
		e1.setPassword("456uhg");

		e2.setId(102);
		e2.setName("Pooja");
		e2.setEmail("pooja435@gmail.com");
		e2.setPassword("mnbvfde567");

		e3.setId(103);
		e3.setName("Surandra");
		e3.setEmail("surandra783@gmail.com");
		e3.setPassword("0987tyui6");
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		System.out.println(ts);
	}

}

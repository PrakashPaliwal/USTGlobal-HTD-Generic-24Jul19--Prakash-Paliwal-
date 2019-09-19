package com.myprograms;

import com.dev.collections.Employee;

public class EmployeeData {
	
	static EmployeeClass em = new EmployeeClass();
	
public static void main(String[] args) {
		
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

		e3.setId(103);
		e3.setName("Surandra");
		e3.setEmail("surandra783@gmail.com");
		e3.setPassword("******");
		
		
		em.addEmployee("1", e1);
		em.addEmployee("2", e2);
		
		em.removeEmployee("2", e2);
		em.retrive("1");
		
		e1.setName("Prakash");
		
		em.updateEmployee("1", e1);
		em.removeEmployee("1", e1);
		
		em.retrive("1");
		
		

}

}

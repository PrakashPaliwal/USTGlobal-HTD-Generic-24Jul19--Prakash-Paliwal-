package com.dev.collections;

import java.util.HashMap;

public class EmployeeHashMap {

	public static void main(String[] args) {

		HashMap<String, Employee> hm = new HashMap<String, Employee>();

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

		hm.put("1", e1);
		hm.put("3", e3);
		Employee b = hm.put("2", e2);		// this method will return the pre-viously associated with that key and for the first addition it is NULL
		//System.out.println(b);
		System.out.println(hm);
		
		Employee f = hm.remove("2");		// return the object or value which is being removed
		System.out.println(f);
		System.out.println(hm);
		
		System.out.println("Output of containsKey() : "+hm.containsKey("2"));  // false since it is removed
		System.out.println("Output of containsKey() : "+hm.containsKey("3"));
		
		System.out.println("Output of containsValue() : "+hm.containsValue(e2));  // false since it is removed 
		System.out.println("Output of containsValue() : "+hm.containsValue(e3));
		
	}

}

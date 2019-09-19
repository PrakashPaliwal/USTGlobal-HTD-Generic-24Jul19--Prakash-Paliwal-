package com.myprograms;

import java.util.HashMap;

import com.dev.collections.Employee;

public class EmployeeClass implements Employee1 {
	
	static HashMap<String, Employee> hs = new HashMap<String, Employee>();
	
	@Override
	public Employee addEmployee(String key, Employee obj) {
		if(obj!= null) {
			return hs.put(key, obj);
		}
		else {
			System.out.println("it is Empty");
			
		}
		return null;
	}

	@Override
	public boolean removeEmployee(String key,Employee obj) {
		hs.remove(key, obj);
		return true;
	}

	@Override
	public Employee updateEmployee(String key, Employee obj) {
		return hs.put(key, obj);
	}

	@Override
	public  void retrive(String key) {
		System.out.println(hs.get(key));
		
	}
	
	
	
	
}

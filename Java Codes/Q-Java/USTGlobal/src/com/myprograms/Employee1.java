/**
 * 
 */
package com.myprograms;

import com.dev.collections.Employee;

/**
 * @author Prakash Paliwal
 *
 */
public interface Employee1 {
	
	Employee addEmployee(String key, Employee obj);
	boolean removeEmployee(String key, Employee obj);
	Employee updateEmployee(String key, Employee obj);
	void retrive(String key);
	
}

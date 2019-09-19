

package com.employeemainten;

/**
 * @author Prakash Paliwal
 *
 */
public interface EmployeeInt {
	
	boolean addEmployee(Employee e);
	Employee searchEmployee(int eid);
	Employee removeEmployee(int eid);
	Employee updateEmployee(int eid);
	double taxPayable(int eid);
	double netPay(int eid);
	String retriveSalgrade(int eid);
	

}

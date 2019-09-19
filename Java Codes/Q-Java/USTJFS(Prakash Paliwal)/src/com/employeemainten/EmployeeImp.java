package com.employeemainten;

import java.util.HashMap;

public class EmployeeImp implements EmployeeInt {
	
	static HashMap<Integer, Employee> hs = new HashMap();

	@Override
	public boolean addEmployee(Employee e) {
		if(e != null) {
			hs.put(e.getEmpid(), e);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public Employee searchEmployee(int eid) {
		
		return hs.get(eid);
	}

	@Override
	public Employee removeEmployee(int eid) {
		
		return hs.remove(eid);
	}

	@Override
	public Employee updateEmployee(int eid) {
		
		return hs.put(eid, hs.get(eid));
	}

	@Override
	public double taxPayable(int eid) {
		
		Employee e = hs.get(eid);
		double sal = e.getSalary();
		if(sal>10.00) {
			return sal*9.35/100;
		}
		else if(sal>8.6 && sal<=10) {
			return sal*8.87/100;
		}
		else if(sal>5.4 && sal<=8.6) {
			return sal*8.19/100;
		}
		else if(sal>3.8 && sal<=5.4) {
			return sal*7.34/100;
		}
		else if(sal>1.6 && sal<=3.8) {
			return sal*5.4/100;
		}
		else {
			return 0.0;
		}
	}

	@Override
	public double netPay(int eid) {
		Employee e = hs.get(eid);
		double sal = e.getSalary();
		
		return sal;
	}

	@Override
	public String retriveSalgrade(int eid) {
		Employee e = hs.get(eid);
		double sal = e.getSalary();
		if(sal>10.00) {
			return "AA";
		}
		else if(sal>8.6 && sal<=10) {
			return "A";
		}
		else if(sal>5.4 && sal<=8.6) {
			return "B";
		}
		else if(sal>3.8 && sal<=5.4) {
			return "C";
		}
		else if(sal>1.6 && sal<=3.8) {
			return "D";
		}
		else {
			return "F";
		}
	}

}

package com.employeemainten;

public class EmployeeData {
	
	
	static EmployeeImp ei = new EmployeeImp();

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		e1.setEmpid(1);
		e1.setEname("Prakash");
		e1.setEmail("prakash123@gmail.com");
		e1.setPassword("678ohgfrt");
		e1.setSalary(12.6);

		e2.setEmpid(2);
		e2.setEname("Raju");
		e2.setEmail("raju.d@gmail.com");
		e2.setPassword("9iuht98");
		e2.setSalary(9.5);

		e3.setEmpid(3);
		e3.setEname("Pooja");
		e3.setEmail("poojashree345@gmail.com");
		e3.setPassword("0987tgi9");
		e3.setSalary(7.7);

		e4.setEmpid(4);
		e4.setEname("Jeeth");
		e4.setEmail("jeeth764@gmail.com");
		e4.setPassword("bji98gfrt");
		e4.setSalary(4.12);
		

		e5.setEmpid(5);
		e5.setEname("Ravi Kumar");
		e5.setEmail("ravikumar54@gmail.com");
		e5.setPassword("9uhg78t");
		e5.setSalary(3.5);
		
		ei.addEmployee(e1);
		ei.addEmployee(e2);
		ei.addEmployee(e3);
		ei.addEmployee(e4);
		ei.addEmployee(e5);
		
		System.out.println(ei.removeEmployee(2));
		
		e1.setEname("Manu");
		
		ei.updateEmployee(1);
		
		System.out.println(ei.retriveSalgrade(1));
		System.out.println(ei.removeEmployee(1));
		

	}

}

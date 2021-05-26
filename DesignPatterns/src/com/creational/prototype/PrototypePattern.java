package com.creational.prototype;

import java.util.List;

public class PrototypePattern {
	
	public static void main(String[] args) {
		
		EmployeeDetails empDetails = new EmployeeDetails("company1");
		empDetails.getEmployeeList();
		
		
		try {
			//instead of creating new object clone the existing object
			EmployeeDetails empDetail1 =  (EmployeeDetails) empDetails.clone();
			empDetail1.setCompany("company2");
			List<Employee> empList =empDetail1.getEmployeee();
			
			System.out.println(empDetails.getCompany());
			System.out.println(empDetail1.getCompany());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//With out prototype
		EmployeeDetails empDetailsa = new EmployeeDetails("company3");
		EmployeeDetails empDetailsb = empDetailsa;
		empDetailsb.setCompany("company4");
		System.out.println(empDetailsa.getCompany());
		System.out.println(empDetailsb.getCompany());
	}

}

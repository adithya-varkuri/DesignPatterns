package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeService {
	List<Employee> Employees;
	
	//In real time this employee details will be fetched from database.
	public EmployeService() {
		Employees = new ArrayList<Employee>();
		Employees.add(new Employee("1", "adithya"));
		Employees.add(new Employee("2", "adithya1"));
		Employees.add(new Employee("3", "adithya2"));
	}
	

	public List<Employee> getEmployees() {
		return Employees;
	}

}

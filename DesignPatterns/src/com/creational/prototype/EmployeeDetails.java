package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails implements Cloneable {
	
	private List<Employee> employeeList ;
	private String company;

	
	public EmployeeDetails(List<Employee> employeeList , String company) {
		this.employeeList = employeeList;
		this.company =company;
	}
	
	public EmployeeDetails(String company) {
		this.employeeList = new ArrayList<Employee>();
		this.company =  company;
	}
	
	//this method will be called only once
	public void getEmployeeList() {
		EmployeService emp = new EmployeService();
		employeeList = emp.getEmployees();
	}
	
	public List<Employee> getEmployeee() {
		return employeeList;
	}	

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	 public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Object clone() throws CloneNotSupportedException{
         List<Employee> temp = new ArrayList<Employee>();
         for(Employee e : this.getEmployeee()){
             temp.add(e);
         }
         return new EmployeeDetails(temp ,company);
 }
	
	

}

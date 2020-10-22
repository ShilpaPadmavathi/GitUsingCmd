package com.ntt.collectionpractice;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee>{
	
	int employeeId;
	String employeeName;
	double sal;
	
	public Employee(int employeeId, String employeeName, double sal) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.sal = sal;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", sal=" + sal + "]";
	}
	
	Employee(){
		
	}
	
	@Override
	public int compareTo(Employee e) {
		
		if(employeeId==e.employeeId) {
		return 0;
	}
		else if(employeeId>e.employeeId) {
			return 1;
		}
		else 
			return -1;
	
	
	}
	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.employeeName.compareTo(e1.employeeName);
	}
}

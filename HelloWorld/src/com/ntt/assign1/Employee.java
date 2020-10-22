package com.ntt.assign1;

import java.util.Scanner;

public class Employee extends User{
	
	public Employee(int userId, String userName, String email) {
		super(userId, userName, email);
		userDetails();
	}
	
	public static void main(String[] args) {
		
		int empId;
		String empName;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		empId=sc.nextInt();
		System.out.println("Enter Employee Name");
		empName=sc.next();
		System.out.println("*****************Employee Details*********************");
		System.out.println("EMPLOYEE ID: "+empId);
		System.out.println("Employee Name: "+empName);
		
		Employee emp=new Employee(userId,userName,email);
	}
	
	
}

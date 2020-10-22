package com.ntt.constructors;

import java.util.Scanner;

public class OwnerClass {
	
	public static void main(String[] args) {
		System.out.println("Enter Customer Details");
		int custId;
		String custName;
		long custMobile;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		custName=sc.nextLine();
		System.out.println("Enter Customer Id");
		custId=sc.nextInt();
		System.out.println("Enter Customer Mob");
		custMobile=sc.nextLong();
		
		CustomerDetails cust=new CustomerDetails(custId, custName, custMobile);
		cust.display();
		
		
	}

}

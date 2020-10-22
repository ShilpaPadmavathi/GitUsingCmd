package com.ntt.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		ArrayList<User> l1=new ArrayList<User>();
		
		String bankName;
		String bankBranch;
		String ifscCode;
		
		User u=null;
		String userName;
		String password;
		long mobileNum;
		String yn = null;
		
		long accountNumber;
		double balance;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Details");
		System.out.println("Enter Bank Name");
		bankName=sc.next();
		System.out.println("Enter Branch Name");
		bankBranch=sc.next();
		System.out.println("Enter ifsc Code");
		ifscCode=sc.next();
		Bank b=new Bank(bankName, bankBranch, ifscCode);
		
		
		System.out.println("1. Create account"+"\n"+"2. Do transfer");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1: do {
		System.out.println("Create Account");
		System.out.println("Enter Username");
		userName=sc.next();
		System.out.println("Enter your Password");
		password=sc.next();
		System.out.println("Enter Your Mobile Number");
		mobileNum=sc.nextLong();
		
		
		System.out.println("Enter Your Account Number");
		accountNumber=sc.nextLong();
		System.out.println("Enter Balance");
		balance=sc.nextDouble();
		Account acc=new Account(accountNumber, balance);
		u=new User(bankName, bankBranch, ifscCode, acc, userName, password, mobileNum);
		l1.add(u);
		u.createUser(u);
		System.out.println("Do you want to continue");
		yn=sc.next();
		}while(yn.equalsIgnoreCase("yes"));
		
		
		case 2: System.out.println("Fund Transfer");
		
		System.out.println("Enter the Amount to Transfer");
		long amount=sc.nextLong();
			try {
				u.fundTransfer(l1,amount);
			} catch (Exception e) {
				System.out.println("Transfer Failed due to Insufficient funds");
			}
		
		}
		
	}

}

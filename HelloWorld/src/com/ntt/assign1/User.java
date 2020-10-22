package com.ntt.assign1;

import java.util.Scanner;

public class User{


	static int userId;
	static String userName;
	static String email;
	
	

	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
	
	void userDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your USER ID");
		userId=sc.nextInt();
		
		System.out.println("Enter your USER NAME");
		userName=sc.next();
		
		System.out.println("Enter your EMAIL");
		email=sc.next();
		System.out.println("USER ID: " +userId+"\n"+"USER NAME: "+userName+"\n"+"EMAIL: "+email);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

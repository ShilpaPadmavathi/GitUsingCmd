package com.ntt.innerclass;

import java.util.Scanner;

public class Display {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName");
		String userName=sc.next();
		System.out.println("Enter Pin");
		int pin=sc.nextInt();
		
		Validate valid=new Validate();
		Validate.Valid v=valid.new Valid();
		v.compare(pin, userName);
	}

}

package com.ntt.assign2;

import java.util.Scanner;

public class Display {
	
	public static void main(String[] args) {
		String type;
		String company;
		int warranty; 
		float price;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Type");
		type=sc.next();
		System.out.println("Enter company");
		company=sc.next();
		System.out.println("Enter Warranty");
		warranty=sc.nextInt();
		System.out.println("Enter Price");
		price=sc.nextFloat();
	
		Mobile mob=new Mobile(type, company, warranty, price);
		mob.start(mob);
		mob.stop(mob);
		}
	}


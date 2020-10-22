package com.ntt.vehicleassign;

import java.util.Scanner;

public class Client {
	static Engine engine;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter car or bus");
		String type=sc.next();
		
		if(type.equalsIgnoreCase("car")) {
			String color;
			String company;
			String model;
			double price;
			
			
			System.out.println("Enter Color");
			color=sc.next();
			System.out.println("Enter Company");
			company=sc.next();
			System.out.println("Enter Model");
			model=sc.next();
			System.out.println("Enter Price");
			price=sc.nextDouble();
			
			Car c=new Car(color, company, model, price, engine);
			c.start(c);
			c.stop(c);
			
		}
		
		if(type.equalsIgnoreCase("bus")) {
			
			String color;
			String manCompany;
			String travelName;
			double price;
			
			System.out.println("Enter Color");
			color=sc.next();
			System.out.println("Enter Manufacturing Company");
			manCompany=sc.next();
			System.out.println("Enter Travels Name");
			travelName=sc.next();
			System.out.println("Enter Price");
			price=sc.nextDouble();
			
			Bus b=new Bus(color, manCompany, travelName, price,engine);
			b.start(b);
			b.stop(b);
			
		}
		
	}

}

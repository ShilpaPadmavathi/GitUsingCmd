package com.ntt.vehiclesimulator;

import java.util.Scanner;


public class Bus extends Vehicle {
	static Engine engine;
	public static void main(String[] args) {
		int noOfTyres;
		
		Scanner sc= new Scanner(System.in);
		
		Bus bus=new Bus();
		System.out.println("Enter Vehicle Number");

		bus.vehicleNo=sc.nextLine();
		System.out.println("Enter Vehicle Name");
		bus.vehicleName=sc.nextLine();
		System.out.println("Enter Number OF Tyres");
		noOfTyres=sc.nextInt();
		
		System.out.println("vehicle Name is: "+bus.vehicleName+"\n"+"Vehicle Number is: "+bus.vehicleNo+"\n"+
		"Number Of Tyres is: "+noOfTyres);
		
		System.out.println("Engine Number is"+engine.engineNumber+"\n"+"Engine Type is: "+engine.engineType);
		
	}
}

package com.ntt.vehiclesimulator;

import java.util.Scanner;

public class Car extends Vehicle{ 
	static Engine engine;
	public static void main(String[] args) {
		
		int noOfTyres;
		Scanner sc= new Scanner(System.in);
		
		Car car=new Car();
		System.out.println("Enter Vehicle Number");

		car.vehicleNo=sc.nextLine();
		System.out.println("Enter Vehicle Name");
		car.vehicleName=sc.nextLine();
		System.out.println("Enter Number OF Tyres");
		noOfTyres=sc.nextInt();
		
		System.out.println("vehicle Name is: "+car.vehicleName+"\n"+"Vehicle Number is: "+car.vehicleNo+"\n"+
		"Number Of Tyres is: "+noOfTyres);
		
		System.out.println("Engine Number is: "+engine.engineNumber+"\n"+"Engine Type is: "+engine.engineType);
	}

}

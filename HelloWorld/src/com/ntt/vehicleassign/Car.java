package com.ntt.vehicleassign;

public class Car implements Vehicle{
	static Engine engine;
	String color;
	String company;
	String model;
	double price;

	public Car(String color, String company, String model, double price, Engine engine) {
		super();
		this.color = color;
		this.company = company;
		this.model = model;
		this.price = price;
		this.engine=engine;
	}

	@Override
	public void start(Vehicle v) {
		
		Car c=(Car)v;
		
		System.out.println("Car Started with:"+"\n"+"color: "+c.color+"\t"+"company: "+c.company+"\t"+"Model: "+c.model
				+"\t"+"Price: "+c.price+"\t");
		
		System.out.println("-----Engine Details----");
		System.out.println("Engine Type: "+engine.engineType+"\t"+"Fuel Type: "+engine.fuelType);
	}

	@Override
	public void stop(Vehicle v) {
		Car c=(Car)v;
		System.out.println("Car Stopped with:"+"\n"+"color: "+c.color+"\t"+"company: "+c.company+"\t"+"Model: "+c.model
				+"\t"+"Price: "+c.price+"\t");
		
		System.out.println("-----Engine Details----");
		System.out.println("Engine Type: "+Engine.engineType+"\t"+"Fuel Type: "+Engine.fuelType);
		
		
	}

}

package com.ntt.vehicleassign;

public class Bus implements Vehicle {
	
	static Engine engine;
	String color;
	String manCompany;
	String Travelname;
	double price;
	
	
	public Bus(String color, String manCompany, String travelname, double price, Engine engine) {
		super();
		this.color = color;
		this.manCompany = manCompany;
		Travelname = travelname;
		this.price = price;
		this.engine=engine;
	}
	
	@Override
	public void start(Vehicle v) {
		
		Bus b=(Bus)v;
		
		System.out.println("Bus Started with:"+"\n"+"color: "+b.color+"\t"+"Manufacturing company: "+b.manCompany+"\t"+
	"TravelName is: "+b.Travelname+"\t"+"Price: "+b.price+"\t");
		
		System.out.println("-----Engine Details----");
		System.out.println("Engine Type: "+engine.engineType+"\t"+"Fuel Type: "+engine.fuelType);
		
	}
	@Override
	public void stop(Vehicle v) {
		
		Bus b=(Bus)v;
		
		System.out.println("Bus Stopped with:"+"\n"+"color: "+b.color+"\t"+"Manufacturing company: "+b.manCompany+"\t"+
				"TravelName is: "+b.Travelname+"\t"+"Price: "+b.price+"\t");
					
					System.out.println("-----Engine Details----");
					System.out.println("Engine Type: "+engine.engineType+"\t"+"Fuel Type: "+engine.fuelType);
		
		
		
	}
	
	

}

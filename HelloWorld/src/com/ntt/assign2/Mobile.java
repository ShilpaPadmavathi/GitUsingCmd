package com.ntt.assign2;

import java.util.Scanner;

public class Mobile implements ElectronicDevice {
static Properties processor;
	String type;
	String company;
	int warranty;
	float price;
	
	public Mobile(String type, String company, int warranty, float price) {
		super();
		this.type = type;
		this.company = company;
		this.warranty = warranty;
		this.price = price;
	}

	@Override
	public void start(ElectronicDevice e) {
		System.out.println("Mobile Started");
		Mobile m=(Mobile)e;
		System.out.println("Type: "+m.type+"\n"+"Brand: "+m.company+"\n"+"Warranty: "+m.warranty+"\n"+"Price: "+m.price);
		System.out.println("Processor: "+Properties.Processor+"\n"+"Ram: "+Properties.Ram+"\n"+"System Type: "+Properties.systemType);
		
	}

	@Override
	public void stop(ElectronicDevice e) {
		System.out.println("Mobile Stopped");
		Mobile m=(Mobile)e;
		System.out.println("Type: "+m.type+"\n"+"Brand: "+m.company+"\n"+"Warranty: "+m.warranty+"\n"+"Price: "+m.price);
		System.out.println("Processor: "+Properties.Processor+"\n"+"Ram: "+Properties.Ram+"\n"+"System Type: "+Properties.systemType);
		
	}
	
}

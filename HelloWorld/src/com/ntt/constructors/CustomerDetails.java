package com.ntt.constructors;

public class CustomerDetails {
	
	int id;
	String name;
	long mobile;
	
	public CustomerDetails(int id, String name, long mobile) {
		this.id=id;
		this.name=name;
		this.mobile=mobile;
	}
	
	void display() {
		System.out.println("Customer Id is: "+id+"\n"+"Customer name is: "+name+"\n"+"Customer Mobile Number is: "+mobile);
	}

}

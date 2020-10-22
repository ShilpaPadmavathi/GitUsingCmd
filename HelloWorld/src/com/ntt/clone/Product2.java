package com.ntt.clone;

public class Product2 implements Cloneable{
	
	Product p1=new Product();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

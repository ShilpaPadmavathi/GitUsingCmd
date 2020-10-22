package com.ntt.productbean;

public class Display {
	public static void main(String[] args) {
		
		Customer c=new Customer();
		Product p=new Product();
		
		DAO d=new DAOImpl();
		d.customerDetails(c);
		d.productDetails(p);
		
		System.out.println("----CUSTOMER DETAILS-----");
		System.out.println("Customer Id: "+c.getCustId()+"\n"+"Customer name: "+c.getCustName()+"\n"+
				"Customer Mobile: "+c.getCustMob()+"\n");
		
		System.out.println("Product Id: "+p.getProdId()+"\n"+"Product Name: "+p.getProdName()+"\n"+
				"Product Discount: "+p.getDiscount()+"\n");
	}

}
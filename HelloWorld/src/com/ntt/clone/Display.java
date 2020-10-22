package com.ntt.clone;

public class Display  {
	
	public static void main(String[] args) {
		
		Product product1=new Product();
		
		product1.setProductId(1221);
		product1.setProductName("Shilpa");
		
		//Test2 t2 = (Test2)t1.clone(); 
		Product2 product2=new Product2();
		
		try {
			Product p2=(Product)product1.clone();
			System.out.println("Cloned Product"+p2.getProductId());
			
			Product p3=(Product)product1.clone();
			System.out.println("Cloned Product"+p3.getProductName());
			
			Product p4=(Product)product1.clone();
			System.out.println("Cloned Product"+p4.getProductId());
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
